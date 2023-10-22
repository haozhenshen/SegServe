package com.hzs.SegServe.Controller;

import com.google.protobuf.util.JsonFormat;
import com.hzs.SegServe.model.CampaignDAO;
import com.hzs.SegServe.proto.Campaign;
import com.hzs.SegServe.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    private final CampaignService campaignService;

    @Autowired
    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    // Create a new campaign
    @PostMapping
    public ResponseEntity<String> createCampaign(@RequestBody String jsonRequest) {
        try {
            // Parse JSON to protobuf
            Campaign.Builder campaignBuilder = Campaign.newBuilder();
            JsonFormat.parser().merge(jsonRequest, campaignBuilder);
            Campaign campaign = campaignBuilder.build();

            // Create the campaign
            CampaignDAO createdCampaign = campaignService.createCampaign(campaign);

            // Convert the created campaign back to JSON
            String jsonResponse = JsonFormat.printer().print(createdCampaign.getCampaign());

            return new ResponseEntity<>(jsonResponse, HttpStatus.CREATED);
        } catch (IOException e) {
            // Handle JSON parsing errors
            return new ResponseEntity<>("Invalid JSON request body.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            // Handle other exceptions (e.g., service layer errors)
            return new ResponseEntity<>("Failed to create campaign: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Update an existing campaign
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCampaign(@PathVariable String id, @RequestBody String jsonRequest) {
        try {
            // Parse JSON to protobuf
            Campaign.Builder campaignBuilder = Campaign.newBuilder();
            JsonFormat.parser().merge(jsonRequest, campaignBuilder);
            Campaign campaign = campaignBuilder.build();

            Optional<CampaignDAO> updatedCampaign = campaignService.updateCampaign(id, campaign);

            if (updatedCampaign.isPresent()) {
                // Convert the updated campaign back to JSON
                String jsonResponse = JsonFormat.printer().print(updatedCampaign.get().getCampaign());
                return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (IOException e) {
            // Handle JSON parsing errors
            return new ResponseEntity<>("Invalid JSON request body.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            // Handle other exceptions (e.g., service layer errors)
            return new ResponseEntity<>("Failed to update campaign: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Retrieve all campaigns
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getAllCampaigns() {
        List<CampaignDAO> campaigns = campaignService.getAllCampaigns();

        try {
            List<String> jsonCampaigns = new ArrayList<>();

            for (CampaignDAO campaign : campaigns) {
                String jsonCampaign = JsonFormat.printer().print(campaign.getCampaign());
                jsonCampaigns.add(jsonCampaign);
            }

            // Convert the list of JSON strings to a JSON array
            String jsonArray = "[" + String.join(",", jsonCampaigns) + "]";

            return new ResponseEntity<>(jsonArray, HttpStatus.OK);
        } catch (Exception e) {
            // Handle any JSON conversion errors
            return new ResponseEntity<>("Error converting to JSON.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Retrieve a campaign by its ID
    @GetMapping("/{id}")
    public ResponseEntity<String> getCampaignById(@PathVariable String id) {
        Optional<CampaignDAO> campaign = campaignService.getCampaignById(id);

        if (campaign.isPresent()) {
            try {
                // Convert the protobuf campaign to JSON
                String jsonResponse = JsonFormat.printer().print(campaign.get().getCampaign());
                return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
            } catch (IOException e) {
                return new ResponseEntity<>("Failed to convert campaign to JSON.", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Find campaigns by a specific rule
//    @GetMapping("/rule")
//    public ResponseEntity<List<Campaign>> findCampaignsByRule(
//            @RequestParam(name = "content_id", required = false) String contentId,
//            @RequestParam(name = "subscription_id", required = false) String subscriptionId,
//            @RequestParam(name = "plan_name", required = false) String planName,
//            @RequestParam(name = "last_login_date", required = false) String lastLoginDate) {
//
//        // Create a Rule object based on the query parameters
//        Rule.Builder ruleBuilder = Rule.newBuilder();
//
//        if (contentId != null) {
//            ruleBuilder.getPlayActivityRuleBuilder().setContentId(contentId);
//        }
//
//        if (subscriptionId != null || planName != null) {
//            SubscriptionRule.Builder subscriptionRuleBuilder = SubscriptionRule.newBuilder();
//            if (subscriptionId != null) {
//                subscriptionRuleBuilder.setSubscriptionId(subscriptionId);
//            }
//            if (planName != null) {
//                subscriptionRuleBuilder.setPlanName(planName);
//            }
//            ruleBuilder.setSubscriptionRule(subscriptionRuleBuilder);
//        }
//
//        if (lastLoginDate != null) {
//            LoginActivityRule.Builder loginActivityRuleBuilder = LoginActivityRule.newBuilder();
//            loginActivityRuleBuilder.setLastLoginDate(lastLoginDate);
//            ruleBuilder.setLoginActivityRule(loginActivityRuleBuilder);
//        }
//
//        Rule rule = ruleBuilder.build();
//
//        // Use the rule to filter campaigns
//        List<Campaign> campaigns = campaignService.findCampaignsByRule(rule);
//
//        return new ResponseEntity<>(campaigns, HttpStatus.OK);
//    }

    // Delete a campaign by its ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCampaignByCampaignId(@PathVariable String id) {
        campaignService.deleteCampaignById(id);
    }
}