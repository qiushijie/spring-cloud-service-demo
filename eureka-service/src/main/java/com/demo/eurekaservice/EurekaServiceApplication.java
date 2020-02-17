package com.demo.eurekaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class EurekaServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(EurekaServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/")
    public String execute() {
        logger.info("execute");
        return "eureka-service port: " + port;
    }

}
