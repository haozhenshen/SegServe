package com.hzs.SegServe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SegServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegServeApplication.class, args);
	}

}
