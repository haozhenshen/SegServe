package com.hzs.SegServe.service;

import com.hzs.SegServe.model.RuleDAO;
import com.hzs.SegServe.proto.Rule;
import com.hzs.SegServe.repository.RuleRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RuleService {

    private final RuleRepository ruleRepository;

    @Autowired
    public RuleService(RuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    // Create a new rule
    public RuleDAO createRule(Rule rule) {
        ObjectId uid = new ObjectId();

        // Save the rule to MongoDB
        return ruleRepository.save(new RuleDAO(rule));
    }

    // Retrieve all rules
    public List<RuleDAO> getAllRules() {
        return ruleRepository.findAll();
    }

    // Retrieve a rule by its ID
    public Optional<RuleDAO> getRuleById(String ruleId) {
        return ruleRepository.findById(ruleId);
    }

    // Update a rule by its ID
    public Optional<RuleDAO> updateRule(String id, Rule rule) {
        Optional<RuleDAO> existingRule = getRuleById(id);

        if (existingRule.isPresent()) {
            return Optional.of(ruleRepository.save(new RuleDAO(rule)));
        } else {
            // Rule with the given ID does not exist
            return Optional.empty();
        }
    }

    // Delete a rule by its ID
    public void deleteRuleById(String ruleId) {
        ruleRepository.deleteById(ruleId);
    }
}