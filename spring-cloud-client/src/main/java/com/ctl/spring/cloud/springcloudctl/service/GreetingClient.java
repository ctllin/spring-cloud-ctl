package com.ctl.spring.cloud.springcloudctl.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: GreetingClient</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.hanshow.com</p>
 *
 * @author guolin
 * @version 1.0
 * @date 2018-12-17 15:05
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient{
    @RequestMapping("/greeting")
    String greeting();
}