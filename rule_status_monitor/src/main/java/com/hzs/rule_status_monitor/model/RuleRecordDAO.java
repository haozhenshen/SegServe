package com.hzs.rule_status_monitor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hzs.rule_status_monitor.proto.RuleRecord;
import com.hzs.rule_status_monitor.proto.Status;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ruleRecordDAOs")
public class RuleRecordDAO {
    @Id
    @JsonIgnore
    private String id;

    private String ruleName;

    private long version;

    private String status;

    private int progress;

    private RuleRecord ruleRecord;

    public RuleRecordDAO(RuleRecord ruleRecord) {
        this.id = ruleRecord.getId();
        this.ruleName = ruleRecord.getRuleName();
        this.version = ruleRecord.getVersion();
        this.status = String.valueOf(ruleRecord.getStatus());
        this.progress = ruleRecord.getProgress();
        this.ruleRecord = ruleRecord;
    }
}