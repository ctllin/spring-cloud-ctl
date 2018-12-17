package com.ctl.spring.cloud.springcloudctl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
		//现在通过浏览器访问http://localhost:8888 可以看到Eureka的控制台，在那里能看到将来注册后的服务实例和一些状态和健康指标。
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}


