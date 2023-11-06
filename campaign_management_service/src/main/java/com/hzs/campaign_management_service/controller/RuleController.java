package com.hzs.campaign_management_service.controller;

import com.google.protobuf.util.JsonFormat;
import com.hzs.campaign_management_service.model.Rule;
import com.hzs.campaign_management_service.model.RuleDAO;
import com.hzs.campaign_management_service.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/rules")
public class RuleController {

    private final RuleService ruleService;

    @Autowired
    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    // Create a new rule
    @PostMapping
    public ResponseEntity<String> createRule(@RequestBody String jsonRequest) {
        try {
            // Parse JSON to protobuf
            Rule.Builder ruleBuilder = Rule.newBuilder();
            JsonFormat.parser().merge(jsonRequest, ruleBuilder);
            Rule rule = ruleBuilder.build();

            // Create the rule
            RuleDAO createdRule = ruleService.createRule(rule);

            // Convert the created rule back to JSON
            String jsonResponse = JsonFormat.printer().print(createdRule.getRule());

            return new ResponseEntity<>(jsonResponse, HttpStatus.CREATED);
        } catch (IOException e) {
            // Handle JSON parsing errors
            return new ResponseEntity<>("Invalid JSON request body.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            // Handle other exceptions (e.g., service layer errors)
            return new ResponseEntity<>("Failed to create rule: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Update an existing rule
    @PutMapping("/{id}")
    public ResponseEntity<String> updateRule(@PathVariable String id, @RequestBody String jsonRequest) {
        try {
            // Parse JSON to protobuf
            Rule.Builder ruleBuilder = Rule.newBuilder();
            JsonFormat.parser().merge(jsonRequest, ruleBuilder);
            Rule rule = ruleBuilder.build();

            Optional<RuleDAO> updatedRule = ruleService.updateRule(id, rule);

            if (updatedRule.isPresent()) {
                // Convert the updated rule back to JSON
                String jsonResponse = JsonFormat.printer().print(updatedRule.get().getRule());
                return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (IOException e) {
            // Handle JSON parsing errors
            return new ResponseEntity<>("Invalid JSON request body.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            // Handle other exceptions (e.g., service layer errors)
            return new ResponseEntity<>("Failed to update rule: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Retrieve all rules
    @GetMapping
    public ResponseEntity<String> getAllRules() {
        List<RuleDAO> rules = ruleService.getAllRules();

        try {
            List<String> jsonRules = new ArrayList<>();

            for (RuleDAO rule : rules) {
                String jsonRule = JsonFormat.printer().print(rule.getRule());
                jsonRules.add(jsonRule);
            }

            // Convert the list of JSON strings to a JSON array
            String jsonArray = "[" + String.join(",", jsonRules) + "]";

            return new ResponseEntity<>(jsonArray, HttpStatus.OK);
        } catch (Exception e) {
            // Handle any JSON conversion errors
            return new ResponseEntity<>("Error converting to JSON.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Retrieve a rule by its ID
    @GetMapping("/{id}")
    public ResponseEntity<String> getRuleById(@PathVariable String id) {
        Optional<RuleDAO> rule = ruleService.getRuleById(id);

        if (rule.isPresent()) {
            try {
                // Convert the protobuf rule to JSON
                String jsonResponse = JsonFormat.printer().print(rule.get().getRule());
                return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
            } catch (IOException e) {
                return new ResponseEntity<>("Failed to convert rule to JSON.", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRuleById(@PathVariable String id) {
        try {
            ruleService.deleteRuleById(id);
            return new ResponseEntity<>("Rule deleted successfully.", HttpStatus.OK);
        } catch (Exception e) {
            // Handle exceptions (e.g., if the rule with the given ID does not exist)
            return new ResponseEntity<>("Failed to delete rule: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
