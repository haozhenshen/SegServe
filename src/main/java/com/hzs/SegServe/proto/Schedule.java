package com.hzs.SegServe.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

/**
 * <pre>
 * Represents a Schedule used in segmentation
 * </pre>
 *
 * Protobuf type {@code Schedule}
 */
public final class Schedule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Schedule)
    ScheduleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Schedule.newBuilder() to construct.
  private Schedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Schedule() {
    cronExpression_ = "";
    timeZone_ = "";
    jobDescription_ = "";
    jobOptions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Schedule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return CampaignProto.internal_static_Schedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CampaignProto.internal_static_Schedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Schedule.class, Schedule.Builder.class);
  }

  public static final int CRON_EXPRESSION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cronExpression_ = "";
  /**
   * <code>string cron_expression = 1;</code>
   * @return The cronExpression.
   */
  @java.lang.Override
  public java.lang.String getCronExpression() {
    java.lang.Object ref = cronExpression_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cronExpression_ = s;
      return s;
    }
  }
  /**
   * <code>string cron_expression = 1;</code>
   * @return The bytes for cronExpression.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCronExpressionBytes() {
    java.lang.Object ref = cronExpression_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cronExpression_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object timeZone_ = "";
  /**
   * <code>string time_zone = 2;</code>
   * @return The timeZone.
   */
  @java.lang.Override
  public java.lang.String getTimeZone() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeZone_ = s;
      return s;
    }
  }
  /**
   * <code>string time_zone = 2;</code>
   * @return The bytes for timeZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeZoneBytes() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timeZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object jobDescription_ = "";
  /**
   * <code>string job_description = 3;</code>
   * @return The jobDescription.
   */
  @java.lang.Override
  public java.lang.String getJobDescription() {
    java.lang.Object ref = jobDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobDescription_ = s;
      return s;
    }
  }
  /**
   * <code>string job_description = 3;</code>
   * @return The bytes for jobDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJobDescriptionBytes() {
    java.lang.Object ref = jobDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_OPTIONS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList jobOptions_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string job_options = 4;</code>
   * @return A list containing the jobOptions.
   */
  public com.google.protobuf.ProtocolStringList
      getJobOptionsList() {
    return jobOptions_;
  }
  /**
   * <code>repeated string job_options = 4;</code>
   * @return The count of jobOptions.
   */
  public int getJobOptionsCount() {
    return jobOptions_.size();
  }
  /**
   * <code>repeated string job_options = 4;</code>
   * @param index The index of the element to return.
   * @return The jobOptions at the given index.
   */
  public java.lang.String getJobOptions(int index) {
    return jobOptions_.get(index);
  }
  /**
   * <code>repeated string job_options = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the jobOptions at the given index.
   */
  public com.google.protobuf.ByteString
      getJobOptionsBytes(int index) {
    return jobOptions_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cronExpression_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cronExpression_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeZone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, timeZone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jobDescription_);
    }
    for (int i = 0; i < jobOptions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, jobOptions_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cronExpression_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cronExpression_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeZone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, timeZone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jobDescription_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < jobOptions_.size(); i++) {
        dataSize += computeStringSizeNoTag(jobOptions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getJobOptionsList().size();
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
    if (!(obj instanceof Schedule)) {
      return super.equals(obj);
    }
    Schedule other = (Schedule) obj;

    if (!getCronExpression()
        .equals(other.getCronExpression())) return false;
    if (!getTimeZone()
        .equals(other.getTimeZone())) return false;
    if (!getJobDescription()
        .equals(other.getJobDescription())) return false;
    if (!getJobOptionsList()
        .equals(other.getJobOptionsList())) return false;
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
    hash = (37 * hash) + CRON_EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + getCronExpression().hashCode();
    hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getTimeZone().hashCode();
    hash = (37 * hash) + JOB_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getJobDescription().hashCode();
    if (getJobOptionsCount() > 0) {
      hash = (37 * hash) + JOB_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getJobOptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Schedule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Schedule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Schedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Schedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Schedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Schedule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Schedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Schedule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Schedule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static Schedule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Schedule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Schedule parseFrom(
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
  public static Builder newBuilder(Schedule prototype) {
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
   * Represents a Schedule used in segmentation
   * </pre>
   *
   * Protobuf type {@code Schedule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Schedule)
      ScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CampaignProto.internal_static_Schedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CampaignProto.internal_static_Schedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Schedule.class, Schedule.Builder.class);
    }

    // Construct using Schedule.newBuilder()
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
      cronExpression_ = "";
      timeZone_ = "";
      jobDescription_ = "";
      jobOptions_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CampaignProto.internal_static_Schedule_descriptor;
    }

    @java.lang.Override
    public Schedule getDefaultInstanceForType() {
      return Schedule.getDefaultInstance();
    }

    @java.lang.Override
    public Schedule build() {
      Schedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Schedule buildPartial() {
      Schedule result = new Schedule(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Schedule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cronExpression_ = cronExpression_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeZone_ = timeZone_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.jobDescription_ = jobDescription_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        jobOptions_.makeImmutable();
        result.jobOptions_ = jobOptions_;
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
      if (other instanceof Schedule) {
        return mergeFrom((Schedule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Schedule other) {
      if (other == Schedule.getDefaultInstance()) return this;
      if (!other.getCronExpression().isEmpty()) {
        cronExpression_ = other.cronExpression_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTimeZone().isEmpty()) {
        timeZone_ = other.timeZone_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getJobDescription().isEmpty()) {
        jobDescription_ = other.jobDescription_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.jobOptions_.isEmpty()) {
        if (jobOptions_.isEmpty()) {
          jobOptions_ = other.jobOptions_;
          bitField0_ |= 0x00000008;
        } else {
          ensureJobOptionsIsMutable();
          jobOptions_.addAll(other.jobOptions_);
        }
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
              cronExpression_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              timeZone_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              jobDescription_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureJobOptionsIsMutable();
              jobOptions_.add(s);
              break;
            } // case 34
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

    private java.lang.Object cronExpression_ = "";
    /**
     * <code>string cron_expression = 1;</code>
     * @return The cronExpression.
     */
    public java.lang.String getCronExpression() {
      java.lang.Object ref = cronExpression_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cronExpression_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cron_expression = 1;</code>
     * @return The bytes for cronExpression.
     */
    public com.google.protobuf.ByteString
        getCronExpressionBytes() {
      java.lang.Object ref = cronExpression_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cronExpression_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cron_expression = 1;</code>
     * @param value The cronExpression to set.
     * @return This builder for chaining.
     */
    public Builder setCronExpression(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cronExpression_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string cron_expression = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCronExpression() {
      cronExpression_ = getDefaultInstance().getCronExpression();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string cron_expression = 1;</code>
     * @param value The bytes for cronExpression to set.
     * @return This builder for chaining.
     */
    public Builder setCronExpressionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cronExpression_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object timeZone_ = "";
    /**
     * <code>string time_zone = 2;</code>
     * @return The timeZone.
     */
    public java.lang.String getTimeZone() {
      java.lang.Object ref = timeZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string time_zone = 2;</code>
     * @return The bytes for timeZone.
     */
    public com.google.protobuf.ByteString
        getTimeZoneBytes() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string time_zone = 2;</code>
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      timeZone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string time_zone = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {
      timeZone_ = getDefaultInstance().getTimeZone();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string time_zone = 2;</code>
     * @param value The bytes for timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      timeZone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object jobDescription_ = "";
    /**
     * <code>string job_description = 3;</code>
     * @return The jobDescription.
     */
    public java.lang.String getJobDescription() {
      java.lang.Object ref = jobDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string job_description = 3;</code>
     * @return The bytes for jobDescription.
     */
    public com.google.protobuf.ByteString
        getJobDescriptionBytes() {
      java.lang.Object ref = jobDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string job_description = 3;</code>
     * @param value The jobDescription to set.
     * @return This builder for chaining.
     */
    public Builder setJobDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      jobDescription_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string job_description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobDescription() {
      jobDescription_ = getDefaultInstance().getJobDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string job_description = 3;</code>
     * @param value The bytes for jobDescription to set.
     * @return This builder for chaining.
     */
    public Builder setJobDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      jobDescription_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList jobOptions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureJobOptionsIsMutable() {
      if (!jobOptions_.isModifiable()) {
        jobOptions_ = new com.google.protobuf.LazyStringArrayList(jobOptions_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @return A list containing the jobOptions.
     */
    public com.google.protobuf.ProtocolStringList
        getJobOptionsList() {
      jobOptions_.makeImmutable();
      return jobOptions_;
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @return The count of jobOptions.
     */
    public int getJobOptionsCount() {
      return jobOptions_.size();
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @param index The index of the element to return.
     * @return The jobOptions at the given index.
     */
    public java.lang.String getJobOptions(int index) {
      return jobOptions_.get(index);
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the jobOptions at the given index.
     */
    public com.google.protobuf.ByteString
        getJobOptionsBytes(int index) {
      return jobOptions_.getByteString(index);
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @param index The index to set the value at.
     * @param value The jobOptions to set.
     * @return This builder for chaining.
     */
    public Builder setJobOptions(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureJobOptionsIsMutable();
      jobOptions_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @param value The jobOptions to add.
     * @return This builder for chaining.
     */
    public Builder addJobOptions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureJobOptionsIsMutable();
      jobOptions_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @param values The jobOptions to add.
     * @return This builder for chaining.
     */
    public Builder addAllJobOptions(
        java.lang.Iterable<java.lang.String> values) {
      ensureJobOptionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, jobOptions_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobOptions() {
      jobOptions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string job_options = 4;</code>
     * @param value The bytes of the jobOptions to add.
     * @return This builder for chaining.
     */
    public Builder addJobOptionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureJobOptionsIsMutable();
      jobOptions_.add(value);
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:Schedule)
  }

  // @@protoc_insertion_point(class_scope:Schedule)
  private static final Schedule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Schedule();
  }

  public static Schedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Schedule>
      PARSER = new com.google.protobuf.AbstractParser<Schedule>() {
    @java.lang.Override
    public Schedule parsePartialFrom(
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

  public static com.google.protobuf.Parser<Schedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Schedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Schedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

