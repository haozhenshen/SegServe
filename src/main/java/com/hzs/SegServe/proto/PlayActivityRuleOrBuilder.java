package com.hzs.SegServe.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

public interface PlayActivityRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PlayActivityRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string content_id = 1;</code>
   * @return Whether the contentId field is set.
   */
  boolean hasContentId();
  /**
   * <code>optional string content_id = 1;</code>
   * @return The contentId.
   */
  java.lang.String getContentId();
  /**
   * <code>optional string content_id = 1;</code>
   * @return The bytes for contentId.
   */
  com.google.protobuf.ByteString
      getContentIdBytes();

  /**
   * <code>optional int64 progress = 2;</code>
   * @return Whether the progress field is set.
   */
  boolean hasProgress();
  /**
   * <code>optional int64 progress = 2;</code>
   * @return The progress.
   */
  long getProgress();
}