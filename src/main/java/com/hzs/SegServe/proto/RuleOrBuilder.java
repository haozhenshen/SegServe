package com.hzs.SegServe.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

public interface RuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Rule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.PlayActivityRule play_activity_rule = 1;</code>
   * @return Whether the playActivityRule field is set.
   */
  boolean hasPlayActivityRule();
  /**
   * <code>.PlayActivityRule play_activity_rule = 1;</code>
   * @return The playActivityRule.
   */
  PlayActivityRule getPlayActivityRule();
  /**
   * <code>.PlayActivityRule play_activity_rule = 1;</code>
   */
  PlayActivityRuleOrBuilder getPlayActivityRuleOrBuilder();

  /**
   * <code>.SubscriptionRule subscription_rule = 2;</code>
   * @return Whether the subscriptionRule field is set.
   */
  boolean hasSubscriptionRule();
  /**
   * <code>.SubscriptionRule subscription_rule = 2;</code>
   * @return The subscriptionRule.
   */
  SubscriptionRule getSubscriptionRule();
  /**
   * <code>.SubscriptionRule subscription_rule = 2;</code>
   */
  SubscriptionRuleOrBuilder getSubscriptionRuleOrBuilder();

  /**
   * <code>.LoginActivityRule login_activity_rule = 3;</code>
   * @return Whether the loginActivityRule field is set.
   */
  boolean hasLoginActivityRule();
  /**
   * <code>.LoginActivityRule login_activity_rule = 3;</code>
   * @return The loginActivityRule.
   */
  LoginActivityRule getLoginActivityRule();
  /**
   * <code>.LoginActivityRule login_activity_rule = 3;</code>
   */
  LoginActivityRuleOrBuilder getLoginActivityRuleOrBuilder();

  Rule.RuleCase getRuleCase();
}
