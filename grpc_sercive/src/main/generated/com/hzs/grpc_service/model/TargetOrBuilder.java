// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.grpc_service.model;

public interface TargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.Target)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.model.HomePageShelfTarget home_page = 1;</code>
   * @return Whether the homePage field is set.
   */
  boolean hasHomePage();
  /**
   * <code>.model.HomePageShelfTarget home_page = 1;</code>
   * @return The homePage.
   */
  com.hzs.grpc_service.model.HomePageShelfTarget getHomePage();
  /**
   * <code>.model.HomePageShelfTarget home_page = 1;</code>
   */
  com.hzs.grpc_service.model.HomePageShelfTargetOrBuilder getHomePageOrBuilder();

  /**
   * <code>.model.PostPlayShelfTarget post_play = 2;</code>
   * @return Whether the postPlay field is set.
   */
  boolean hasPostPlay();
  /**
   * <code>.model.PostPlayShelfTarget post_play = 2;</code>
   * @return The postPlay.
   */
  com.hzs.grpc_service.model.PostPlayShelfTarget getPostPlay();
  /**
   * <code>.model.PostPlayShelfTarget post_play = 2;</code>
   */
  com.hzs.grpc_service.model.PostPlayShelfTargetOrBuilder getPostPlayOrBuilder();

  /**
   * <code>.model.NotificationTarget notification = 3;</code>
   * @return Whether the notification field is set.
   */
  boolean hasNotification();
  /**
   * <code>.model.NotificationTarget notification = 3;</code>
   * @return The notification.
   */
  com.hzs.grpc_service.model.NotificationTarget getNotification();
  /**
   * <code>.model.NotificationTarget notification = 3;</code>
   */
  com.hzs.grpc_service.model.NotificationTargetOrBuilder getNotificationOrBuilder();

  public com.hzs.grpc_service.model.Target.TargetCase getTargetCase();
}