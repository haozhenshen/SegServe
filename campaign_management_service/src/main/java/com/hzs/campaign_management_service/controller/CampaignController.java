package com.hzs.campaign_management_service.controller;

import com.google.protobuf.util.JsonFormat;
import com.hzs.campaign_management_service.model.CampaignDAO;
import com.hzs.campaign_management_service.model.Campaign;
import com.hzs.campaign_management_service.service.CampaignService;
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
    public ResponseEntity<String> getAllCampaigns() {
        List<CampaignDAO> campaigns = campaignService.getAllCampaigns();
        return getStringResponseEntity(campaigns);
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

    // Retrieve campaigns by ruleId
    @GetMapping("/by-rule")
    public ResponseEntity<String> getCampaignsByRuleId(@RequestParam("ruleId") String ruleId) {
        List<CampaignDAO> campaigns = campaignService.getAllCampaignsByRuleId(ruleId);

        return getStringResponseEntity(campaigns);
    }


    // Delete a campaign by its ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCampaignByCampaignId(@PathVariable String id) {
        campaignService.deleteCampaignById(id);
    }

    private ResponseEntity<String> getStringResponseEntity(List<CampaignDAO> campaigns) {
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
}