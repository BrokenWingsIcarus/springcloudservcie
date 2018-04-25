package com.goodonedog.springcloudconsumer.controller;

import com.goodonedog.springcloudconsumer.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private NumberService numberService;

    @RequestMapping(value = "/hello", method =  RequestMethod.GET)
    public Integer numberAdd(Integer a, Integer b){
        return numberService.add(a,b);
    }
}
