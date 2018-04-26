package com.goodonedog.hystrixdashoboardnode1.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-producer",fallback=FallBackClientService.class)
public interface ClientService  {

    @RequestMapping("/add")
    public Integer sum(@RequestParam("a")Integer a, @RequestParam("b")Integer b);
}
