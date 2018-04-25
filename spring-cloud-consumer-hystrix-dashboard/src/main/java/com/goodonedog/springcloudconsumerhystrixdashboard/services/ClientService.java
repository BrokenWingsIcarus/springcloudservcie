package com.goodonedog.springcloudconsumerhystrixdashboard.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="compute-service", fallback = FallbackClientService.class)
public interface ClientService {

    @RequestMapping(value ="/add", method = RequestMethod.GET)
    public Integer sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
