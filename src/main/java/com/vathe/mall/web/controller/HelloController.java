package com.vathe.mall.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {


    @RequestMapping()
    public String index(String name) {
        return "hello, " + name;
    }

}
