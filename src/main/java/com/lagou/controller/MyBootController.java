package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBootController {

    @RequestMapping("/hello")
    public String helloBoot() {
        return "hello";
    }
}
