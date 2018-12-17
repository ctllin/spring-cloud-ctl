package com.ctl.spring.cloud.springcloudctl;

import com.ctl.spring.cloud.springcloudctl.controller.FeignClientController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientController.class, args);
	}

}

