package com.hzs.grpc_service.repository;

import com.hzs.grpc_service.model.CampaignDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CampaignRepository extends MongoRepository<CampaignDAO, String> {
    List<CampaignDAO> findByRuleId(String ruleId);

    void deleteByRuleId(String ruleId);

}
