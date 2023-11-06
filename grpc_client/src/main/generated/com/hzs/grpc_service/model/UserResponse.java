// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.grpc_service.model;

/**
 * Protobuf type {@code model.UserResponse}
 */
public  final class UserResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.UserResponse)
    UserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserResponse.newBuilder() to construct.
  private UserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserResponse() {
    campaigns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              campaigns_ = new java.util.ArrayList<com.hzs.grpc_service.model.Campaign>();
              mutable_bitField0_ |= 0x00000001;
            }
            campaigns_.add(
                input.readMessage(com.hzs.grpc_service.model.Campaign.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        campaigns_ = java.util.Collections.unmodifiableList(campaigns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hzs.grpc_service.model.CampaignProto.internal_static_model_UserResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hzs.grpc_service.model.CampaignProto.internal_static_model_UserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hzs.grpc_service.model.UserResponse.class, com.hzs.grpc_service.model.UserResponse.Builder.class);
  }

  public static final int CAMPAIGNS_FIELD_NUMBER = 1;
  private java.util.List<com.hzs.grpc_service.model.Campaign> campaigns_;
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  public java.util.List<com.hzs.grpc_service.model.Campaign> getCampaignsList() {
    return campaigns_;
  }
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  public java.util.List<? extends com.hzs.grpc_service.model.CampaignOrBuilder> 
      getCampaignsOrBuilderList() {
    return campaigns_;
  }
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  public int getCampaignsCount() {
    return campaigns_.size();
  }
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  public com.hzs.grpc_service.model.Campaign getCampaigns(int index) {
    return campaigns_.get(index);
  }
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  public com.hzs.grpc_service.model.CampaignOrBuilder getCampaignsOrBuilder(
      int index) {
    return campaigns_.get(index);
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
    for (int i = 0; i < campaigns_.size(); i++) {
      output.writeMessage(1, campaigns_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < campaigns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, campaigns_.get(i));
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
    if (!(obj instanceof com.hzs.grpc_service.model.UserResponse)) {
      return super.equals(obj);
    }
    com.hzs.grpc_service.model.UserResponse other = (com.hzs.grpc_service.model.UserResponse) obj;

    if (!getCampaignsList()
        .equals(other.getCampaignsList())) return false;
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
    if (getCampaignsCount() > 0) {
      hash = (37 * hash) + CAMPAIGNS_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hzs.grpc_service.model.UserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_service.model.UserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hzs.grpc_service.model.UserResponse parseFrom(
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
  public static Builder newBuilder(com.hzs.grpc_service.model.UserResponse prototype) {
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
   * Protobuf type {@code model.UserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.UserResponse)
      com.hzs.grpc_service.model.UserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hzs.grpc_service.model.CampaignProto.internal_static_model_UserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hzs.grpc_service.model.CampaignProto.internal_static_model_UserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hzs.grpc_service.model.UserResponse.class, com.hzs.grpc_service.model.UserResponse.Builder.class);
    }

    // Construct using com.hzs.grpc_service.model.UserResponse.newBuilder()
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
        getCampaignsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (campaignsBuilder_ == null) {
        campaigns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        campaignsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hzs.grpc_service.model.CampaignProto.internal_static_model_UserResponse_descriptor;
    }

    @java.lang.Override
    public com.hzs.grpc_service.model.UserResponse getDefaultInstanceForType() {
      return com.hzs.grpc_service.model.UserResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hzs.grpc_service.model.UserResponse build() {
      com.hzs.grpc_service.model.UserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hzs.grpc_service.model.UserResponse buildPartial() {
      com.hzs.grpc_service.model.UserResponse result = new com.hzs.grpc_service.model.UserResponse(this);
      int from_bitField0_ = bitField0_;
      if (campaignsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          campaigns_ = java.util.Collections.unmodifiableList(campaigns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.campaigns_ = campaigns_;
      } else {
        result.campaigns_ = campaignsBuilder_.build();
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
      if (other instanceof com.hzs.grpc_service.model.UserResponse) {
        return mergeFrom((com.hzs.grpc_service.model.UserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hzs.grpc_service.model.UserResponse other) {
      if (other == com.hzs.grpc_service.model.UserResponse.getDefaultInstance()) return this;
      if (campaignsBuilder_ == null) {
        if (!other.campaigns_.isEmpty()) {
          if (campaigns_.isEmpty()) {
            campaigns_ = other.campaigns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCampaignsIsMutable();
            campaigns_.addAll(other.campaigns_);
          }
          onChanged();
        }
      } else {
        if (!other.campaigns_.isEmpty()) {
          if (campaignsBuilder_.isEmpty()) {
            campaignsBuilder_.dispose();
            campaignsBuilder_ = null;
            campaigns_ = other.campaigns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            campaignsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCampaignsFieldBuilder() : null;
          } else {
            campaignsBuilder_.addAllMessages(other.campaigns_);
          }
        }
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
      com.hzs.grpc_service.model.UserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hzs.grpc_service.model.UserResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.hzs.grpc_service.model.Campaign> campaigns_ =
      java.util.Collections.emptyList();
    private void ensureCampaignsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        campaigns_ = new java.util.ArrayList<com.hzs.grpc_service.model.Campaign>(campaigns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hzs.grpc_service.model.Campaign, com.hzs.grpc_service.model.Campaign.Builder, com.hzs.grpc_service.model.CampaignOrBuilder> campaignsBuilder_;

    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public java.util.List<com.hzs.grpc_service.model.Campaign> getCampaignsList() {
      if (campaignsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(campaigns_);
      } else {
        return campaignsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public int getCampaignsCount() {
      if (campaignsBuilder_ == null) {
        return campaigns_.size();
      } else {
        return campaignsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public com.hzs.grpc_service.model.Campaign getCampaigns(int index) {
      if (campaignsBuilder_ == null) {
        return campaigns_.get(index);
      } else {
        return campaignsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder setCampaigns(
        int index, com.hzs.grpc_service.model.Campaign value) {
      if (campaignsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignsIsMutable();
        campaigns_.set(index, value);
        onChanged();
      } else {
        campaignsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder setCampaigns(
        int index, com.hzs.grpc_service.model.Campaign.Builder builderForValue) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.set(index, builderForValue.build());
        onChanged();
      } else {
        campaignsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(com.hzs.grpc_service.model.Campaign value) {
      if (campaignsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignsIsMutable();
        campaigns_.add(value);
        onChanged();
      } else {
        campaignsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(
        int index, com.hzs.grpc_service.model.Campaign value) {
      if (campaignsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignsIsMutable();
        campaigns_.add(index, value);
        onChanged();
      } else {
        campaignsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(
        com.hzs.grpc_service.model.Campaign.Builder builderForValue) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.add(builderForValue.build());
        onChanged();
      } else {
        campaignsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(
        int index, com.hzs.grpc_service.model.Campaign.Builder builderForValue) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.add(index, builderForValue.build());
        onChanged();
      } else {
        campaignsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder addAllCampaigns(
        java.lang.Iterable<? extends com.hzs.grpc_service.model.Campaign> values) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, campaigns_);
        onChanged();
      } else {
        campaignsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder clearCampaigns() {
      if (campaignsBuilder_ == null) {
        campaigns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        campaignsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public Builder removeCampaigns(int index) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.remove(index);
        onChanged();
      } else {
        campaignsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public com.hzs.grpc_service.model.Campaign.Builder getCampaignsBuilder(
        int index) {
      return getCampaignsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public com.hzs.grpc_service.model.CampaignOrBuilder getCampaignsOrBuilder(
        int index) {
      if (campaignsBuilder_ == null) {
        return campaigns_.get(index);  } else {
        return campaignsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public java.util.List<? extends com.hzs.grpc_service.model.CampaignOrBuilder> 
         getCampaignsOrBuilderList() {
      if (campaignsBuilder_ != null) {
        return campaignsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(campaigns_);
      }
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public com.hzs.grpc_service.model.Campaign.Builder addCampaignsBuilder() {
      return getCampaignsFieldBuilder().addBuilder(
          com.hzs.grpc_service.model.Campaign.getDefaultInstance());
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public com.hzs.grpc_service.model.Campaign.Builder addCampaignsBuilder(
        int index) {
      return getCampaignsFieldBuilder().addBuilder(
          index, com.hzs.grpc_service.model.Campaign.getDefaultInstance());
    }
    /**
     * <code>repeated .model.Campaign campaigns = 1;</code>
     */
    public java.util.List<com.hzs.grpc_service.model.Campaign.Builder> 
         getCampaignsBuilderList() {
      return getCampaignsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hzs.grpc_service.model.Campaign, com.hzs.grpc_service.model.Campaign.Builder, com.hzs.grpc_service.model.CampaignOrBuilder> 
        getCampaignsFieldBuilder() {
      if (campaignsBuilder_ == null) {
        campaignsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hzs.grpc_service.model.Campaign, com.hzs.grpc_service.model.Campaign.Builder, com.hzs.grpc_service.model.CampaignOrBuilder>(
                campaigns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        campaigns_ = null;
      }
      return campaignsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:model.UserResponse)
  }

  // @@protoc_insertion_point(class_scope:model.UserResponse)
  private static final com.hzs.grpc_service.model.UserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hzs.grpc_service.model.UserResponse();
  }

  public static com.hzs.grpc_service.model.UserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserResponse>
      PARSER = new com.google.protobuf.AbstractParser<UserResponse>() {
    @java.lang.Override
    public UserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hzs.grpc_service.model.UserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

