package com.hzs.SegServe.service;

import com.hzs.SegServe.model.CampaignDAO;
import com.hzs.SegServe.proto.Campaign;
import com.hzs.SegServe.repository.CampaignRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignService {

    private final CampaignRepository campaignRepository;

    @Autowired
    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    // Create a new campaign
    public CampaignDAO createCampaign(Campaign campaign) {
        ObjectId uid = new ObjectId();

        // Convert the Campaign to a mutable builder
        Campaign.Builder campaignBuilder = campaign.toBuilder();

        // Set the campaign_id field using the builder
        campaignBuilder.setCampaignId(uid.toString());

        // Build the Campaign object from the builder
        Campaign updatedCampaign = campaignBuilder.build();

        // Save the updated campaign to MongoDB

        return campaignRepository.save( new CampaignDAO(updatedCampaign));
    }

    // Retrieve all campaigns
    public List<CampaignDAO> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    // Retrieve a campaign by its ID
    public Optional<CampaignDAO> getCampaignById(String campaignId) {
        return campaignRepository.findById(campaignId);
    }

    // Find campaigns by a specific rule
//    public List<Campaign> findCampaignsByRule(Rule rule) {
//        return campaignRepository.findByRule(rule);
//    }

    public Optional<CampaignDAO> updateCampaign(String id, Campaign campaign) {
        Optional<CampaignDAO> existingCampaign = getCampaignById(id);

        if (existingCampaign.isPresent()) {
            return Optional.of(campaignRepository.save(new CampaignDAO(campaign)));
        } else {
            // Campaign with the given ID does not exist
            return Optional.empty();
        }
    }

    // Delete a campaign by its ID
    public void  deleteCampaignById(String campaignId) {
        campaignRepository.deleteById(campaignId);
    }
}
