// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign_grpc_service.proto

package com.hzs.grpc_service.model;

public interface UserProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.UserProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .model.RuleVersionPair ruleVersion = 1;</code>
   */
  java.util.List<com.hzs.grpc_service.model.RuleVersionPair> 
      getRuleVersionList();
  /**
   * <code>repeated .model.RuleVersionPair ruleVersion = 1;</code>
   */
  com.hzs.grpc_service.model.RuleVersionPair getRuleVersion(int index);
  /**
   * <code>repeated .model.RuleVersionPair ruleVersion = 1;</code>
   */
  int getRuleVersionCount();
  /**
   * <code>repeated .model.RuleVersionPair ruleVersion = 1;</code>
   */
  java.util.List<? extends com.hzs.grpc_service.model.RuleVersionPairOrBuilder> 
      getRuleVersionOrBuilderList();
  /**
   * <code>repeated .model.RuleVersionPair ruleVersion = 1;</code>
   */
  com.hzs.grpc_service.model.RuleVersionPairOrBuilder getRuleVersionOrBuilder(
      int index);
}
