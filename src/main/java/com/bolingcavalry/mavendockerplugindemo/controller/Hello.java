package com.bolingcavalry.mavendockerplugindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
    	//修改返回的字符串的内容
        String a="fool";
        return "Hello jenkins, " + new Date();
    }
}
