package com.hzs.campaign_management_service.repository;

import com.hzs.campaign_management_service.model.RuleDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RuleRepository extends MongoRepository<RuleDAO, String> {
}