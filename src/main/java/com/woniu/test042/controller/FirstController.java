package com.woniu.test042.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("say")
    public String say(){
        System.out.println(1);
        System.out.println(2);
        return "hello";
    }
}
