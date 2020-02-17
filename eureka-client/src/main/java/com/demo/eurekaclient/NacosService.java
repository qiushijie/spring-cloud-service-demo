package com.demo.eurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "nacos-service")
public interface NacosService {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String execute();

}
