package com.goodonedog.springcloudconsumerhystrixdashboard.controller;

import com.goodonedog.springcloudconsumerhystrixdashboard.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class ConsumerController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b){
      return clientService.sum(a,b);
    }

}
