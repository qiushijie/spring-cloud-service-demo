package com.demo.eurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-service")
public interface EurekaService {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String execute();

}
