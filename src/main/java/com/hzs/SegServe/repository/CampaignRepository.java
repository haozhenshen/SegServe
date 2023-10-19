package com.hzs.SegServe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends MongoRepository<CampaignProto.Campaign, String> {

    public CampaignProto.Campaign findByCa
}
