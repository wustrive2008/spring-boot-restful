package com.wubaoguo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication 
@EnableScheduling
public class Application {
	
	@RequestMapping("/")
	@ResponseBody
    String home() {
        return "Hello World!";
    }
	
	public static void main(String[] args){  
        SpringApplication.run(Application.class, args);
    }  
}
