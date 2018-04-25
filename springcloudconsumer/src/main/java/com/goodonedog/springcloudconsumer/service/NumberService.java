package com.goodonedog.springcloudconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "compute-service")
public interface NumberService {

    @RequestMapping(value="add")
    public Integer add(@RequestParam("a") Integer a , @RequestParam("b") Integer b);
}
