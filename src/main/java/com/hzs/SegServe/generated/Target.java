// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

/**
 * <pre>
 * Represents a Target used in segmentation
 * </pre>
 *
 * Protobuf type {@code Target}
 */
public final class Target extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Target)
    TargetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Target.newBuilder() to construct.
  private Target(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Target() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Target();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return CampaignProto.internal_static_Target_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CampaignProto.internal_static_Target_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Target.class, Target.Builder.class);
  }

  private int ruleCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object rule_;
  public enum RuleCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HOME_PAGE(1),
    POST_PLAY(2),
    NOTIFICATION(3),
    RULE_NOT_SET(0);
    private final int value;
    private RuleCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RuleCase valueOf(int value) {
      return forNumber(value);
    }

    public static RuleCase forNumber(int value) {
      switch (value) {
        case 1: return HOME_PAGE;
        case 2: return POST_PLAY;
        case 3: return NOTIFICATION;
        case 0: return RULE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RuleCase
  getRuleCase() {
    return RuleCase.forNumber(
        ruleCase_);
  }

  public static final int HOME_PAGE_FIELD_NUMBER = 1;
  /**
   * <code>.HomePageShelfTarget home_page = 1;</code>
   * @return Whether the homePage field is set.
   */
  @java.lang.Override
  public boolean hasHomePage() {
    return ruleCase_ == 1;
  }
  /**
   * <code>.HomePageShelfTarget home_page = 1;</code>
   * @return The homePage.
   */
  @java.lang.Override
  public HomePageShelfTarget getHomePage() {
    if (ruleCase_ == 1) {
       return (HomePageShelfTarget) rule_;
    }
    return HomePageShelfTarget.getDefaultInstance();
  }
  /**
   * <code>.HomePageShelfTarget home_page = 1;</code>
   */
  @java.lang.Override
  public HomePageShelfTargetOrBuilder getHomePageOrBuilder() {
    if (ruleCase_ == 1) {
       return (HomePageShelfTarget) rule_;
    }
    return HomePageShelfTarget.getDefaultInstance();
  }

  public static final int POST_PLAY_FIELD_NUMBER = 2;
  /**
   * <code>.PostPlayShelfTarget post_play = 2;</code>
   * @return Whether the postPlay field is set.
   */
  @java.lang.Override
  public boolean hasPostPlay() {
    return ruleCase_ == 2;
  }
  /**
   * <code>.PostPlayShelfTarget post_play = 2;</code>
   * @return The postPlay.
   */
  @java.lang.Override
  public PostPlayShelfTarget getPostPlay() {
    if (ruleCase_ == 2) {
       return (PostPlayShelfTarget) rule_;
    }
    return PostPlayShelfTarget.getDefaultInstance();
  }
  /**
   * <code>.PostPlayShelfTarget post_play = 2;</code>
   */
  @java.lang.Override
  public PostPlayShelfTargetOrBuilder getPostPlayOrBuilder() {
    if (ruleCase_ == 2) {
       return (PostPlayShelfTarget) rule_;
    }
    return PostPlayShelfTarget.getDefaultInstance();
  }

  public static final int NOTIFICATION_FIELD_NUMBER = 3;
  /**
   * <code>.NotificationTarget notification = 3;</code>
   * @return Whether the notification field is set.
   */
  @java.lang.Override
  public boolean hasNotification() {
    return ruleCase_ == 3;
  }
  /**
   * <code>.NotificationTarget notification = 3;</code>
   * @return The notification.
   */
  @java.lang.Override
  public NotificationTarget getNotification() {
    if (ruleCase_ == 3) {
       return (NotificationTarget) rule_;
    }
    return NotificationTarget.getDefaultInstance();
  }
  /**
   * <code>.NotificationTarget notification = 3;</code>
   */
  @java.lang.Override
  public NotificationTargetOrBuilder getNotificationOrBuilder() {
    if (ruleCase_ == 3) {
       return (NotificationTarget) rule_;
    }
    return NotificationTarget.getDefaultInstance();
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
    if (ruleCase_ == 1) {
      output.writeMessage(1, (HomePageShelfTarget) rule_);
    }
    if (ruleCase_ == 2) {
      output.writeMessage(2, (PostPlayShelfTarget) rule_);
    }
    if (ruleCase_ == 3) {
      output.writeMessage(3, (NotificationTarget) rule_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ruleCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (HomePageShelfTarget) rule_);
    }
    if (ruleCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (PostPlayShelfTarget) rule_);
    }
    if (ruleCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (NotificationTarget) rule_);
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
    if (!(obj instanceof Target)) {
      return super.equals(obj);
    }
    Target other = (Target) obj;

    if (!getRuleCase().equals(other.getRuleCase())) return false;
    switch (ruleCase_) {
      case 1:
        if (!getHomePage()
            .equals(other.getHomePage())) return false;
        break;
      case 2:
        if (!getPostPlay()
            .equals(other.getPostPlay())) return false;
        break;
      case 3:
        if (!getNotification()
            .equals(other.getNotification())) return false;
        break;
      case 0:
      default:
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
    switch (ruleCase_) {
      case 1:
        hash = (37 * hash) + HOME_PAGE_FIELD_NUMBER;
        hash = (53 * hash) + getHomePage().hashCode();
        break;
      case 2:
        hash = (37 * hash) + POST_PLAY_FIELD_NUMBER;
        hash = (53 * hash) + getPostPlay().hashCode();
        break;
      case 3:
        hash = (37 * hash) + NOTIFICATION_FIELD_NUMBER;
        hash = (53 * hash) + getNotification().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Target parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Target parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Target parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Target parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Target parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Target parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Target parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Target parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Target parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static Target parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Target parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Target parseFrom(
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
  public static Builder newBuilder(Target prototype) {
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
   * Represents a Target used in segmentation
   * </pre>
   *
   * Protobuf type {@code Target}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Target)
      TargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CampaignProto.internal_static_Target_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CampaignProto.internal_static_Target_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Target.class, Target.Builder.class);
    }

    // Construct using Target.newBuilder()
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
      if (homePageBuilder_ != null) {
        homePageBuilder_.clear();
      }
      if (postPlayBuilder_ != null) {
        postPlayBuilder_.clear();
      }
      if (notificationBuilder_ != null) {
        notificationBuilder_.clear();
      }
      ruleCase_ = 0;
      rule_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CampaignProto.internal_static_Target_descriptor;
    }

    @java.lang.Override
    public Target getDefaultInstanceForType() {
      return Target.getDefaultInstance();
    }

    @java.lang.Override
    public Target build() {
      Target result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Target buildPartial() {
      Target result = new Target(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(Target result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(Target result) {
      result.ruleCase_ = ruleCase_;
      result.rule_ = this.rule_;
      if (ruleCase_ == 1 &&
          homePageBuilder_ != null) {
        result.rule_ = homePageBuilder_.build();
      }
      if (ruleCase_ == 2 &&
          postPlayBuilder_ != null) {
        result.rule_ = postPlayBuilder_.build();
      }
      if (ruleCase_ == 3 &&
          notificationBuilder_ != null) {
        result.rule_ = notificationBuilder_.build();
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
      if (other instanceof Target) {
        return mergeFrom((Target)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Target other) {
      if (other == Target.getDefaultInstance()) return this;
      switch (other.getRuleCase()) {
        case HOME_PAGE: {
          mergeHomePage(other.getHomePage());
          break;
        }
        case POST_PLAY: {
          mergePostPlay(other.getPostPlay());
          break;
        }
        case NOTIFICATION: {
          mergeNotification(other.getNotification());
          break;
        }
        case RULE_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getHomePageFieldBuilder().getBuilder(),
                  extensionRegistry);
              ruleCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPostPlayFieldBuilder().getBuilder(),
                  extensionRegistry);
              ruleCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getNotificationFieldBuilder().getBuilder(),
                  extensionRegistry);
              ruleCase_ = 3;
              break;
            } // case 26
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
    private int ruleCase_ = 0;
    private java.lang.Object rule_;
    public RuleCase
        getRuleCase() {
      return RuleCase.forNumber(
          ruleCase_);
    }

    public Builder clearRule() {
      ruleCase_ = 0;
      rule_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        HomePageShelfTarget, HomePageShelfTarget.Builder, HomePageShelfTargetOrBuilder> homePageBuilder_;
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     * @return Whether the homePage field is set.
     */
    @java.lang.Override
    public boolean hasHomePage() {
      return ruleCase_ == 1;
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     * @return The homePage.
     */
    @java.lang.Override
    public HomePageShelfTarget getHomePage() {
      if (homePageBuilder_ == null) {
        if (ruleCase_ == 1) {
          return (HomePageShelfTarget) rule_;
        }
        return HomePageShelfTarget.getDefaultInstance();
      } else {
        if (ruleCase_ == 1) {
          return homePageBuilder_.getMessage();
        }
        return HomePageShelfTarget.getDefaultInstance();
      }
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     */
    public Builder setHomePage(HomePageShelfTarget value) {
      if (homePageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
        onChanged();
      } else {
        homePageBuilder_.setMessage(value);
      }
      ruleCase_ = 1;
      return this;
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     */
    public Builder setHomePage(
        HomePageShelfTarget.Builder builderForValue) {
      if (homePageBuilder_ == null) {
        rule_ = builderForValue.build();
        onChanged();
      } else {
        homePageBuilder_.setMessage(builderForValue.build());
      }
      ruleCase_ = 1;
      return this;
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     */
    public Builder mergeHomePage(HomePageShelfTarget value) {
      if (homePageBuilder_ == null) {
        if (ruleCase_ == 1 &&
            rule_ != HomePageShelfTarget.getDefaultInstance()) {
          rule_ = HomePageShelfTarget.newBuilder((HomePageShelfTarget) rule_)
              .mergeFrom(value).buildPartial();
        } else {
          rule_ = value;
        }
        onChanged();
      } else {
        if (ruleCase_ == 1) {
          homePageBuilder_.mergeFrom(value);
        } else {
          homePageBuilder_.setMessage(value);
        }
      }
      ruleCase_ = 1;
      return this;
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     */
    public Builder clearHomePage() {
      if (homePageBuilder_ == null) {
        if (ruleCase_ == 1) {
          ruleCase_ = 0;
          rule_ = null;
          onChanged();
        }
      } else {
        if (ruleCase_ == 1) {
          ruleCase_ = 0;
          rule_ = null;
        }
        homePageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     */
    public HomePageShelfTarget.Builder getHomePageBuilder() {
      return getHomePageFieldBuilder().getBuilder();
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     */
    @java.lang.Override
    public HomePageShelfTargetOrBuilder getHomePageOrBuilder() {
      if ((ruleCase_ == 1) && (homePageBuilder_ != null)) {
        return homePageBuilder_.getMessageOrBuilder();
      } else {
        if (ruleCase_ == 1) {
          return (HomePageShelfTarget) rule_;
        }
        return HomePageShelfTarget.getDefaultInstance();
      }
    }
    /**
     * <code>.HomePageShelfTarget home_page = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        HomePageShelfTarget, HomePageShelfTarget.Builder, HomePageShelfTargetOrBuilder> 
        getHomePageFieldBuilder() {
      if (homePageBuilder_ == null) {
        if (!(ruleCase_ == 1)) {
          rule_ = HomePageShelfTarget.getDefaultInstance();
        }
        homePageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            HomePageShelfTarget, HomePageShelfTarget.Builder, HomePageShelfTargetOrBuilder>(
                (HomePageShelfTarget) rule_,
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      ruleCase_ = 1;
      onChanged();
      return homePageBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        PostPlayShelfTarget, PostPlayShelfTarget.Builder, PostPlayShelfTargetOrBuilder> postPlayBuilder_;
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     * @return Whether the postPlay field is set.
     */
    @java.lang.Override
    public boolean hasPostPlay() {
      return ruleCase_ == 2;
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     * @return The postPlay.
     */
    @java.lang.Override
    public PostPlayShelfTarget getPostPlay() {
      if (postPlayBuilder_ == null) {
        if (ruleCase_ == 2) {
          return (PostPlayShelfTarget) rule_;
        }
        return PostPlayShelfTarget.getDefaultInstance();
      } else {
        if (ruleCase_ == 2) {
          return postPlayBuilder_.getMessage();
        }
        return PostPlayShelfTarget.getDefaultInstance();
      }
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     */
    public Builder setPostPlay(PostPlayShelfTarget value) {
      if (postPlayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
        onChanged();
      } else {
        postPlayBuilder_.setMessage(value);
      }
      ruleCase_ = 2;
      return this;
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     */
    public Builder setPostPlay(
        PostPlayShelfTarget.Builder builderForValue) {
      if (postPlayBuilder_ == null) {
        rule_ = builderForValue.build();
        onChanged();
      } else {
        postPlayBuilder_.setMessage(builderForValue.build());
      }
      ruleCase_ = 2;
      return this;
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     */
    public Builder mergePostPlay(PostPlayShelfTarget value) {
      if (postPlayBuilder_ == null) {
        if (ruleCase_ == 2 &&
            rule_ != PostPlayShelfTarget.getDefaultInstance()) {
          rule_ = PostPlayShelfTarget.newBuilder((PostPlayShelfTarget) rule_)
              .mergeFrom(value).buildPartial();
        } else {
          rule_ = value;
        }
        onChanged();
      } else {
        if (ruleCase_ == 2) {
          postPlayBuilder_.mergeFrom(value);
        } else {
          postPlayBuilder_.setMessage(value);
        }
      }
      ruleCase_ = 2;
      return this;
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     */
    public Builder clearPostPlay() {
      if (postPlayBuilder_ == null) {
        if (ruleCase_ == 2) {
          ruleCase_ = 0;
          rule_ = null;
          onChanged();
        }
      } else {
        if (ruleCase_ == 2) {
          ruleCase_ = 0;
          rule_ = null;
        }
        postPlayBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     */
    public PostPlayShelfTarget.Builder getPostPlayBuilder() {
      return getPostPlayFieldBuilder().getBuilder();
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     */
    @java.lang.Override
    public PostPlayShelfTargetOrBuilder getPostPlayOrBuilder() {
      if ((ruleCase_ == 2) && (postPlayBuilder_ != null)) {
        return postPlayBuilder_.getMessageOrBuilder();
      } else {
        if (ruleCase_ == 2) {
          return (PostPlayShelfTarget) rule_;
        }
        return PostPlayShelfTarget.getDefaultInstance();
      }
    }
    /**
     * <code>.PostPlayShelfTarget post_play = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        PostPlayShelfTarget, PostPlayShelfTarget.Builder, PostPlayShelfTargetOrBuilder> 
        getPostPlayFieldBuilder() {
      if (postPlayBuilder_ == null) {
        if (!(ruleCase_ == 2)) {
          rule_ = PostPlayShelfTarget.getDefaultInstance();
        }
        postPlayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            PostPlayShelfTarget, PostPlayShelfTarget.Builder, PostPlayShelfTargetOrBuilder>(
                (PostPlayShelfTarget) rule_,
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      ruleCase_ = 2;
      onChanged();
      return postPlayBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        NotificationTarget, NotificationTarget.Builder, NotificationTargetOrBuilder> notificationBuilder_;
    /**
     * <code>.NotificationTarget notification = 3;</code>
     * @return Whether the notification field is set.
     */
    @java.lang.Override
    public boolean hasNotification() {
      return ruleCase_ == 3;
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     * @return The notification.
     */
    @java.lang.Override
    public NotificationTarget getNotification() {
      if (notificationBuilder_ == null) {
        if (ruleCase_ == 3) {
          return (NotificationTarget) rule_;
        }
        return NotificationTarget.getDefaultInstance();
      } else {
        if (ruleCase_ == 3) {
          return notificationBuilder_.getMessage();
        }
        return NotificationTarget.getDefaultInstance();
      }
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     */
    public Builder setNotification(NotificationTarget value) {
      if (notificationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
        onChanged();
      } else {
        notificationBuilder_.setMessage(value);
      }
      ruleCase_ = 3;
      return this;
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     */
    public Builder setNotification(
        NotificationTarget.Builder builderForValue) {
      if (notificationBuilder_ == null) {
        rule_ = builderForValue.build();
        onChanged();
      } else {
        notificationBuilder_.setMessage(builderForValue.build());
      }
      ruleCase_ = 3;
      return this;
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     */
    public Builder mergeNotification(NotificationTarget value) {
      if (notificationBuilder_ == null) {
        if (ruleCase_ == 3 &&
            rule_ != NotificationTarget.getDefaultInstance()) {
          rule_ = NotificationTarget.newBuilder((NotificationTarget) rule_)
              .mergeFrom(value).buildPartial();
        } else {
          rule_ = value;
        }
        onChanged();
      } else {
        if (ruleCase_ == 3) {
          notificationBuilder_.mergeFrom(value);
        } else {
          notificationBuilder_.setMessage(value);
        }
      }
      ruleCase_ = 3;
      return this;
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     */
    public Builder clearNotification() {
      if (notificationBuilder_ == null) {
        if (ruleCase_ == 3) {
          ruleCase_ = 0;
          rule_ = null;
          onChanged();
        }
      } else {
        if (ruleCase_ == 3) {
          ruleCase_ = 0;
          rule_ = null;
        }
        notificationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     */
    public NotificationTarget.Builder getNotificationBuilder() {
      return getNotificationFieldBuilder().getBuilder();
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     */
    @java.lang.Override
    public NotificationTargetOrBuilder getNotificationOrBuilder() {
      if ((ruleCase_ == 3) && (notificationBuilder_ != null)) {
        return notificationBuilder_.getMessageOrBuilder();
      } else {
        if (ruleCase_ == 3) {
          return (NotificationTarget) rule_;
        }
        return NotificationTarget.getDefaultInstance();
      }
    }
    /**
     * <code>.NotificationTarget notification = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        NotificationTarget, NotificationTarget.Builder, NotificationTargetOrBuilder> 
        getNotificationFieldBuilder() {
      if (notificationBuilder_ == null) {
        if (!(ruleCase_ == 3)) {
          rule_ = NotificationTarget.getDefaultInstance();
        }
        notificationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            NotificationTarget, NotificationTarget.Builder, NotificationTargetOrBuilder>(
                (NotificationTarget) rule_,
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      ruleCase_ = 3;
      onChanged();
      return notificationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Target)
  }

  // @@protoc_insertion_point(class_scope:Target)
  private static final Target DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Target();
  }

  public static Target getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Target>
      PARSER = new com.google.protobuf.AbstractParser<Target>() {
    @java.lang.Override
    public Target parsePartialFrom(
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

  public static com.google.protobuf.Parser<Target> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Target> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Target getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

