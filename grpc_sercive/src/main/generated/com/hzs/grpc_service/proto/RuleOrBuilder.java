// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.grpc_service.proto;

public interface RuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hzs.grpc_service.proto.Rule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rule_id = 1;</code>
   * @return The ruleId.
   */
  java.lang.String getRuleId();
  /**
   * <code>string rule_id = 1;</code>
   * @return The bytes for ruleId.
   */
  com.google.protobuf.ByteString
      getRuleIdBytes();

  /**
   * <code>string rule_name = 2;</code>
   * @return The ruleName.
   */
  java.lang.String getRuleName();
  /**
   * <code>string rule_name = 2;</code>
   * @return The bytes for ruleName.
   */
  com.google.protobuf.ByteString
      getRuleNameBytes();

  /**
   * <code>.com.hzs.grpc_service.proto.PlayActivityRule play_activity_rule = 3;</code>
   * @return Whether the playActivityRule field is set.
   */
  boolean hasPlayActivityRule();
  /**
   * <code>.com.hzs.grpc_service.proto.PlayActivityRule play_activity_rule = 3;</code>
   * @return The playActivityRule.
   */
  com.hzs.grpc_service.proto.PlayActivityRule getPlayActivityRule();
  /**
   * <code>.com.hzs.grpc_service.proto.PlayActivityRule play_activity_rule = 3;</code>
   */
  com.hzs.grpc_service.proto.PlayActivityRuleOrBuilder getPlayActivityRuleOrBuilder();

  /**
   * <code>.com.hzs.grpc_service.proto.SubscriptionRule subscription_rule = 4;</code>
   * @return Whether the subscriptionRule field is set.
   */
  boolean hasSubscriptionRule();
  /**
   * <code>.com.hzs.grpc_service.proto.SubscriptionRule subscription_rule = 4;</code>
   * @return The subscriptionRule.
   */
  com.hzs.grpc_service.proto.SubscriptionRule getSubscriptionRule();
  /**
   * <code>.com.hzs.grpc_service.proto.SubscriptionRule subscription_rule = 4;</code>
   */
  com.hzs.grpc_service.proto.SubscriptionRuleOrBuilder getSubscriptionRuleOrBuilder();

  /**
   * <code>.com.hzs.grpc_service.proto.LoginActivityRule login_activity_rule = 5;</code>
   * @return Whether the loginActivityRule field is set.
   */
  boolean hasLoginActivityRule();
  /**
   * <code>.com.hzs.grpc_service.proto.LoginActivityRule login_activity_rule = 5;</code>
   * @return The loginActivityRule.
   */
  com.hzs.grpc_service.proto.LoginActivityRule getLoginActivityRule();
  /**
   * <code>.com.hzs.grpc_service.proto.LoginActivityRule login_activity_rule = 5;</code>
   */
  com.hzs.grpc_service.proto.LoginActivityRuleOrBuilder getLoginActivityRuleOrBuilder();

  public com.hzs.grpc_service.proto.Rule.RuleCase getRuleCase();
}