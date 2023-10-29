package com.hzs.campaign_management_service.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hzs.campaign_management_service.proto.Campaign;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "campaignDAOs")
public class CampaignDAO {
    @Id
    @JsonIgnore
    private String id;

    private String campaignName;

    private String ruleId;

    private Campaign campaign;

    @JsonCreator
    public CampaignDAO(Campaign campaign) {
        this.id = campaign.getCampaignId();
        this.campaignName = campaign.getCampaignName();
        this.ruleId = campaign.getRuleId();
        this.campaign = campaign;
    }
}

