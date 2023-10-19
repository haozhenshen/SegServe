package com.hzs.SegServe.proto;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign.proto

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
    internal_static_PlayActivityRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayActivityRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscriptionRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscriptionRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginActivityRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginActivityRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Rule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Rule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Target_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Target_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePageShelfTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePageShelfTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostPlayShelfTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostPlayShelfTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NotificationTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NotificationTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Campaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Campaign_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016campaign.proto\"^\n\020PlayActivityRule\022\027\n\n" +
      "content_id\030\001 \001(\tH\000\210\001\001\022\025\n\010progress\030\002 \001(\003H" +
      "\001\210\001\001B\r\n\013_content_idB\013\n\t_progress\"j\n\020Subs" +
      "criptionRule\022\034\n\017subscription_id\030\001 \001(\tH\000\210" +
      "\001\001\022\026\n\tplan_name\030\002 \001(\tH\001\210\001\001B\022\n\020_subscript" +
      "ion_idB\014\n\n_plan_name\"E\n\021LoginActivityRul" +
      "e\022\034\n\017last_login_date\030\001 \001(\tH\000\210\001\001B\022\n\020_last" +
      "_login_date\"\242\001\n\004Rule\022/\n\022play_activity_ru" +
      "le\030\001 \001(\0132\021.PlayActivityRuleH\000\022.\n\021subscri" +
      "ption_rule\030\002 \001(\0132\021.SubscriptionRuleH\000\0221\n" +
      "\023login_activity_rule\030\003 \001(\0132\022.LoginActivi" +
      "tyRuleH\000B\006\n\004rule\"d\n\010Schedule\022\027\n\017cron_exp" +
      "ression\030\001 \001(\t\022\021\n\ttime_zone\030\002 \001(\t\022\027\n\017job_" +
      "description\030\003 \001(\t\022\023\n\013job_options\030\004 \003(\t\"\223" +
      "\001\n\006Target\022)\n\thome_page\030\001 \001(\0132\024.HomePageS" +
      "helfTargetH\000\022)\n\tpost_play\030\002 \001(\0132\024.PostPl" +
      "ayShelfTargetH\000\022+\n\014notification\030\003 \001(\0132\023." +
      "NotificationTargetH\000B\006\n\004rule\"9\n\023HomePage" +
      "ShelfTarget\022\025\n\010shelf_id\030\001 \001(\tH\000\210\001\001B\013\n\t_s" +
      "helf_id\"a\n\023PostPlayShelfTarget\022\027\n\nconten" +
      "t_id\030\001 \001(\tH\000\210\001\001\022\025\n\010shelf_id\030\002 \001(\tH\001\210\001\001B\r" +
      "\n\013_content_idB\013\n\t_shelf_id\"8\n\022Notificati" +
      "onTarget\022\025\n\010shelf_id\030\001 \001(\tH\000\210\001\001B\013\n\t_shel" +
      "f_id\"u\n\010Campaign\022\030\n\004rule\030\001 \001(\0132\005.RuleH\000\210" +
      "\001\001\022 \n\010schedule\030\002 \001(\0132\t.ScheduleH\001\210\001\001\022\027\n\006" +
      "target\030\003 \003(\0132\007.TargetB\007\n\005_ruleB\013\n\t_sched" +
      "uleB\021B\rCampaignProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayActivityRule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayActivityRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayActivityRule_descriptor,
        new java.lang.String[] { "ContentId", "Progress", "ContentId", "Progress", });
    internal_static_SubscriptionRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SubscriptionRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscriptionRule_descriptor,
        new java.lang.String[] { "SubscriptionId", "PlanName", "SubscriptionId", "PlanName", });
    internal_static_LoginActivityRule_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LoginActivityRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginActivityRule_descriptor,
        new java.lang.String[] { "LastLoginDate", "LastLoginDate", });
    internal_static_Rule_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Rule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Rule_descriptor,
        new java.lang.String[] { "PlayActivityRule", "SubscriptionRule", "LoginActivityRule", "Rule", });
    internal_static_Schedule_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Schedule_descriptor,
        new java.lang.String[] { "CronExpression", "TimeZone", "JobDescription", "JobOptions", });
    internal_static_Target_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Target_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Target_descriptor,
        new java.lang.String[] { "HomePage", "PostPlay", "Notification", "Rule", });
    internal_static_HomePageShelfTarget_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_HomePageShelfTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePageShelfTarget_descriptor,
        new java.lang.String[] { "ShelfId", "ShelfId", });
    internal_static_PostPlayShelfTarget_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_PostPlayShelfTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostPlayShelfTarget_descriptor,
        new java.lang.String[] { "ContentId", "ShelfId", "ContentId", "ShelfId", });
    internal_static_NotificationTarget_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_NotificationTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NotificationTarget_descriptor,
        new java.lang.String[] { "ShelfId", "ShelfId", });
    internal_static_Campaign_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Campaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Campaign_descriptor,
        new java.lang.String[] { "Rule", "Schedule", "Target", "Rule", "Schedule", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
