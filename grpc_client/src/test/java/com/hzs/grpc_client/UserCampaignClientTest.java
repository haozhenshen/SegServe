package com.hzs.grpc_client;

import com.google.common.util.concurrent.ListenableFuture;
import com.hzs.grpc_client.UserCampaignClient;
import com.hzs.grpc_service.model.UserResponse;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserCampaignClientTest {

    @Autowired
    private UserCampaignClient userCampaignClient;

    @Test
    public void testGetUserCampaigns() throws InterruptedException, ExecutionException, TimeoutException {

        ListenableFuture<UserResponse> future = userCampaignClient.getUserCampaigns();
        // You can add assertions based on the expected response from the gRPC server
        assertEquals("test", future.get().getResTest());

    }
}
