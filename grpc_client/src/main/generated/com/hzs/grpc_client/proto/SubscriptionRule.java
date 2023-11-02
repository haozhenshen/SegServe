// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.grpc_client.proto;

/**
 * Protobuf type {@code com.hzs.grpc_client.proto.SubscriptionRule}
 */
public  final class SubscriptionRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.hzs.grpc_client.proto.SubscriptionRule)
    SubscriptionRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscriptionRule.newBuilder() to construct.
  private SubscriptionRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscriptionRule() {
    subscriptionId_ = "";
    planName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubscriptionRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubscriptionRule(
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

            subscriptionId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            planName_ = s;
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
    return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_SubscriptionRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_SubscriptionRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hzs.grpc_client.proto.SubscriptionRule.class, com.hzs.grpc_client.proto.SubscriptionRule.Builder.class);
  }

  public static final int SUBSCRIPTION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object subscriptionId_;
  /**
   * <code>string subscription_id = 1;</code>
   * @return The subscriptionId.
   */
  public java.lang.String getSubscriptionId() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriptionId_ = s;
      return s;
    }
  }
  /**
   * <code>string subscription_id = 1;</code>
   * @return The bytes for subscriptionId.
   */
  public com.google.protobuf.ByteString
      getSubscriptionIdBytes() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscriptionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAN_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object planName_;
  /**
   * <code>string plan_name = 2;</code>
   * @return The planName.
   */
  public java.lang.String getPlanName() {
    java.lang.Object ref = planName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      planName_ = s;
      return s;
    }
  }
  /**
   * <code>string plan_name = 2;</code>
   * @return The bytes for planName.
   */
  public com.google.protobuf.ByteString
      getPlanNameBytes() {
    java.lang.Object ref = planName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      planName_ = b;
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
    if (!getSubscriptionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscriptionId_);
    }
    if (!getPlanNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, planName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubscriptionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscriptionId_);
    }
    if (!getPlanNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, planName_);
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
    if (!(obj instanceof com.hzs.grpc_client.proto.SubscriptionRule)) {
      return super.equals(obj);
    }
    com.hzs.grpc_client.proto.SubscriptionRule other = (com.hzs.grpc_client.proto.SubscriptionRule) obj;

    if (!getSubscriptionId()
        .equals(other.getSubscriptionId())) return false;
    if (!getPlanName()
        .equals(other.getPlanName())) return false;
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
    hash = (37 * hash) + SUBSCRIPTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriptionId().hashCode();
    hash = (37 * hash) + PLAN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPlanName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_client.proto.SubscriptionRule parseFrom(
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
  public static Builder newBuilder(com.hzs.grpc_client.proto.SubscriptionRule prototype) {
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
   * Protobuf type {@code com.hzs.grpc_client.proto.SubscriptionRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hzs.grpc_client.proto.SubscriptionRule)
      com.hzs.grpc_client.proto.SubscriptionRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_SubscriptionRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_SubscriptionRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hzs.grpc_client.proto.SubscriptionRule.class, com.hzs.grpc_client.proto.SubscriptionRule.Builder.class);
    }

    // Construct using com.hzs.grpc_client.proto.SubscriptionRule.newBuilder()
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
      subscriptionId_ = "";

      planName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hzs.grpc_client.proto.CampaignProto.internal_static_com_hzs_grpc_client_proto_SubscriptionRule_descriptor;
    }

    @java.lang.Override
    public com.hzs.grpc_client.proto.SubscriptionRule getDefaultInstanceForType() {
      return com.hzs.grpc_client.proto.SubscriptionRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.hzs.grpc_client.proto.SubscriptionRule build() {
      com.hzs.grpc_client.proto.SubscriptionRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hzs.grpc_client.proto.SubscriptionRule buildPartial() {
      com.hzs.grpc_client.proto.SubscriptionRule result = new com.hzs.grpc_client.proto.SubscriptionRule(this);
      result.subscriptionId_ = subscriptionId_;
      result.planName_ = planName_;
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
      if (other instanceof com.hzs.grpc_client.proto.SubscriptionRule) {
        return mergeFrom((com.hzs.grpc_client.proto.SubscriptionRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hzs.grpc_client.proto.SubscriptionRule other) {
      if (other == com.hzs.grpc_client.proto.SubscriptionRule.getDefaultInstance()) return this;
      if (!other.getSubscriptionId().isEmpty()) {
        subscriptionId_ = other.subscriptionId_;
        onChanged();
      }
      if (!other.getPlanName().isEmpty()) {
        planName_ = other.planName_;
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
      com.hzs.grpc_client.proto.SubscriptionRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hzs.grpc_client.proto.SubscriptionRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subscriptionId_ = "";
    /**
     * <code>string subscription_id = 1;</code>
     * @return The subscriptionId.
     */
    public java.lang.String getSubscriptionId() {
      java.lang.Object ref = subscriptionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriptionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @return The bytes for subscriptionId.
     */
    public com.google.protobuf.ByteString
        getSubscriptionIdBytes() {
      java.lang.Object ref = subscriptionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscriptionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @param value The subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscriptionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubscriptionId() {
      
      subscriptionId_ = getDefaultInstance().getSubscriptionId();
      onChanged();
      return this;
    }
    /**
     * <code>string subscription_id = 1;</code>
     * @param value The bytes for subscriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscriptionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object planName_ = "";
    /**
     * <code>string plan_name = 2;</code>
     * @return The planName.
     */
    public java.lang.String getPlanName() {
      java.lang.Object ref = planName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        planName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plan_name = 2;</code>
     * @return The bytes for planName.
     */
    public com.google.protobuf.ByteString
        getPlanNameBytes() {
      java.lang.Object ref = planName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        planName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plan_name = 2;</code>
     * @param value The planName to set.
     * @return This builder for chaining.
     */
    public Builder setPlanName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      planName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string plan_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlanName() {
      
      planName_ = getDefaultInstance().getPlanName();
      onChanged();
      return this;
    }
    /**
     * <code>string plan_name = 2;</code>
     * @param value The bytes for planName to set.
     * @return This builder for chaining.
     */
    public Builder setPlanNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      planName_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.hzs.grpc_client.proto.SubscriptionRule)
  }

  // @@protoc_insertion_point(class_scope:com.hzs.grpc_client.proto.SubscriptionRule)
  private static final com.hzs.grpc_client.proto.SubscriptionRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hzs.grpc_client.proto.SubscriptionRule();
  }

  public static com.hzs.grpc_client.proto.SubscriptionRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscriptionRule>
      PARSER = new com.google.protobuf.AbstractParser<SubscriptionRule>() {
    @java.lang.Override
    public SubscriptionRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubscriptionRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubscriptionRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscriptionRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hzs.grpc_client.proto.SubscriptionRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

