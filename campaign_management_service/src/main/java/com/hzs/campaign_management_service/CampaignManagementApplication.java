package com.hzs.campaign_management_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CampaignManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampaignManagementApplication.class, args);
	}

}
