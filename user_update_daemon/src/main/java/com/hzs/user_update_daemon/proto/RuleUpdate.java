// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/rule_update.proto

package com.hzs.user_update_daemon.proto;

/**
 * Protobuf type {@code com.example.demo.proto.RuleUpdate}
 */
public final class RuleUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.demo.proto.RuleUpdate)
    RuleUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuleUpdate.newBuilder() to construct.
  private RuleUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuleUpdate() {
    ruleId_ = "";
    ruleName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuleUpdate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RuleUpdateProto.internal_static_com_example_demo_proto_RuleUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RuleUpdateProto.internal_static_com_example_demo_proto_RuleUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RuleUpdate.class, RuleUpdate.Builder.class);
  }

  public static final int RULE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleId_ = "";
  /**
   * <code>string rule_id = 1;</code>
   * @return The ruleId.
   */
  @java.lang.Override
  public java.lang.String getRuleId() {
    java.lang.Object ref = ruleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleId_ = s;
      return s;
    }
  }
  /**
   * <code>string rule_id = 1;</code>
   * @return The bytes for ruleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRuleIdBytes() {
    java.lang.Object ref = ruleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ruleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULE_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleName_ = "";
  /**
   * <code>string rule_name = 2;</code>
   * @return The ruleName.
   */
  @java.lang.Override
  public java.lang.String getRuleName() {
    java.lang.Object ref = ruleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleName_ = s;
      return s;
    }
  }
  /**
   * <code>string rule_name = 2;</code>
   * @return The bytes for ruleName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRuleNameBytes() {
    java.lang.Object ref = ruleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ruleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULE_VERSION_FIELD_NUMBER = 3;
  private int ruleVersion_ = 0;
  /**
   * <code>int32 rule_version = 3;</code>
   * @return The ruleVersion.
   */
  @java.lang.Override
  public int getRuleVersion() {
    return ruleVersion_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ruleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ruleName_);
    }
    if (ruleVersion_ != 0) {
      output.writeInt32(3, ruleVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ruleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ruleName_);
    }
    if (ruleVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ruleVersion_);
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
    if (!(obj instanceof RuleUpdate)) {
      return super.equals(obj);
    }
    RuleUpdate other = (RuleUpdate) obj;

    if (!getRuleId()
        .equals(other.getRuleId())) return false;
    if (!getRuleName()
        .equals(other.getRuleName())) return false;
    if (getRuleVersion()
        != other.getRuleVersion()) return false;
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
    hash = (37 * hash) + RULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleId().hashCode();
    hash = (37 * hash) + RULE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRuleName().hashCode();
    hash = (37 * hash) + RULE_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getRuleVersion();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RuleUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RuleUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RuleUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RuleUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RuleUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RuleUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RuleUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RuleUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static RuleUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static RuleUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RuleUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RuleUpdate parseFrom(
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
  public static Builder newBuilder(RuleUpdate prototype) {
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
   * Protobuf type {@code com.example.demo.proto.RuleUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.demo.proto.RuleUpdate)
          RuleUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RuleUpdateProto.internal_static_com_example_demo_proto_RuleUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RuleUpdateProto.internal_static_com_example_demo_proto_RuleUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RuleUpdate.class, RuleUpdate.Builder.class);
    }

    // Construct using com.example.demo.proto.RuleUpdate.newBuilder()
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
      ruleId_ = "";
      ruleName_ = "";
      ruleVersion_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RuleUpdateProto.internal_static_com_example_demo_proto_RuleUpdate_descriptor;
    }

    @java.lang.Override
    public RuleUpdate getDefaultInstanceForType() {
      return RuleUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public RuleUpdate build() {
      RuleUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public RuleUpdate buildPartial() {
      RuleUpdate result = new RuleUpdate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(RuleUpdate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ruleId_ = ruleId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ruleName_ = ruleName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ruleVersion_ = ruleVersion_;
      }
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
      if (other instanceof RuleUpdate) {
        return mergeFrom((RuleUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RuleUpdate other) {
      if (other == RuleUpdate.getDefaultInstance()) return this;
      if (!other.getRuleId().isEmpty()) {
        ruleId_ = other.ruleId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRuleName().isEmpty()) {
        ruleName_ = other.ruleName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getRuleVersion() != 0) {
        setRuleVersion(other.getRuleVersion());
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
              ruleId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ruleName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              ruleVersion_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object ruleId_ = "";
    /**
     * <code>string rule_id = 1;</code>
     * @return The ruleId.
     */
    public java.lang.String getRuleId() {
      java.lang.Object ref = ruleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rule_id = 1;</code>
     * @return The bytes for ruleId.
     */
    public com.google.protobuf.ByteString
        getRuleIdBytes() {
      java.lang.Object ref = ruleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rule_id = 1;</code>
     * @param value The ruleId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ruleId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string rule_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRuleId() {
      ruleId_ = getDefaultInstance().getRuleId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string rule_id = 1;</code>
     * @param value The bytes for ruleId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ruleId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ruleName_ = "";
    /**
     * <code>string rule_name = 2;</code>
     * @return The ruleName.
     */
    public java.lang.String getRuleName() {
      java.lang.Object ref = ruleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rule_name = 2;</code>
     * @return The bytes for ruleName.
     */
    public com.google.protobuf.ByteString
        getRuleNameBytes() {
      java.lang.Object ref = ruleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rule_name = 2;</code>
     * @param value The ruleName to set.
     * @return This builder for chaining.
     */
    public Builder setRuleName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ruleName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string rule_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRuleName() {
      ruleName_ = getDefaultInstance().getRuleName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string rule_name = 2;</code>
     * @param value The bytes for ruleName to set.
     * @return This builder for chaining.
     */
    public Builder setRuleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ruleName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int ruleVersion_ ;
    /**
     * <code>int32 rule_version = 3;</code>
     * @return The ruleVersion.
     */
    @java.lang.Override
    public int getRuleVersion() {
      return ruleVersion_;
    }
    /**
     * <code>int32 rule_version = 3;</code>
     * @param value The ruleVersion to set.
     * @return This builder for chaining.
     */
    public Builder setRuleVersion(int value) {

      ruleVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rule_version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRuleVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ruleVersion_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.example.demo.proto.RuleUpdate)
  }

  // @@protoc_insertion_point(class_scope:com.example.demo.proto.RuleUpdate)
  private static final RuleUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RuleUpdate();
  }

  public static RuleUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuleUpdate>
      PARSER = new com.google.protobuf.AbstractParser<RuleUpdate>() {
    @java.lang.Override
    public RuleUpdate parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuleUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuleUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public RuleUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

