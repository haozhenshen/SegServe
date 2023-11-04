package com.hzs.grpc_client;


import com.google.common.util.concurrent.ListenableFuture;
import com.hzs.grpc_service.model.CampaignServiceGrpc;
import com.hzs.grpc_service.model.UserRequest;
import com.hzs.grpc_service.model.UserResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserCampaignClient {

    @GrpcClient("campaign-service-grpc")
    CampaignServiceGrpc.CampaignServiceFutureStub stub;

    @Bean
    public ListenableFuture<UserResponse> getUserCampaigns() {
        // Create a response observer to handle the server's response
        // Send the gRPC request and pass the response observer
        return stub.getUserCampaigns(UserRequest.newBuilder().setUserId("1").build());
    }
}

