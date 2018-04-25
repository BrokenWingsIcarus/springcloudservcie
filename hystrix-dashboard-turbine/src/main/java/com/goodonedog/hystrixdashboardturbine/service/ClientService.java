package com.goodonedog.hystrixdashboardturbine.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "compute-service", fallback = void.class)
public interface ClientService  {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer sum(@RequestParam("a") Integer a, @RequestParam("b")Integer b);
}
