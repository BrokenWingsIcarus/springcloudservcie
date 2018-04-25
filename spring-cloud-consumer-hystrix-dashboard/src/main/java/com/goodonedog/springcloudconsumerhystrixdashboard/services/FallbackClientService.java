package com.goodonedog.springcloudconsumerhystrixdashboard.services;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FallbackClientService implements  ClientService {
    @Override
    public Integer sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return null;
    }
}
