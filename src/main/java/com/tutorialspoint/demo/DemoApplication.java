package com.tutorialspoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class DemoApplication implements ApplicationRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}	

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Hello world from Application  Runner");
		
	}
	
}