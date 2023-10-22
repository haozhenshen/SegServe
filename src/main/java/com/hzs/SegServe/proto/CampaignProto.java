// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

package com.hzs.SegServe.proto;

public final class CampaignProto {
  private CampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_PlayActivityRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_PlayActivityRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_SubscriptionRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_SubscriptionRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_LoginActivityRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_LoginActivityRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_Rule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_Rule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_Target_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_Target_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_HomePageShelfTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_HomePageShelfTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_PostPlayShelfTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_PostPlayShelfTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_NotificationTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_NotificationTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hzs_SegServe_proto_Campaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hzs_SegServe_proto_Campaign_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016campaign.proto\022\026com.hzs.SegServe.proto" +
      "\"^\n\020PlayActivityRule\022\027\n\ncontent_id\030\001 \001(\t" +
      "H\000\210\001\001\022\025\n\010progress\030\002 \001(\003H\001\210\001\001B\r\n\013_content" +
      "_idB\013\n\t_progress\"j\n\020SubscriptionRule\022\034\n\017" +
      "subscription_id\030\001 \001(\tH\000\210\001\001\022\026\n\tplan_name\030" +
      "\002 \001(\tH\001\210\001\001B\022\n\020_subscription_idB\014\n\n_plan_" +
      "name\"E\n\021LoginActivityRule\022\034\n\017last_login_" +
      "date\030\001 \001(\tH\000\210\001\001B\022\n\020_last_login_date\"\257\002\n\004" +
      "Rule\022\024\n\007rule_id\030\001 \001(\tH\001\210\001\001\022\026\n\trule_name\030" +
      "\002 \001(\tH\002\210\001\001\022F\n\022play_activity_rule\030\003 \001(\0132(" +
      ".com.hzs.SegServe.proto.PlayActivityRule" +
      "H\000\022E\n\021subscription_rule\030\004 \001(\0132(.com.hzs." +
      "SegServe.proto.SubscriptionRuleH\000\022H\n\023log" +
      "in_activity_rule\030\005 \001(\0132).com.hzs.SegServ" +
      "e.proto.LoginActivityRuleH\000B\006\n\004ruleB\n\n\010_" +
      "rule_idB\014\n\n_rule_name\"d\n\010Schedule\022\027\n\017cro" +
      "n_expression\030\001 \001(\t\022\021\n\ttime_zone\030\002 \001(\t\022\027\n" +
      "\017job_description\030\003 \001(\t\022\023\n\013job_options\030\004 " +
      "\003(\t\"\332\001\n\006Target\022@\n\thome_page\030\001 \001(\0132+.com." +
      "hzs.SegServe.proto.HomePageShelfTargetH\000" +
      "\022@\n\tpost_play\030\002 \001(\0132+.com.hzs.SegServe.p" +
      "roto.PostPlayShelfTargetH\000\022B\n\014notificati" +
      "on\030\003 \001(\0132*.com.hzs.SegServe.proto.Notifi" +
      "cationTargetH\000B\010\n\006target\"9\n\023HomePageShel" +
      "fTarget\022\025\n\010shelf_id\030\001 \001(\tH\000\210\001\001B\013\n\t_shelf" +
      "_id\"a\n\023PostPlayShelfTarget\022\027\n\ncontent_id" +
      "\030\001 \001(\tH\000\210\001\001\022\025\n\010shelf_id\030\002 \001(\tH\001\210\001\001B\r\n\013_c" +
      "ontent_idB\013\n\t_shelf_id\"8\n\022NotificationTa" +
      "rget\022\025\n\010shelf_id\030\001 \001(\tH\000\210\001\001B\013\n\t_shelf_id" +
      "\"\372\001\n\010Campaign\022\030\n\013campaign_id\030\001 \001(\tH\000\210\001\001\022" +
      "\032\n\rcampaign_name\030\002 \001(\tH\001\210\001\001\022\024\n\007rule_id\030\003" +
      " \001(\tH\002\210\001\001\0227\n\010schedule\030\004 \001(\0132 .com.hzs.Se" +
      "gServe.proto.ScheduleH\003\210\001\001\022.\n\006target\030\005 \003" +
      "(\0132\036.com.hzs.SegServe.proto.TargetB\016\n\014_c" +
      "ampaign_idB\020\n\016_campaign_nameB\n\n\010_rule_id" +
      "B\013\n\t_scheduleB\021B\rCampaignProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hzs_SegServe_proto_PlayActivityRule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hzs_SegServe_proto_PlayActivityRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_PlayActivityRule_descriptor,
        new java.lang.String[] { "ContentId", "Progress", "ContentId", "Progress", });
    internal_static_com_hzs_SegServe_proto_SubscriptionRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hzs_SegServe_proto_SubscriptionRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_SubscriptionRule_descriptor,
        new java.lang.String[] { "SubscriptionId", "PlanName", "SubscriptionId", "PlanName", });
    internal_static_com_hzs_SegServe_proto_LoginActivityRule_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hzs_SegServe_proto_LoginActivityRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_LoginActivityRule_descriptor,
        new java.lang.String[] { "LastLoginDate", "LastLoginDate", });
    internal_static_com_hzs_SegServe_proto_Rule_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hzs_SegServe_proto_Rule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_Rule_descriptor,
        new java.lang.String[] { "RuleId", "RuleName", "PlayActivityRule", "SubscriptionRule", "LoginActivityRule", "Rule", "RuleId", "RuleName", });
    internal_static_com_hzs_SegServe_proto_Schedule_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_hzs_SegServe_proto_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_Schedule_descriptor,
        new java.lang.String[] { "CronExpression", "TimeZone", "JobDescription", "JobOptions", });
    internal_static_com_hzs_SegServe_proto_Target_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_hzs_SegServe_proto_Target_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_Target_descriptor,
        new java.lang.String[] { "HomePage", "PostPlay", "Notification", "Target", });
    internal_static_com_hzs_SegServe_proto_HomePageShelfTarget_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_hzs_SegServe_proto_HomePageShelfTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_HomePageShelfTarget_descriptor,
        new java.lang.String[] { "ShelfId", "ShelfId", });
    internal_static_com_hzs_SegServe_proto_PostPlayShelfTarget_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_hzs_SegServe_proto_PostPlayShelfTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_PostPlayShelfTarget_descriptor,
        new java.lang.String[] { "ContentId", "ShelfId", "ContentId", "ShelfId", });
    internal_static_com_hzs_SegServe_proto_NotificationTarget_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_hzs_SegServe_proto_NotificationTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_NotificationTarget_descriptor,
        new java.lang.String[] { "ShelfId", "ShelfId", });
    internal_static_com_hzs_SegServe_proto_Campaign_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_hzs_SegServe_proto_Campaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hzs_SegServe_proto_Campaign_descriptor,
        new java.lang.String[] { "CampaignId", "CampaignName", "RuleId", "Schedule", "Target", "CampaignId", "CampaignName", "RuleId", "Schedule", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
