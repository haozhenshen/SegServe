package com.hzs.SegServe.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hzs.SegServe.proto.Campaign;
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

    private Campaign campaign;

    @JsonCreator
    public CampaignDAO(Campaign campaign) {
        this.id = campaign.getCampaignId();
//        this.name = campaign.getCampaignName();
        this.campaign = campaign;
    }
}


