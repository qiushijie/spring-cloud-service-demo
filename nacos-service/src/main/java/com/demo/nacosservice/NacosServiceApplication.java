package com.demo.nacosservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class NacosServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(NacosServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceApplication.class, args);
    }

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/")
    public String execute() {
        logger.info("execute");
        return "nacos-service port: " + port;
    }
}
