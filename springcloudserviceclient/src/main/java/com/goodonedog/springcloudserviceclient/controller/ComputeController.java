package com.goodonedog.springcloudserviceclient.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/add")
    public Integer add(Integer a , Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer result = a + b;
        logger.info("计算a=" +a + "b=" + b +",a+b=" + result);
        logger.debug(instance.getMetadata());
        return  result;
    }
}
