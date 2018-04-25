package com.goodonedog.springcloudhystrix.controller;

import com.goodonedog.springcloudhystrix.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Integer result(Integer a, Integer b) {
        return clientService.consumer(a,b);
    }

}
