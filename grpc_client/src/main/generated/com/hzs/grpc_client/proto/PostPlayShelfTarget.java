// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.grpc_client.proto;

/**
 * Protobuf type {@code com.hzs.grpc_client.proto.PostPlayShelfTarget}
 */
public  final class PostPlayShelfTarget extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.hzs.grpc_client.proto.PostPlayShelfTarget)
    PostPlayShelfTargetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostPlayShelfTarget.newBuilder() to construct.
  private PostPlayShelfTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostPlayShelfTarget() {
    contentId_ = "";
    shelfId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostPlayShelfTarget();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostPlayShelfTarget(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            contentId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            shelfId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_PostPlayShelfTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_PostPlayShelfTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hzs.grpc_client.proto.PostPlayShelfTarget.class, com.hzs.grpc_client.proto.PostPlayShelfTarget.Builder.class);
  }

  public static final int CONTENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object contentId_;
  /**
   * <code>string content_id = 1;</code>
   * @return The contentId.
   */
  public java.lang.String getContentId() {
    java.lang.Object ref = contentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentId_ = s;
      return s;
    }
  }
  /**
   * <code>string content_id = 1;</code>
   * @return The bytes for contentId.
   */
  public com.google.protobuf.ByteString
      getContentIdBytes() {
    java.lang.Object ref = contentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHELF_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object shelfId_;
  /**
   * <code>string shelf_id = 2;</code>
   * @return The shelfId.
   */
  public java.lang.String getShelfId() {
    java.lang.Object ref = shelfId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shelfId_ = s;
      return s;
    }
  }
  /**
   * <code>string shelf_id = 2;</code>
   * @return The bytes for shelfId.
   */
  public com.google.protobuf.ByteString
      getShelfIdBytes() {
    java.lang.Object ref = shelfId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shelfId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getContentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contentId_);
    }
    if (!getShelfIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, shelfId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getContentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contentId_);
    }
    if (!getShelfIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, shelfId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hzs.grpc_client.proto.PostPlayShelfTarget)) {
      return super.equals(obj);
    }
    com.hzs.grpc_client.proto.PostPlayShelfTarget other = (com.hzs.grpc_client.proto.PostPlayShelfTarget) obj;

    if (!getContentId()
        .equals(other.getContentId())) return false;
    if (!getShelfId()
        .equals(other.getShelfId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONTENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getContentId().hashCode();
    hash = (37 * hash) + SHELF_ID_FIELD_NUMBER;
    hash = (53 * hash) + getShelfId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_client.proto.PostPlayShelfTarget parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hzs.grpc_client.proto.PostPlayShelfTarget prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.hzs.grpc_client.proto.PostPlayShelfTarget}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hzs.grpc_client.proto.PostPlayShelfTarget)
      com.hzs.grpc_client.proto.PostPlayShelfTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_PostPlayShelfTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_PostPlayShelfTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hzs.grpc_client.proto.PostPlayShelfTarget.class, com.hzs.grpc_client.proto.PostPlayShelfTarget.Builder.class);
    }

    // Construct using com.hzs.grpc_client.proto.PostPlayShelfTarget.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      contentId_ = "";

      shelfId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_PostPlayShelfTarget_descriptor;
    }

    @java.lang.Override
    public com.hzs.grpc_client.proto.PostPlayShelfTarget getDefaultInstanceForType() {
      return com.hzs.grpc_client.proto.PostPlayShelfTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.hzs.grpc_client.proto.PostPlayShelfTarget build() {
      com.hzs.grpc_client.proto.PostPlayShelfTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hzs.grpc_client.proto.PostPlayShelfTarget buildPartial() {
      com.hzs.grpc_client.proto.PostPlayShelfTarget result = new com.hzs.grpc_client.proto.PostPlayShelfTarget(this);
      result.contentId_ = contentId_;
      result.shelfId_ = shelfId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hzs.grpc_client.proto.PostPlayShelfTarget) {
        return mergeFrom((com.hzs.grpc_client.proto.PostPlayShelfTarget)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hzs.grpc_client.proto.PostPlayShelfTarget other) {
      if (other == com.hzs.grpc_client.proto.PostPlayShelfTarget.getDefaultInstance()) return this;
      if (!other.getContentId().isEmpty()) {
        contentId_ = other.contentId_;
        onChanged();
      }
      if (!other.getShelfId().isEmpty()) {
        shelfId_ = other.shelfId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hzs.grpc_client.proto.PostPlayShelfTarget parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hzs.grpc_client.proto.PostPlayShelfTarget) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object contentId_ = "";
    /**
     * <code>string content_id = 1;</code>
     * @return The contentId.
     */
    public java.lang.String getContentId() {
      java.lang.Object ref = contentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content_id = 1;</code>
     * @return The bytes for contentId.
     */
    public com.google.protobuf.ByteString
        getContentIdBytes() {
      java.lang.Object ref = contentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content_id = 1;</code>
     * @param value The contentId to set.
     * @return This builder for chaining.
     */
    public Builder setContentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContentId() {
      
      contentId_ = getDefaultInstance().getContentId();
      onChanged();
      return this;
    }
    /**
     * <code>string content_id = 1;</code>
     * @param value The bytes for contentId to set.
     * @return This builder for chaining.
     */
    public Builder setContentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      contentId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object shelfId_ = "";
    /**
     * <code>string shelf_id = 2;</code>
     * @return The shelfId.
     */
    public java.lang.String getShelfId() {
      java.lang.Object ref = shelfId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shelfId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string shelf_id = 2;</code>
     * @return The bytes for shelfId.
     */
    public com.google.protobuf.ByteString
        getShelfIdBytes() {
      java.lang.Object ref = shelfId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shelfId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string shelf_id = 2;</code>
     * @param value The shelfId to set.
     * @return This builder for chaining.
     */
    public Builder setShelfId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      shelfId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string shelf_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearShelfId() {
      
      shelfId_ = getDefaultInstance().getShelfId();
      onChanged();
      return this;
    }
    /**
     * <code>string shelf_id = 2;</code>
     * @param value The bytes for shelfId to set.
     * @return This builder for chaining.
     */
    public Builder setShelfIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      shelfId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.hzs.grpc_client.proto.PostPlayShelfTarget)
  }

  // @@protoc_insertion_point(class_scope:com.hzs.grpc_client.proto.PostPlayShelfTarget)
  private static final com.hzs.grpc_client.proto.PostPlayShelfTarget DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hzs.grpc_client.proto.PostPlayShelfTarget();
  }

  public static com.hzs.grpc_client.proto.PostPlayShelfTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostPlayShelfTarget>
      PARSER = new com.google.protobuf.AbstractParser<PostPlayShelfTarget>() {
    @java.lang.Override
    public PostPlayShelfTarget parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostPlayShelfTarget(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostPlayShelfTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostPlayShelfTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hzs.grpc_client.proto.PostPlayShelfTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
