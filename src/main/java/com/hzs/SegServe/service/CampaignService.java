package com.hzs.SegServe.service;

import com.hzs.SegServe.proto.Rule;
import com.hzs.SegServe.repository.CampaignRepository;
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
    public Campaign createCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    // Retrieve all campaigns
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    // Retrieve a campaign by its ID
    public Optional<Campaign> getCampaignById(String id) {
        return campaignRepository.findById(id);
    }

    // Find campaigns by a specific rule
    public List<Campaign> findCampaignsByRule(Rule rule) {
        return campaignRepository.findByRule(rule);
    }

    public Optional<Campaign> updateCampaign(String id, Campaign campaign) {
        Optional<Campaign> existingCampaign = getCampaignById(id);

        if (existingCampaign.isPresent()) {
            return Optional.of(campaignRepository.save(campaign));
        } else {
            // Campaign with the given ID does not exist
            return Optional.empty();
        }
    }

    // Delete a campaign by its ID
    public void deleteCampaignById(String id) {
        campaignRepository.deleteById(id);
    }
}
