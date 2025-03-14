package com.walmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WalmartItemSetupAppApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(WalmartItemSetupAppApplication.class,args);
		System.out.println("IOC-Container is :: " + applicationContext.getClass().getName());
	}
}
