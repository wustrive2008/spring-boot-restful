package com.wubaoguo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication 
@EnableScheduling
@EnableAsync
@EnableCaching
public class Application {
	
	public static void main(String[] args){  
        SpringApplication.run(Application.class, args);
    }  
}
