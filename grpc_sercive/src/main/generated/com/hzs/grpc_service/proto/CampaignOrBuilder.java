// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.grpc_service.proto;

public interface CampaignOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hzs.grpc_service.proto.Campaign)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string campaign_id = 1;</code>
   * @return The campaignId.
   */
  java.lang.String getCampaignId();
  /**
   * <code>string campaign_id = 1;</code>
   * @return The bytes for campaignId.
   */
  com.google.protobuf.ByteString
      getCampaignIdBytes();

  /**
   * <code>string campaign_name = 2;</code>
   * @return The campaignName.
   */
  java.lang.String getCampaignName();
  /**
   * <code>string campaign_name = 2;</code>
   * @return The bytes for campaignName.
   */
  com.google.protobuf.ByteString
      getCampaignNameBytes();

  /**
   * <code>string rule_id = 3;</code>
   * @return The ruleId.
   */
  java.lang.String getRuleId();
  /**
   * <code>string rule_id = 3;</code>
   * @return The bytes for ruleId.
   */
  com.google.protobuf.ByteString
      getRuleIdBytes();

  /**
   * <code>.com.hzs.grpc_service.proto.Schedule schedule = 4;</code>
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   * <code>.com.hzs.grpc_service.proto.Schedule schedule = 4;</code>
   * @return The schedule.
   */
  com.hzs.grpc_service.proto.Schedule getSchedule();
  /**
   * <code>.com.hzs.grpc_service.proto.Schedule schedule = 4;</code>
   */
  com.hzs.grpc_service.proto.ScheduleOrBuilder getScheduleOrBuilder();

  /**
   * <code>repeated .com.hzs.grpc_service.proto.Target target = 5;</code>
   */
  java.util.List<com.hzs.grpc_service.proto.Target> 
      getTargetList();
  /**
   * <code>repeated .com.hzs.grpc_service.proto.Target target = 5;</code>
   */
  com.hzs.grpc_service.proto.Target getTarget(int index);
  /**
   * <code>repeated .com.hzs.grpc_service.proto.Target target = 5;</code>
   */
  int getTargetCount();
  /**
   * <code>repeated .com.hzs.grpc_service.proto.Target target = 5;</code>
   */
  java.util.List<? extends com.hzs.grpc_service.proto.TargetOrBuilder> 
      getTargetOrBuilderList();
  /**
   * <code>repeated .com.hzs.grpc_service.proto.Target target = 5;</code>
   */
  com.hzs.grpc_service.proto.TargetOrBuilder getTargetOrBuilder(
      int index);
}