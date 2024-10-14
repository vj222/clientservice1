package com.example.clientservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@ComponentScan
@RestController
@RequestMapping(path = "/clientservice1")
public class ClientService1Controller {

    @Autowired
    private Environment env;

//    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    @GetMapping(path ="/getMessage")
    @ResponseBody
    public String getMessage() {
        System.out.println("getMessage method");
        return new String( env.getProperty("welcome.message"));
    }
}
