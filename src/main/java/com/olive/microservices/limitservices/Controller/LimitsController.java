package com.olive.microservices.limitservices.Controller;

import com.olive.microservices.limitservices.Beans.Limits;
import com.olive.microservices.limitservices.Configurations.Configurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configurations configurations;

    @GetMapping("/limits")
    public Limits retriveLimits(){

     return new Limits(configurations.getMinimum(),configurations.getMaximum());

    }
}
