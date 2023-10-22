// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.SegServe.proto;

/**
 * <pre>
 * Represents a Login Activity Rule
 * </pre>
 *
 * Protobuf type {@code com.hzs.SegServe.proto.LoginActivityRule}
 */
public final class LoginActivityRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.hzs.SegServe.proto.LoginActivityRule)
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

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hzs.SegServe.proto.CampaignProto.internal_static_com_hzs_SegServe_proto_LoginActivityRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hzs.SegServe.proto.CampaignProto.internal_static_com_hzs_SegServe_proto_LoginActivityRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hzs.SegServe.proto.LoginActivityRule.class, com.hzs.SegServe.proto.LoginActivityRule.Builder.class);
  }

  private int bitField0_;
  public static final int LAST_LOGIN_DATE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object lastLoginDate_ = "";
  /**
   * <code>optional string last_login_date = 1;</code>
   * @return Whether the lastLoginDate field is set.
   */
  @java.lang.Override
  public boolean hasLastLoginDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string last_login_date = 1;</code>
   * @return The lastLoginDate.
   */
  @java.lang.Override
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
   * <code>optional string last_login_date = 1;</code>
   * @return The bytes for lastLoginDate.
   */
  @java.lang.Override
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lastLoginDate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lastLoginDate_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hzs.SegServe.proto.LoginActivityRule)) {
      return super.equals(obj);
    }
    com.hzs.SegServe.proto.LoginActivityRule other = (com.hzs.SegServe.proto.LoginActivityRule) obj;

    if (hasLastLoginDate() != other.hasLastLoginDate()) return false;
    if (hasLastLoginDate()) {
      if (!getLastLoginDate()
          .equals(other.getLastLoginDate())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLastLoginDate()) {
      hash = (37 * hash) + LAST_LOGIN_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getLastLoginDate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hzs.SegServe.proto.LoginActivityRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hzs.SegServe.proto.LoginActivityRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.SegServe.proto.LoginActivityRule parseFrom(
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
  public static Builder newBuilder(com.hzs.SegServe.proto.LoginActivityRule prototype) {
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
   * <pre>
   * Represents a Login Activity Rule
   * </pre>
   *
   * Protobuf type {@code com.hzs.SegServe.proto.LoginActivityRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hzs.SegServe.proto.LoginActivityRule)
      com.hzs.SegServe.proto.LoginActivityRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hzs.SegServe.proto.CampaignProto.internal_static_com_hzs_SegServe_proto_LoginActivityRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hzs.SegServe.proto.CampaignProto.internal_static_com_hzs_SegServe_proto_LoginActivityRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hzs.SegServe.proto.LoginActivityRule.class, com.hzs.SegServe.proto.LoginActivityRule.Builder.class);
    }

    // Construct using com.hzs.SegServe.proto.LoginActivityRule.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      lastLoginDate_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hzs.SegServe.proto.CampaignProto.internal_static_com_hzs_SegServe_proto_LoginActivityRule_descriptor;
    }

    @java.lang.Override
    public com.hzs.SegServe.proto.LoginActivityRule getDefaultInstanceForType() {
      return com.hzs.SegServe.proto.LoginActivityRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.hzs.SegServe.proto.LoginActivityRule build() {
      com.hzs.SegServe.proto.LoginActivityRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hzs.SegServe.proto.LoginActivityRule buildPartial() {
      com.hzs.SegServe.proto.LoginActivityRule result = new com.hzs.SegServe.proto.LoginActivityRule(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hzs.SegServe.proto.LoginActivityRule result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lastLoginDate_ = lastLoginDate_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.hzs.SegServe.proto.LoginActivityRule) {
        return mergeFrom((com.hzs.SegServe.proto.LoginActivityRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hzs.SegServe.proto.LoginActivityRule other) {
      if (other == com.hzs.SegServe.proto.LoginActivityRule.getDefaultInstance()) return this;
      if (other.hasLastLoginDate()) {
        lastLoginDate_ = other.lastLoginDate_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              lastLoginDate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object lastLoginDate_ = "";
    /**
     * <code>optional string last_login_date = 1;</code>
     * @return Whether the lastLoginDate field is set.
     */
    public boolean hasLastLoginDate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string last_login_date = 1;</code>
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
     * <code>optional string last_login_date = 1;</code>
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
     * <code>optional string last_login_date = 1;</code>
     * @param value The lastLoginDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastLoginDate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      lastLoginDate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string last_login_date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastLoginDate() {
      lastLoginDate_ = getDefaultInstance().getLastLoginDate();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string last_login_date = 1;</code>
     * @param value The bytes for lastLoginDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastLoginDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      lastLoginDate_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:com.hzs.SegServe.proto.LoginActivityRule)
  }

  // @@protoc_insertion_point(class_scope:com.hzs.SegServe.proto.LoginActivityRule)
  private static final com.hzs.SegServe.proto.LoginActivityRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hzs.SegServe.proto.LoginActivityRule();
  }

  public static com.hzs.SegServe.proto.LoginActivityRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginActivityRule>
      PARSER = new com.google.protobuf.AbstractParser<LoginActivityRule>() {
    @java.lang.Override
    public LoginActivityRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
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
  public com.hzs.SegServe.proto.LoginActivityRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

