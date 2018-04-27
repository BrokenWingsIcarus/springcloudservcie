package com.goodonedog.springcloudserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpringcloudserviceclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudserviceclientApplication.class, args);
    }
}
