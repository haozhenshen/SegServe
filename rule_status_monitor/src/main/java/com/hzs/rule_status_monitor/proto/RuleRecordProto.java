// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rule_record.proto

package com.hzs.rule_status_monitor.proto;

public final class RuleRecordProto {
  private RuleRecordProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_rule_status_monitor_proto_StatusTsPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_rule_status_monitor_proto_StatusTsPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_rule_status_monitor_proto_RuleRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_rule_status_monitor_proto_RuleRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021rule_record.proto\022!com.hzs.rule_status" +
      "_monitor.proto\"n\n\014StatusTsPair\0229\n\006status" +
      "\030\001 \001(\0162).com.hzs.rule_status_monitor.pro" +
      "to.Status\022\021\n\ttimestamp\030\002 \001(\t\022\020\n\010progress" +
      "\030\003 \001(\005\"\332\001\n\nRuleRecord\022\n\n\002id\030\001 \001(\t\022\021\n\trul" +
      "e_name\030\002 \001(\t\022\017\n\007version\030\003 \001(\003\022\021\n\ttimesta" +
      "mp\030\004 \001(\t\0229\n\006status\030\005 \001(\0162).com.hzs.rule_" +
      "status_monitor.proto.Status\022\020\n\010progress\030" +
      "\006 \001(\005\022<\n\003log\030\007 \003(\0132/.com.hzs.rule_status" +
      "_monitor.proto.StatusTsPair*_\n\006Status\022\013\n" +
      "\007UNKNOWN\020\000\022\007\n\003ACK\020\001\022\t\n\005ERROR\020\002\022\013\n\007TIMEOU" +
      "T\020\003\022\r\n\tCOMPUTING\020\004\022\013\n\007SUCCESS\020\005\022\013\n\007FAN_O" +
      "UT\020\006B\023B\017RuleRecordProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hzs_rule_status_monitor_proto_StatusTsPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hzs_rule_status_monitor_proto_StatusTsPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_rule_status_monitor_proto_StatusTsPair_descriptor,
        new java.lang.String[] { "Status", "Timestamp", "Progress", });
    internal_static_com_hzs_rule_status_monitor_proto_RuleRecord_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hzs_rule_status_monitor_proto_RuleRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_rule_status_monitor_proto_RuleRecord_descriptor,
        new java.lang.String[] { "Id", "RuleName", "Version", "Timestamp", "Status", "Progress", "Log", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
