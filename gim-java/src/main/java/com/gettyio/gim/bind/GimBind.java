/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gettyio.gim.bind;

import com.gettyio.core.channel.SocketChannel;
import com.gettyio.gim.server.GimContext;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * GimBind.java
 *
 * @description:绑定类
 * @author:gogym
 * @date:2020/4/9
 * @copyright: Copyright by gettyio.com
 */
public class GimBind {

    private GimContext gimContext;

    public GimBind(GimContext gimContext) {
        this.gimContext = gimContext;
    }

    /**
     * Description: 用户与连接绑定
     *
     * @param userId
     * @param channel
     * @see
     */
    public void bindUser(String userId, SocketChannel channel) {
        gimContext.userChannelMap.put(userId, channel.getChannelId());

        if (gimContext.gimConfig.isEnableCluster()) {
            //如果开启了集群，设置集群路由
            gimContext.clusterRoute.setUserRoute(userId);
        }
    }

    /**
     * Description: 解绑用户
     *
     * @param userId
     * @see
     */
    public void unbindUser(String userId) {
        gimContext.userChannelMap.remove(userId);
        if (gimContext.gimConfig.isEnableCluster()) {
            //如果开启了集群，设置集群路由
            gimContext.clusterRoute.delUserRoute(userId);
        }
    }


    /**
     * 解绑用户
     *
     * @param channelId
     */
    public void unbindUserByChannelId(String channelId) {

        if (gimContext.gimConfig.isEnableCluster()) {
            for (String key : gimContext.userChannelMap.keySet()) {
                if (gimContext.userChannelMap.get(key).equals(channelId)) {
                    gimContext.clusterRoute.delUserRoute(key);
                }
            }
        }

        Collection<String> col = gimContext.userChannelMap.values();
        while (true == col.contains(channelId)) {
            col.remove(channelId);
        }

    }


    /**
     * 绑定群组
     *
     * @param userId
     * @param groupId
     * @return void
     */
    public void bindGroup(String groupId, String userId) throws Exception {
        if (!gimContext.gimConfig.isEnableCluster()) {
            //非集群
            CopyOnWriteArrayList<String> list = gimContext.groupUserMap.get(groupId);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                list.add(userId);
                gimContext.groupUserMap.put(groupId, list);
            } else {
                list.add(userId);
            }
        } else {
            //集群，添加到redis
            gimContext.clusterRoute.setGroupRoute(groupId, userId);
        }
    }

    public void bindGroup(String groupId, List<String> users) throws Exception {

        if (!gimContext.gimConfig.isEnableCluster()) {
            //非集群
            CopyOnWriteArrayList<String> list = gimContext.groupUserMap.get(groupId);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                list.addAll(users);
                gimContext.groupUserMap.put(groupId, list);
            } else {
                list.addAll(users);
            }
        } else {
            //集群形式，添加到redis
            gimContext.clusterRoute.setGroupRoute(groupId, users);
        }
    }


    /**
     * 移除群绑定
     *
     * @param groupId
     * @param userId
     * @return void
     */
    public void delGroup(String groupId, String userId) throws Exception {

        if (!gimContext.gimConfig.isEnableCluster()) {
            //非集群
            CopyOnWriteArrayList<String> list = gimContext.groupUserMap.get(groupId);
            if (list == null) {
                return;
            }
            //移除
            list.remove(userId);
        } else {
            gimContext.clusterRoute.delGroupRoute(groupId, userId);
        }
    }


    public void delGroup(String groupId, List<String> users) throws Exception {

        if (!gimContext.gimConfig.isEnableCluster()) {
            //非集群
            CopyOnWriteArrayList<String> list = gimContext.groupUserMap.get(groupId);
            if (list == null) {
                return;
            }
            //移除
            list.removeAll(users);
        } else {
            gimContext.clusterRoute.delGroupRoute(groupId, users);
        }
    }

    /**
     * 清理群组
     *
     * @param groupId
     * @return void
     */
    public void clearGroup(String groupId) throws Exception {
        if (!gimContext.gimConfig.isEnableCluster()) {
            gimContext.groupUserMap.remove(groupId);
        } else {
            gimContext.clusterRoute.clearGroupRoute(groupId);
        }
    }


    /**
     * 清理全部群组
     *
     * @throws Exception
     */
    public void clearGroupAll() throws Exception {

        if (!gimContext.gimConfig.isEnableCluster()) {
            gimContext.groupUserMap.clear();
        } else {
            gimContext.clusterRoute.clearAllGroupRoute();
        }

    }

}
