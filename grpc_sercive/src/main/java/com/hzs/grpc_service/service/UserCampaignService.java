package com.hzs.grpc_service.service;


import com.hzs.grpc_service.model.*;
import com.hzs.grpc_service.repository.CampaignRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@GrpcService
public class UserCampaignService extends CampaignServiceGrpc.CampaignServiceImplBase {


    private final CampaignRepository campaignRepository;

    @Autowired
    public UserCampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    @Override
    public void getUserCampaigns(UserRequest userRequest, StreamObserver<UserResponse> responseObserver) {
        Set<String> uniqueCampaignIds = new HashSet<>();
        List<Campaign> uniqueCampaigns = new ArrayList<>();

        if (userRequest.hasUserProfile()) {
            List<RuleVersionPair> ruleVersionList = userRequest.getUserProfile().getRuleVersionList();
            for (RuleVersionPair ruleVersionPair : ruleVersionList) {
                String ruleId = ruleVersionPair.getRuleId();
                List<CampaignDAO> campaigns = campaignRepository.findByRuleId(ruleId);
                for (CampaignDAO campaignDAO : campaigns) {
                    String campaignId = campaignDAO.getId();
                    if (uniqueCampaignIds.add(campaignId)) {
                        uniqueCampaigns.add(campaignDAO.getCampaign());
                    }
                }
            }
        }

        UserResponse response = UserResponse.newBuilder().addAllCampaigns(uniqueCampaigns).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

}