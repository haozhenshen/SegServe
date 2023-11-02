package com.hzs.grpc_client;

import com.hzs.grpc_client.proto.CampaignServiceGrpc;
import com.hzs.grpc_client.proto.UserRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserCampaignClient {

    @GrpcClient("campaign-service-grpc")
    private final CampaignServiceGrpc.CampaignServiceStub stub;

    public UserCampaignClient(CampaignServiceGrpc.CampaignServiceStub stub) {
        this.stub = stub;
    }


    @Bean
    public void getUserCampaigns() {
        stub.getUserCampaigns(UserRequest.newBuilder().setUserId("1").build());
    }


}
