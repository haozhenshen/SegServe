package com.hzs.grpc_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class GrpcServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcServiceApplication.class, args);
	}

}
