package com.hzs.SegServe.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hzs.SegServe.proto.Rule;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ruleDAOs")
public class RuleDAO {
    @Id
    @JsonIgnore
    private String id;

    private String ruleName;

    private Rule rule;

    @JsonCreator
    public RuleDAO(Rule rule) {
        this.id = rule.getRuleId();
        this.ruleName = rule.getRuleName();
        this.rule = rule;
    }

    // Additional methods for data access, retrieval, update, and delete can be added here.

    // You can add methods for generating a unique ID and determining the rule type.
}