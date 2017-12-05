package com.chinaunicom.cn.portalWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class PortalWebApplication {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String home(Model model) {
		//model.addAttribute("Name","lfy");
		return  "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(PortalWebApplication.class, args);
	}
}
