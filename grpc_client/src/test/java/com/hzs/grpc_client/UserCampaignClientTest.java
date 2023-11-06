package com.hzs.grpc_client;

import com.google.common.util.concurrent.ListenableFuture;
import com.hzs.grpc_service.model.RuleVersionPair;
import com.hzs.grpc_service.model.UserProfile;
import com.hzs.grpc_service.model.UserRequest;
import com.hzs.grpc_service.model.UserResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserCampaignClientTest {

    @Autowired
    private UserCampaignClient userCampaignClient;

    @Test
    public void testGetUserCampaigns() throws InterruptedException, ExecutionException, TimeoutException {
        UserRequest userRequest = UserRequest.newBuilder()
                .setUserId("1")
                .setUserProfile(
                        UserProfile.newBuilder()
                                .addRuleVersion(
                                        RuleVersionPair.newBuilder()
                                                .setRuleId("rule1") // Specify the rule ID you want
                                                .setVersion(1) // Specify the version of the rule
                                                .build()
                                )
                                .build()
                )
                .build();
        ListenableFuture<UserResponse> future = userCampaignClient.getUserCampaigns(userRequest);
        // You can add assertions based on the expected response from the gRPC server
        System.out.println(future.get().toString());
        assertEquals("campaign1", future.get().getCampaigns(0).getCampaignId());

    }
}
