package com.hzs.SegServe.repository;

import com.hzs.SegServe.model.CampaignDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CampaignRepository extends MongoRepository<CampaignDAO, String> {
//    List<CampaignDAO> findByCampaign_CampaignId(Rule rule);

}
