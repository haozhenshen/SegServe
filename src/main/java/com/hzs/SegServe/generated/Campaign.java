// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

/**
 * <pre>
 * Represents a Campaign with segmentation rules and targets
 * </pre>
 *
 * Protobuf type {@code Campaign}
 */
public final class Campaign extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Campaign)
    CampaignOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Campaign.newBuilder() to construct.
  private Campaign(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Campaign() {
    target_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Campaign();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return CampaignProto.internal_static_Campaign_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CampaignProto.internal_static_Campaign_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Campaign.class, Campaign.Builder.class);
  }

  private int bitField0_;
  public static final int RULE_FIELD_NUMBER = 1;
  private Rule rule_;
  /**
   * <code>optional .Rule rule = 1;</code>
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .Rule rule = 1;</code>
   * @return The rule.
   */
  @java.lang.Override
  public Rule getRule() {
    return rule_ == null ? Rule.getDefaultInstance() : rule_;
  }
  /**
   * <code>optional .Rule rule = 1;</code>
   */
  @java.lang.Override
  public RuleOrBuilder getRuleOrBuilder() {
    return rule_ == null ? Rule.getDefaultInstance() : rule_;
  }

  public static final int SCHEDULE_FIELD_NUMBER = 2;
  private Schedule schedule_;
  /**
   * <code>optional .Schedule schedule = 2;</code>
   * @return Whether the schedule field is set.
   */
  @java.lang.Override
  public boolean hasSchedule() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .Schedule schedule = 2;</code>
   * @return The schedule.
   */
  @java.lang.Override
  public Schedule getSchedule() {
    return schedule_ == null ? Schedule.getDefaultInstance() : schedule_;
  }
  /**
   * <code>optional .Schedule schedule = 2;</code>
   */
  @java.lang.Override
  public ScheduleOrBuilder getScheduleOrBuilder() {
    return schedule_ == null ? Schedule.getDefaultInstance() : schedule_;
  }

  public static final int TARGET_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<Target> target_;
  /**
   * <code>repeated .Target target = 3;</code>
   */
  @java.lang.Override
  public java.util.List<Target> getTargetList() {
    return target_;
  }
  /**
   * <code>repeated .Target target = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends TargetOrBuilder> 
      getTargetOrBuilderList() {
    return target_;
  }
  /**
   * <code>repeated .Target target = 3;</code>
   */
  @java.lang.Override
  public int getTargetCount() {
    return target_.size();
  }
  /**
   * <code>repeated .Target target = 3;</code>
   */
  @java.lang.Override
  public Target getTarget(int index) {
    return target_.get(index);
  }
  /**
   * <code>repeated .Target target = 3;</code>
   */
  @java.lang.Override
  public TargetOrBuilder getTargetOrBuilder(
      int index) {
    return target_.get(index);
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
      output.writeMessage(1, getRule());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getSchedule());
    }
    for (int i = 0; i < target_.size(); i++) {
      output.writeMessage(3, target_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRule());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSchedule());
    }
    for (int i = 0; i < target_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, target_.get(i));
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
    if (!(obj instanceof Campaign)) {
      return super.equals(obj);
    }
    Campaign other = (Campaign) obj;

    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule()
          .equals(other.getRule())) return false;
    }
    if (hasSchedule() != other.hasSchedule()) return false;
    if (hasSchedule()) {
      if (!getSchedule()
          .equals(other.getSchedule())) return false;
    }
    if (!getTargetList()
        .equals(other.getTargetList())) return false;
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
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    if (hasSchedule()) {
      hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getSchedule().hashCode();
    }
    if (getTargetCount() > 0) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTargetList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Campaign parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Campaign parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Campaign parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Campaign parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Campaign parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Campaign parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Campaign parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Campaign parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Campaign parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static Campaign parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Campaign parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Campaign parseFrom(
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
  public static Builder newBuilder(Campaign prototype) {
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
   * Represents a Campaign with segmentation rules and targets
   * </pre>
   *
   * Protobuf type {@code Campaign}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Campaign)
      CampaignOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CampaignProto.internal_static_Campaign_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CampaignProto.internal_static_Campaign_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Campaign.class, Campaign.Builder.class);
    }

    // Construct using Campaign.newBuilder()
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
        getRuleFieldBuilder();
        getScheduleFieldBuilder();
        getTargetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      if (targetBuilder_ == null) {
        target_ = java.util.Collections.emptyList();
      } else {
        target_ = null;
        targetBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CampaignProto.internal_static_Campaign_descriptor;
    }

    @java.lang.Override
    public Campaign getDefaultInstanceForType() {
      return Campaign.getDefaultInstance();
    }

    @java.lang.Override
    public Campaign build() {
      Campaign result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Campaign buildPartial() {
      Campaign result = new Campaign(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(Campaign result) {
      if (targetBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          target_ = java.util.Collections.unmodifiableList(target_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.target_ = target_;
      } else {
        result.target_ = targetBuilder_.build();
      }
    }

    private void buildPartial0(Campaign result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rule_ = ruleBuilder_ == null
            ? rule_
            : ruleBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.schedule_ = scheduleBuilder_ == null
            ? schedule_
            : scheduleBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof Campaign) {
        return mergeFrom((Campaign)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Campaign other) {
      if (other == Campaign.getDefaultInstance()) return this;
      if (other.hasRule()) {
        mergeRule(other.getRule());
      }
      if (other.hasSchedule()) {
        mergeSchedule(other.getSchedule());
      }
      if (targetBuilder_ == null) {
        if (!other.target_.isEmpty()) {
          if (target_.isEmpty()) {
            target_ = other.target_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureTargetIsMutable();
            target_.addAll(other.target_);
          }
          onChanged();
        }
      } else {
        if (!other.target_.isEmpty()) {
          if (targetBuilder_.isEmpty()) {
            targetBuilder_.dispose();
            targetBuilder_ = null;
            target_ = other.target_;
            bitField0_ = (bitField0_ & ~0x00000004);
            targetBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTargetFieldBuilder() : null;
          } else {
            targetBuilder_.addAllMessages(other.target_);
          }
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
                  getRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getScheduleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              Target m =
                  input.readMessage(
                      Target.parser(),
                      extensionRegistry);
              if (targetBuilder_ == null) {
                ensureTargetIsMutable();
                target_.add(m);
              } else {
                targetBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private Rule rule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Rule, Rule.Builder, RuleOrBuilder> ruleBuilder_;
    /**
     * <code>optional .Rule rule = 1;</code>
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     * @return The rule.
     */
    public Rule getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null ? Rule.getDefaultInstance() : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     */
    public Builder setRule(Rule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
      } else {
        ruleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     */
    public Builder setRule(
        Rule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     */
    public Builder mergeRule(Rule value) {
      if (ruleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          rule_ != null &&
          rule_ != Rule.getDefaultInstance()) {
          getRuleBuilder().mergeFrom(value);
        } else {
          rule_ = value;
        }
      } else {
        ruleBuilder_.mergeFrom(value);
      }
      if (rule_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     */
    public Builder clearRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     */
    public Rule.Builder getRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     */
    public RuleOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null ?
            Rule.getDefaultInstance() : rule_;
      }
    }
    /**
     * <code>optional .Rule rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Rule, Rule.Builder, RuleOrBuilder> 
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Rule, Rule.Builder, RuleOrBuilder>(
                getRule(),
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      return ruleBuilder_;
    }

    private Schedule schedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Schedule, Schedule.Builder, ScheduleOrBuilder> scheduleBuilder_;
    /**
     * <code>optional .Schedule schedule = 2;</code>
     * @return Whether the schedule field is set.
     */
    public boolean hasSchedule() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     * @return The schedule.
     */
    public Schedule getSchedule() {
      if (scheduleBuilder_ == null) {
        return schedule_ == null ? Schedule.getDefaultInstance() : schedule_;
      } else {
        return scheduleBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     */
    public Builder setSchedule(Schedule value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schedule_ = value;
      } else {
        scheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     */
    public Builder setSchedule(
        Schedule.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        schedule_ = builderForValue.build();
      } else {
        scheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     */
    public Builder mergeSchedule(Schedule value) {
      if (scheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          schedule_ != null &&
          schedule_ != Schedule.getDefaultInstance()) {
          getScheduleBuilder().mergeFrom(value);
        } else {
          schedule_ = value;
        }
      } else {
        scheduleBuilder_.mergeFrom(value);
      }
      if (schedule_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     */
    public Builder clearSchedule() {
      bitField0_ = (bitField0_ & ~0x00000002);
      schedule_ = null;
      if (scheduleBuilder_ != null) {
        scheduleBuilder_.dispose();
        scheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     */
    public Schedule.Builder getScheduleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getScheduleFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     */
    public ScheduleOrBuilder getScheduleOrBuilder() {
      if (scheduleBuilder_ != null) {
        return scheduleBuilder_.getMessageOrBuilder();
      } else {
        return schedule_ == null ?
            Schedule.getDefaultInstance() : schedule_;
      }
    }
    /**
     * <code>optional .Schedule schedule = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Schedule, Schedule.Builder, ScheduleOrBuilder> 
        getScheduleFieldBuilder() {
      if (scheduleBuilder_ == null) {
        scheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Schedule, Schedule.Builder, ScheduleOrBuilder>(
                getSchedule(),
                getParentForChildren(),
                isClean());
        schedule_ = null;
      }
      return scheduleBuilder_;
    }

    private java.util.List<Target> target_ =
      java.util.Collections.emptyList();
    private void ensureTargetIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        target_ = new java.util.ArrayList<Target>(target_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Target, Target.Builder, TargetOrBuilder> targetBuilder_;

    /**
     * <code>repeated .Target target = 3;</code>
     */
    public java.util.List<Target> getTargetList() {
      if (targetBuilder_ == null) {
        return java.util.Collections.unmodifiableList(target_);
      } else {
        return targetBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public int getTargetCount() {
      if (targetBuilder_ == null) {
        return target_.size();
      } else {
        return targetBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Target getTarget(int index) {
      if (targetBuilder_ == null) {
        return target_.get(index);
      } else {
        return targetBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder setTarget(
        int index, Target value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetIsMutable();
        target_.set(index, value);
        onChanged();
      } else {
        targetBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder setTarget(
        int index, Target.Builder builderForValue) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder addTarget(Target value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetIsMutable();
        target_.add(value);
        onChanged();
      } else {
        targetBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder addTarget(
        int index, Target value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetIsMutable();
        target_.add(index, value);
        onChanged();
      } else {
        targetBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder addTarget(
        Target.Builder builderForValue) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.add(builderForValue.build());
        onChanged();
      } else {
        targetBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder addTarget(
        int index, Target.Builder builderForValue) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder addAllTarget(
        java.lang.Iterable<? extends Target> values) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, target_);
        onChanged();
      } else {
        targetBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder clearTarget() {
      if (targetBuilder_ == null) {
        target_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        targetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Builder removeTarget(int index) {
      if (targetBuilder_ == null) {
        ensureTargetIsMutable();
        target_.remove(index);
        onChanged();
      } else {
        targetBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Target.Builder getTargetBuilder(
        int index) {
      return getTargetFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public TargetOrBuilder getTargetOrBuilder(
        int index) {
      if (targetBuilder_ == null) {
        return target_.get(index);  } else {
        return targetBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public java.util.List<? extends TargetOrBuilder> 
         getTargetOrBuilderList() {
      if (targetBuilder_ != null) {
        return targetBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(target_);
      }
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Target.Builder addTargetBuilder() {
      return getTargetFieldBuilder().addBuilder(
          Target.getDefaultInstance());
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public Target.Builder addTargetBuilder(
        int index) {
      return getTargetFieldBuilder().addBuilder(
          index, Target.getDefaultInstance());
    }
    /**
     * <code>repeated .Target target = 3;</code>
     */
    public java.util.List<Target.Builder> 
         getTargetBuilderList() {
      return getTargetFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Target, Target.Builder, TargetOrBuilder> 
        getTargetFieldBuilder() {
      if (targetBuilder_ == null) {
        targetBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Target, Target.Builder, TargetOrBuilder>(
                target_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      return targetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Campaign)
  }

  // @@protoc_insertion_point(class_scope:Campaign)
  private static final Campaign DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Campaign();
  }

  public static Campaign getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Campaign>
      PARSER = new com.google.protobuf.AbstractParser<Campaign>() {
    @java.lang.Override
    public Campaign parsePartialFrom(
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

  public static com.google.protobuf.Parser<Campaign> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Campaign> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Campaign getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

