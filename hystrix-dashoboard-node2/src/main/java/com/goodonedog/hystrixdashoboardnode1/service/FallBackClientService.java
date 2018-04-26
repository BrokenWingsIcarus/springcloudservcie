package com.goodonedog.hystrixdashoboardnode1.service;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class FallBackClientService implements ClientService {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    @RequestMapping("/add")
    public Integer sum(@RequestParam("a") Integer a,@RequestParam("b") Integer b) {
        logger.error("client服务已经崩溃");
        return null;
    }
}
