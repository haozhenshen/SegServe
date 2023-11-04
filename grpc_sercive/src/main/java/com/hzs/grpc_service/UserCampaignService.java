package com.hzs.grpc_service;


import com.hzs.grpc_service.model.Campaign;
import com.hzs.grpc_service.model.CampaignServiceGrpc;
import com.hzs.grpc_service.model.UserRequest;
import com.hzs.grpc_service.model.UserResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserCampaignService extends CampaignServiceGrpc.CampaignServiceImplBase {

    @Override
    public void getUserCampaigns(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        UserResponse response = UserResponse.newBuilder()
                .setResTest("test")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

}