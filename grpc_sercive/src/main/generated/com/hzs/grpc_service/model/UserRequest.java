// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign_grpc_service.proto

package com.hzs.grpc_service.model;

/**
 * Protobuf type {@code model.UserRequest}
 */
public  final class UserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.UserRequest)
    UserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserRequest.newBuilder() to construct.
  private UserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRequest() {
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserRequest(
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

            userId_ = s;
            break;
          }
          case 18: {
            com.hzs.grpc_service.model.UserProfile.Builder subBuilder = null;
            if (userProfile_ != null) {
              subBuilder = userProfile_.toBuilder();
            }
            userProfile_ = input.readMessage(com.hzs.grpc_service.model.UserProfile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userProfile_);
              userProfile_ = subBuilder.buildPartial();
            }

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
    return com.hzs.grpc_service.model.CampaignGrpcProto.internal_static_model_UserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hzs.grpc_service.model.CampaignGrpcProto.internal_static_model_UserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hzs.grpc_service.model.UserRequest.class, com.hzs.grpc_service.model.UserRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_PROFILE_FIELD_NUMBER = 2;
  private com.hzs.grpc_service.model.UserProfile userProfile_;
  /**
   * <code>.model.UserProfile user_profile = 2;</code>
   * @return Whether the userProfile field is set.
   */
  public boolean hasUserProfile() {
    return userProfile_ != null;
  }
  /**
   * <code>.model.UserProfile user_profile = 2;</code>
   * @return The userProfile.
   */
  public com.hzs.grpc_service.model.UserProfile getUserProfile() {
    return userProfile_ == null ? com.hzs.grpc_service.model.UserProfile.getDefaultInstance() : userProfile_;
  }
  /**
   * <code>.model.UserProfile user_profile = 2;</code>
   */
  public com.hzs.grpc_service.model.UserProfileOrBuilder getUserProfileOrBuilder() {
    return getUserProfile();
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
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (userProfile_ != null) {
      output.writeMessage(2, getUserProfile());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (userProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUserProfile());
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
    if (!(obj instanceof com.hzs.grpc_service.model.UserRequest)) {
      return super.equals(obj);
    }
    com.hzs.grpc_service.model.UserRequest other = (com.hzs.grpc_service.model.UserRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (hasUserProfile() != other.hasUserProfile()) return false;
    if (hasUserProfile()) {
      if (!getUserProfile()
          .equals(other.getUserProfile())) return false;
    }
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    if (hasUserProfile()) {
      hash = (37 * hash) + USER_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getUserProfile().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hzs.grpc_service.model.UserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_service.model.UserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_service.model.UserRequest parseFrom(
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
  public static Builder newBuilder(com.hzs.grpc_service.model.UserRequest prototype) {
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
   * Protobuf type {@code model.UserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.UserRequest)
      com.hzs.grpc_service.model.UserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hzs.grpc_service.model.CampaignGrpcProto.internal_static_model_UserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hzs.grpc_service.model.CampaignGrpcProto.internal_static_model_UserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hzs.grpc_service.model.UserRequest.class, com.hzs.grpc_service.model.UserRequest.Builder.class);
    }

    // Construct using com.hzs.grpc_service.model.UserRequest.newBuilder()
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
      userId_ = "";

      if (userProfileBuilder_ == null) {
        userProfile_ = null;
      } else {
        userProfile_ = null;
        userProfileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hzs.grpc_service.model.CampaignGrpcProto.internal_static_model_UserRequest_descriptor;
    }

    @java.lang.Override
    public com.hzs.grpc_service.model.UserRequest getDefaultInstanceForType() {
      return com.hzs.grpc_service.model.UserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hzs.grpc_service.model.UserRequest build() {
      com.hzs.grpc_service.model.UserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hzs.grpc_service.model.UserRequest buildPartial() {
      com.hzs.grpc_service.model.UserRequest result = new com.hzs.grpc_service.model.UserRequest(this);
      result.userId_ = userId_;
      if (userProfileBuilder_ == null) {
        result.userProfile_ = userProfile_;
      } else {
        result.userProfile_ = userProfileBuilder_.build();
      }
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
      if (other instanceof com.hzs.grpc_service.model.UserRequest) {
        return mergeFrom((com.hzs.grpc_service.model.UserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hzs.grpc_service.model.UserRequest other) {
      if (other == com.hzs.grpc_service.model.UserRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.hasUserProfile()) {
        mergeUserProfile(other.getUserProfile());
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
      com.hzs.grpc_service.model.UserRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hzs.grpc_service.model.UserRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private com.hzs.grpc_service.model.UserProfile userProfile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hzs.grpc_service.model.UserProfile, com.hzs.grpc_service.model.UserProfile.Builder, com.hzs.grpc_service.model.UserProfileOrBuilder> userProfileBuilder_;
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     * @return Whether the userProfile field is set.
     */
    public boolean hasUserProfile() {
      return userProfileBuilder_ != null || userProfile_ != null;
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     * @return The userProfile.
     */
    public com.hzs.grpc_service.model.UserProfile getUserProfile() {
      if (userProfileBuilder_ == null) {
        return userProfile_ == null ? com.hzs.grpc_service.model.UserProfile.getDefaultInstance() : userProfile_;
      } else {
        return userProfileBuilder_.getMessage();
      }
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     */
    public Builder setUserProfile(com.hzs.grpc_service.model.UserProfile value) {
      if (userProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userProfile_ = value;
        onChanged();
      } else {
        userProfileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     */
    public Builder setUserProfile(
        com.hzs.grpc_service.model.UserProfile.Builder builderForValue) {
      if (userProfileBuilder_ == null) {
        userProfile_ = builderForValue.build();
        onChanged();
      } else {
        userProfileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     */
    public Builder mergeUserProfile(com.hzs.grpc_service.model.UserProfile value) {
      if (userProfileBuilder_ == null) {
        if (userProfile_ != null) {
          userProfile_ =
            com.hzs.grpc_service.model.UserProfile.newBuilder(userProfile_).mergeFrom(value).buildPartial();
        } else {
          userProfile_ = value;
        }
        onChanged();
      } else {
        userProfileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     */
    public Builder clearUserProfile() {
      if (userProfileBuilder_ == null) {
        userProfile_ = null;
        onChanged();
      } else {
        userProfile_ = null;
        userProfileBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     */
    public com.hzs.grpc_service.model.UserProfile.Builder getUserProfileBuilder() {
      
      onChanged();
      return getUserProfileFieldBuilder().getBuilder();
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     */
    public com.hzs.grpc_service.model.UserProfileOrBuilder getUserProfileOrBuilder() {
      if (userProfileBuilder_ != null) {
        return userProfileBuilder_.getMessageOrBuilder();
      } else {
        return userProfile_ == null ?
            com.hzs.grpc_service.model.UserProfile.getDefaultInstance() : userProfile_;
      }
    }
    /**
     * <code>.model.UserProfile user_profile = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hzs.grpc_service.model.UserProfile, com.hzs.grpc_service.model.UserProfile.Builder, com.hzs.grpc_service.model.UserProfileOrBuilder> 
        getUserProfileFieldBuilder() {
      if (userProfileBuilder_ == null) {
        userProfileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hzs.grpc_service.model.UserProfile, com.hzs.grpc_service.model.UserProfile.Builder, com.hzs.grpc_service.model.UserProfileOrBuilder>(
                getUserProfile(),
                getParentForChildren(),
                isClean());
        userProfile_ = null;
      }
      return userProfileBuilder_;
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


    // @@protoc_insertion_point(builder_scope:model.UserRequest)
  }

  // @@protoc_insertion_point(class_scope:model.UserRequest)
  private static final com.hzs.grpc_service.model.UserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hzs.grpc_service.model.UserRequest();
  }

  public static com.hzs.grpc_service.model.UserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRequest>
      PARSER = new com.google.protobuf.AbstractParser<UserRequest>() {
    @java.lang.Override
    public UserRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hzs.grpc_service.model.UserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

