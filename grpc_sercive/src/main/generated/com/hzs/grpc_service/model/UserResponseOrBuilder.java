// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign_grpc_service.proto

package com.hzs.grpc_service.model;

public interface UserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.UserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  java.util.List<com.hzs.grpc_service.model.Campaign> 
      getCampaignsList();
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  com.hzs.grpc_service.model.Campaign getCampaigns(int index);
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  int getCampaignsCount();
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  java.util.List<? extends com.hzs.grpc_service.model.CampaignOrBuilder> 
      getCampaignsOrBuilderList();
  /**
   * <code>repeated .model.Campaign campaigns = 1;</code>
   */
  com.hzs.grpc_service.model.CampaignOrBuilder getCampaignsOrBuilder(
      int index);
}
