package com.hzs.campaign_management_service.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

}