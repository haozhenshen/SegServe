package com.hzs.SegServe.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

public interface CampaignOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Campaign)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .Rule rule = 1;</code>
   * @return Whether the rule field is set.
   */
  boolean hasRule();
  /**
   * <code>optional .Rule rule = 1;</code>
   * @return The rule.
   */
  Rule getRule();
  /**
   * <code>optional .Rule rule = 1;</code>
   */
  RuleOrBuilder getRuleOrBuilder();

  /**
   * <code>optional .Schedule schedule = 2;</code>
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   * <code>optional .Schedule schedule = 2;</code>
   * @return The schedule.
   */
  Schedule getSchedule();
  /**
   * <code>optional .Schedule schedule = 2;</code>
   */
  ScheduleOrBuilder getScheduleOrBuilder();

  /**
   * <code>repeated .Target target = 3;</code>
   */
  java.util.List<Target> 
      getTargetList();
  /**
   * <code>repeated .Target target = 3;</code>
   */
  Target getTarget(int index);
  /**
   * <code>repeated .Target target = 3;</code>
   */
  int getTargetCount();
  /**
   * <code>repeated .Target target = 3;</code>
   */
  java.util.List<? extends TargetOrBuilder> 
      getTargetOrBuilderList();
  /**
   * <code>repeated .Target target = 3;</code>
   */
  TargetOrBuilder getTargetOrBuilder(
      int index);
}