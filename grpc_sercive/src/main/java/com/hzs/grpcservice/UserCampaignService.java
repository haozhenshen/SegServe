package com.hzs.grpcservice;

import com.hzs.grpc_service.proto.Campaign;
import com.hzs.grpc_service.proto.CampaignServiceGrpc;
import com.hzs.grpc_service.proto.UserRequest;
import com.hzs.grpc_service.proto.UserResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserCampaignService extends CampaignServiceGrpc.CampaignServiceImplBase {

    @Override
    public void getUserCampaigns(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        UserResponse response = UserResponse.newBuilder().addCampaigns(Campaign.newBuilder()
                .setCampaignId("1")
                .setCampaignName("campaign1")
                .setRuleId("1")
                .build()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    public void getUserCampaigns() {

    }


}
