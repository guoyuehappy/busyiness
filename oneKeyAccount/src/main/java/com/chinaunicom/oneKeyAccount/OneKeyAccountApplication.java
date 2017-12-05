package com.chinaunicom.oneKeyAccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
@EnableEurekaClient
public class OneKeyAccountApplication {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("Name","lfy");
		return  "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(OneKeyAccountApplication.class, args);
	}
}
