package com.hzs.grpc_client;


import com.google.common.util.concurrent.ListenableFuture;
import com.hzs.grpc_service.model.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserCampaignClient {

    @GrpcClient("campaign-service-grpc")
    CampaignServiceGrpc.CampaignServiceFutureStub stub;


    public ListenableFuture<UserResponse> getUserCampaigns(UserRequest userRequest) {
        return stub.getUserCampaigns(userRequest);
    }
}

