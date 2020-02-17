package com.demo.eurekaclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    private static final Logger logger = LoggerFactory.getLogger(EurekaClientApplication.class);

    @Autowired
    private EurekaService eurekaService;

    @Autowired
    private NacosService nacosService;

    @RequestMapping("/")
    public String execute() {
        return eurekaService.execute() + " " + nacosService.execute();
    }

}
