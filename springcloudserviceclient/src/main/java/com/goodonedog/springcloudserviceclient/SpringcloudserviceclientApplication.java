package com.goodonedog.springcloudserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudserviceclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudserviceclientApplication.class, args);
    }
}
