package com.chinaunicom.cn.portalWeb.controller;

import com.chinaunicom.cn.portalWeb.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portalWeb")
public class TestController {
    @Autowired
    private  SayHello sayHello;
    @RequestMapping("sayHello")
    public String sayHello(){
        String name = "lfy";
        return sayHello.sayHello(name);
    }
}
