package com.goodonedog.springcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringcloudconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconsumerApplication.class, args);
    }
}
