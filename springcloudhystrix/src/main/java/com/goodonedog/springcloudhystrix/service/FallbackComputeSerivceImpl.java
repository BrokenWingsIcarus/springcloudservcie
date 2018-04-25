package com.goodonedog.springcloudhystrix.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FallbackComputeSerivceImpl implements  ClientService {


    @Override
    public Integer consumer(@RequestParam("a") Integer a,@RequestParam("b") Integer b) {
        return null;
    }
}
