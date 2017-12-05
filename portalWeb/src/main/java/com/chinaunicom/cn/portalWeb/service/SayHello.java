package com.chinaunicom.cn.portalWeb.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("oneKeyAccount")
public interface SayHello {
    @RequestMapping("hello/{name}")
   String sayHello(@RequestParam("name") String name);
}
