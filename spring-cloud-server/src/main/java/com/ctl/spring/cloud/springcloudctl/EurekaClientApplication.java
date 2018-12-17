package com.ctl.spring.cloud.springcloudctl;

import com.ctl.spring.cloud.springcloudctl.service.GreetingService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class EurekaClientApplication implements GreetingService {
	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

    @RequestMapping("/greeting")
	public String greeting() {
		System.out.println("eurekaClient:"+eurekaClient);
		return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}
//	@RequestMapping("/hello2")
//	@ResponseBody
//	public Map<String,Object> hello2() {
//		System.out.println("eurekaClient:"+eurekaClient);
//		Map<String,Object> returnMap = new HashMap<>();
//		String value = String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
//		returnMap.put("key",value);
//		return returnMap;
//	}
}
