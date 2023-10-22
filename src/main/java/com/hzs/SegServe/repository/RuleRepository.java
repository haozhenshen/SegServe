package com.hzs.SegServe.repository;

import com.hzs.SegServe.model.RuleDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RuleRepository extends MongoRepository<RuleDAO, String> {
}