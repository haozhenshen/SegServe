// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.SegServe.proto;

public interface TargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hzs.SegServe.proto.Target)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hzs.SegServe.proto.HomePageShelfTarget home_page = 1;</code>
   * @return Whether the homePage field is set.
   */
  boolean hasHomePage();
  /**
   * <code>.com.hzs.SegServe.proto.HomePageShelfTarget home_page = 1;</code>
   * @return The homePage.
   */
  com.hzs.SegServe.proto.HomePageShelfTarget getHomePage();
  /**
   * <code>.com.hzs.SegServe.proto.HomePageShelfTarget home_page = 1;</code>
   */
  com.hzs.SegServe.proto.HomePageShelfTargetOrBuilder getHomePageOrBuilder();

  /**
   * <code>.com.hzs.SegServe.proto.PostPlayShelfTarget post_play = 2;</code>
   * @return Whether the postPlay field is set.
   */
  boolean hasPostPlay();
  /**
   * <code>.com.hzs.SegServe.proto.PostPlayShelfTarget post_play = 2;</code>
   * @return The postPlay.
   */
  com.hzs.SegServe.proto.PostPlayShelfTarget getPostPlay();
  /**
   * <code>.com.hzs.SegServe.proto.PostPlayShelfTarget post_play = 2;</code>
   */
  com.hzs.SegServe.proto.PostPlayShelfTargetOrBuilder getPostPlayOrBuilder();

  /**
   * <code>.com.hzs.SegServe.proto.NotificationTarget notification = 3;</code>
   * @return Whether the notification field is set.
   */
  boolean hasNotification();
  /**
   * <code>.com.hzs.SegServe.proto.NotificationTarget notification = 3;</code>
   * @return The notification.
   */
  com.hzs.SegServe.proto.NotificationTarget getNotification();
  /**
   * <code>.com.hzs.SegServe.proto.NotificationTarget notification = 3;</code>
   */
  com.hzs.SegServe.proto.NotificationTargetOrBuilder getNotificationOrBuilder();

  com.hzs.SegServe.proto.Target.TargetCase getTargetCase();
}
