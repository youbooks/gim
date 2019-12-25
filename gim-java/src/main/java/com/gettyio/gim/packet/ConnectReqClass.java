// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConnectReq.proto
package com.gettyio.gim.packet;

public final class ConnectReqClass {
	private ConnectReqClass() {
	}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public interface ConnectReqOrBuilder extends
	// @@protoc_insertion_point(interface_extends:ConnectReq)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <pre>
		 * 参数类型 参数名称=字段编码值
		 * </pre>
		 *
		 * <code>optional string senderId = 1;</code>
		 */
		String getSenderId();

		/**
		 * <pre>
		 * 参数类型 参数名称=字段编码值
		 * </pre>
		 *
		 * <code>optional string senderId = 1;</code>
		 */
		com.google.protobuf.ByteString getSenderIdBytes();
	}

	/**
	 * <pre>
	 * message是固定的。UserInfo是类名，可以随意指定，符合规范即可
	 * </pre>
	 *
	 * Protobuf type {@code ConnectReq}
	 */
	public static final class ConnectReq extends
			com.google.protobuf.GeneratedMessageV3 implements
	// @@protoc_insertion_point(message_implements:ConnectReq)
			ConnectReqOrBuilder {
		// Use ConnectReq.newBuilder() to construct.
		private ConnectReq(
				com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private ConnectReq() {
			senderId_ = "";
		}

		@Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private ConnectReq(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			int mutable_bitField0_ = 0;
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!input.skipField(tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						String s = input.readStringRequireUtf8();

						senderId_ = s;
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e)
						.setUnfinishedMessage(this);
			} finally {
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return ConnectReqClass.internal_static_ConnectReq_descriptor;
		}

		protected FieldAccessorTable internalGetFieldAccessorTable() {
			return ConnectReqClass.internal_static_ConnectReq_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							ConnectReq.class,
							Builder.class);
		}

		public static final int SENDERID_FIELD_NUMBER = 1;
		private volatile Object senderId_;

		/**
		 * <pre>
		 * 参数类型 参数名称=字段编码值
		 * </pre>
		 *
		 * <code>optional string senderId = 1;</code>
		 */
		public String getSenderId() {
			Object ref = senderId_;
			if (ref instanceof String) {
				return (String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				String s = bs.toStringUtf8();
				senderId_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 参数类型 参数名称=字段编码值
		 * </pre>
		 *
		 * <code>optional string senderId = 1;</code>
		 */
		public com.google.protobuf.ByteString getSenderIdBytes() {
			Object ref = senderId_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString
						.copyFromUtf8((String) ref);
				senderId_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output)
				throws java.io.IOException {
			if (!getSenderIdBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 1,
						senderId_);
			}
		}

		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1)
				return size;

			size = 0;
			if (!getSenderIdBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3
						.computeStringSize(1, senderId_);
			}
			memoizedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@Override
		public boolean equals(final Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof ConnectReq)) {
				return super.equals(obj);
			}
			ConnectReq other = (ConnectReq) obj;

			boolean result = true;
			result = result && getSenderId().equals(other.getSenderId());
			return result;
		}

		@Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptorForType().hashCode();
			hash = (37 * hash) + SENDERID_FIELD_NUMBER;
			hash = (53 * hash) + getSenderId().hashCode();
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public static ConnectReq parseFrom(
				com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static ConnectReq parseFrom(
				com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static ConnectReq parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static ConnectReq parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static ConnectReq parseFrom(
				java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
					PARSER, input);
		}

		public static ConnectReq parseFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
					PARSER, input, extensionRegistry);
		}

		public static ConnectReq parseDelimitedFrom(
				java.io.InputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseDelimitedWithIOException(PARSER, input);
		}

		public static ConnectReq parseDelimitedFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseDelimitedWithIOException(PARSER, input,
							extensionRegistry);
		}

		public static ConnectReq parseFrom(
				com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
					PARSER, input);
		}

		public static ConnectReq parseFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
					PARSER, input, extensionRegistry);
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(ConnectReq prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return this == DEFAULT_INSTANCE ? new Builder() : new Builder()
					.mergeFrom(this);
		}

		@Override
		protected Builder newBuilderForType(
				BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * <pre>
		 * message是固定的。UserInfo是类名，可以随意指定，符合规范即可
		 * </pre>
		 *
		 * Protobuf type {@code ConnectReq}
		 */
		public static final class Builder extends
				com.google.protobuf.GeneratedMessageV3.Builder<Builder>
				implements
				// @@protoc_insertion_point(builder_implements:ConnectReq)
				ConnectReqOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return ConnectReqClass.internal_static_ConnectReq_descriptor;
			}

			protected FieldAccessorTable internalGetFieldAccessorTable() {
				return ConnectReqClass.internal_static_ConnectReq_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								ConnectReq.class,
								Builder.class);
			}

			// Construct using ConnectReqClass.ConnectReq.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(
					BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
				}
			}

			public Builder clear() {
				super.clear();
				senderId_ = "";

				return this;
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return ConnectReqClass.internal_static_ConnectReq_descriptor;
			}

			public ConnectReq getDefaultInstanceForType() {
				return ConnectReq.getDefaultInstance();
			}

			public ConnectReq build() {
				ConnectReq result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public ConnectReq buildPartial() {
				ConnectReq result = new ConnectReq(
						this);
				result.senderId_ = senderId_;
				onBuilt();
				return result;
			}

			public Builder clone() {
				return (Builder) super.clone();
			}

			public Builder setField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					Object value) {
				return (Builder) super.setField(field, value);
			}

			public Builder clearField(
					com.google.protobuf.Descriptors.FieldDescriptor field) {
				return (Builder) super.clearField(field);
			}

			public Builder clearOneof(
					com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return (Builder) super.clearOneof(oneof);
			}

			public Builder setRepeatedField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					int index, Object value) {
				return (Builder) super.setRepeatedField(field, index, value);
			}

			public Builder addRepeatedField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					Object value) {
				return (Builder) super.addRepeatedField(field, value);
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof ConnectReq) {
					return mergeFrom((ConnectReq) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(ConnectReq other) {
				if (other == ConnectReq.getDefaultInstance())
					return this;
				if (!other.getSenderId().isEmpty()) {
					senderId_ = other.senderId_;
					onChanged();
				}
				onChanged();
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws java.io.IOException {
				ConnectReq parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input,
							extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (ConnectReq) e
							.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private Object senderId_ = "";

			/**
			 * <pre>
			 * 参数类型 参数名称=字段编码值
			 * </pre>
			 *
			 * <code>optional string senderId = 1;</code>
			 */
			public String getSenderId() {
				Object ref = senderId_;
				if (!(ref instanceof String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					String s = bs.toStringUtf8();
					senderId_ = s;
					return s;
				} else {
					return (String) ref;
				}
			}

			/**
			 * <pre>
			 * 参数类型 参数名称=字段编码值
			 * </pre>
			 *
			 * <code>optional string senderId = 1;</code>
			 */
			public com.google.protobuf.ByteString getSenderIdBytes() {
				Object ref = senderId_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((String) ref);
					senderId_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 参数类型 参数名称=字段编码值
			 * </pre>
			 *
			 * <code>optional string senderId = 1;</code>
			 */
			public Builder setSenderId(String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				senderId_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 参数类型 参数名称=字段编码值
			 * </pre>
			 *
			 * <code>optional string senderId = 1;</code>
			 */
			public Builder clearSenderId() {

				senderId_ = getDefaultInstance().getSenderId();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 参数类型 参数名称=字段编码值
			 * </pre>
			 *
			 * <code>optional string senderId = 1;</code>
			 */
			public Builder setSenderIdBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				senderId_ = value;
				onChanged();
				return this;
			}

			public final Builder setUnknownFields(
					final com.google.protobuf.UnknownFieldSet unknownFields) {
				return this;
			}

			public final Builder mergeUnknownFields(
					final com.google.protobuf.UnknownFieldSet unknownFields) {
				return this;
			}

			// @@protoc_insertion_point(builder_scope:ConnectReq)
		}

		// @@protoc_insertion_point(class_scope:ConnectReq)
		private static final ConnectReq DEFAULT_INSTANCE;
		static {
			DEFAULT_INSTANCE = new ConnectReq();
		}

		public static ConnectReq getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		private static final com.google.protobuf.Parser<ConnectReq> PARSER = new com.google.protobuf.AbstractParser<ConnectReq>() {
			public ConnectReq parsePartialFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new ConnectReq(input, extensionRegistry);
			}
		};

		public static com.google.protobuf.Parser<ConnectReq> parser() {
			return PARSER;
		}

		@Override
		public com.google.protobuf.Parser<ConnectReq> getParserForType() {
			return PARSER;
		}

		public ConnectReq getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_ConnectReq_descriptor;
	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ConnectReq_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		String[] descriptorData = { "\n\020ConnectReq.proto\"\036\n\nConnectReq\022\020\n\010send"
				+ "erId\030\001 \001(\tB\021B\017ConnectReqClassb\006proto3" };
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor
				.internalBuildGeneratedFileFrom(
						descriptorData,
						new com.google.protobuf.Descriptors.FileDescriptor[] {},
						assigner);
		internal_static_ConnectReq_descriptor = getDescriptor()
				.getMessageTypes().get(0);
		internal_static_ConnectReq_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_ConnectReq_descriptor,
				new String[] { "SenderId", });
	}

	// @@protoc_insertion_point(outer_class_scope)
}
