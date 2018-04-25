package com.goodonedog.hystrixdashboardturbine.controller;

import com.goodonedog.hystrixdashboardturbine.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */

@RestController
public class ConsumerController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Integer sum(@RequestParam("a")Integer a ,@RequestParam("b")Integer b) {
        Integer sum = clientService.sum(a, b);
        return sum;
    }
}
