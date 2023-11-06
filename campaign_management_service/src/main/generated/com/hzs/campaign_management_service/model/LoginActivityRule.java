// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rule.proto

package com.hzs.campaign_management_service.model;

/**
 * Protobuf type {@code LoginActivityRule}
 */
public  final class LoginActivityRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LoginActivityRule)
    LoginActivityRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoginActivityRule.newBuilder() to construct.
  private LoginActivityRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginActivityRule() {
    lastLoginDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoginActivityRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoginActivityRule(
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

            lastLoginDate_ = s;
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
    return com.hzs.campaign_management_service.model.RuleProto.internal_static_LoginActivityRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hzs.campaign_management_service.model.RuleProto.internal_static_LoginActivityRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hzs.campaign_management_service.model.LoginActivityRule.class, com.hzs.campaign_management_service.model.LoginActivityRule.Builder.class);
  }

  public static final int LAST_LOGIN_DATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object lastLoginDate_;
  /**
   * <code>string last_login_date = 1;</code>
   * @return The lastLoginDate.
   */
  public java.lang.String getLastLoginDate() {
    java.lang.Object ref = lastLoginDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastLoginDate_ = s;
      return s;
    }
  }
  /**
   * <code>string last_login_date = 1;</code>
   * @return The bytes for lastLoginDate.
   */
  public com.google.protobuf.ByteString
      getLastLoginDateBytes() {
    java.lang.Object ref = lastLoginDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastLoginDate_ = b;
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
    if (!getLastLoginDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lastLoginDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLastLoginDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lastLoginDate_);
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
    if (!(obj instanceof com.hzs.campaign_management_service.model.LoginActivityRule)) {
      return super.equals(obj);
    }
    com.hzs.campaign_management_service.model.LoginActivityRule other = (com.hzs.campaign_management_service.model.LoginActivityRule) obj;

    if (!getLastLoginDate()
        .equals(other.getLastLoginDate())) return false;
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
    hash = (37 * hash) + LAST_LOGIN_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getLastLoginDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.campaign_management_service.model.LoginActivityRule parseFrom(
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
  public static Builder newBuilder(com.hzs.campaign_management_service.model.LoginActivityRule prototype) {
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
   * Protobuf type {@code LoginActivityRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LoginActivityRule)
      com.hzs.campaign_management_service.model.LoginActivityRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hzs.campaign_management_service.model.RuleProto.internal_static_LoginActivityRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hzs.campaign_management_service.model.RuleProto.internal_static_LoginActivityRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hzs.campaign_management_service.model.LoginActivityRule.class, com.hzs.campaign_management_service.model.LoginActivityRule.Builder.class);
    }

    // Construct using com.hzs.campaign_management_service.model.LoginActivityRule.newBuilder()
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
      lastLoginDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hzs.campaign_management_service.model.RuleProto.internal_static_LoginActivityRule_descriptor;
    }

    @java.lang.Override
    public com.hzs.campaign_management_service.model.LoginActivityRule getDefaultInstanceForType() {
      return com.hzs.campaign_management_service.model.LoginActivityRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.hzs.campaign_management_service.model.LoginActivityRule build() {
      com.hzs.campaign_management_service.model.LoginActivityRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hzs.campaign_management_service.model.LoginActivityRule buildPartial() {
      com.hzs.campaign_management_service.model.LoginActivityRule result = new com.hzs.campaign_management_service.model.LoginActivityRule(this);
      result.lastLoginDate_ = lastLoginDate_;
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
      if (other instanceof com.hzs.campaign_management_service.model.LoginActivityRule) {
        return mergeFrom((com.hzs.campaign_management_service.model.LoginActivityRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hzs.campaign_management_service.model.LoginActivityRule other) {
      if (other == com.hzs.campaign_management_service.model.LoginActivityRule.getDefaultInstance()) return this;
      if (!other.getLastLoginDate().isEmpty()) {
        lastLoginDate_ = other.lastLoginDate_;
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
      com.hzs.campaign_management_service.model.LoginActivityRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hzs.campaign_management_service.model.LoginActivityRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object lastLoginDate_ = "";
    /**
     * <code>string last_login_date = 1;</code>
     * @return The lastLoginDate.
     */
    public java.lang.String getLastLoginDate() {
      java.lang.Object ref = lastLoginDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastLoginDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string last_login_date = 1;</code>
     * @return The bytes for lastLoginDate.
     */
    public com.google.protobuf.ByteString
        getLastLoginDateBytes() {
      java.lang.Object ref = lastLoginDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastLoginDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string last_login_date = 1;</code>
     * @param value The lastLoginDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastLoginDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastLoginDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string last_login_date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastLoginDate() {
      
      lastLoginDate_ = getDefaultInstance().getLastLoginDate();
      onChanged();
      return this;
    }
    /**
     * <code>string last_login_date = 1;</code>
     * @param value The bytes for lastLoginDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastLoginDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastLoginDate_ = value;
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


    // @@protoc_insertion_point(builder_scope:LoginActivityRule)
  }

  // @@protoc_insertion_point(class_scope:LoginActivityRule)
  private static final com.hzs.campaign_management_service.model.LoginActivityRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hzs.campaign_management_service.model.LoginActivityRule();
  }

  public static com.hzs.campaign_management_service.model.LoginActivityRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginActivityRule>
      PARSER = new com.google.protobuf.AbstractParser<LoginActivityRule>() {
    @java.lang.Override
    public LoginActivityRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginActivityRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginActivityRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoginActivityRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hzs.campaign_management_service.model.LoginActivityRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
