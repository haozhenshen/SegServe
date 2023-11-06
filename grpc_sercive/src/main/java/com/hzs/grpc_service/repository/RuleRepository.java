package com.hzs.grpc_service.repository;

import com.hzs.grpc_service.model.RuleDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RuleRepository extends MongoRepository<RuleDAO, String> {
}