package com.hzs.SegServe.repository;

import com.hzs.SegServe.proto.Rule;
import com.hzs.SegServe.proto.Target;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends MongoRepository<Campaign, String> {
    List<Campaign> findByRule(Rule rule);
}
