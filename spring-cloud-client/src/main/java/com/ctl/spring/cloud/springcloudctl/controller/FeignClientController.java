package com.ctl.spring.cloud.springcloudctl.controller;

import com.ctl.spring.cloud.springcloudctl.service.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: FeignClientController</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.hanshow.com</p>
 *
 * @author guolin
 * @version 1.0
 * @date 2018-12-17 15:06
 */
@RestController
public class FeignClientController {
    @Autowired
    private GreetingClient greetingClient;

    @RequestMapping("/greeting")
    public String greeting(Model model) {
         model.addAttribute("greetingValue", greetingClient.greeting());
        System.out.println("request=greeting");
        return "greeting";
    }
}
