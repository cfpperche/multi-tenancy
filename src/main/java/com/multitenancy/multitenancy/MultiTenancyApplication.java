package com.multitenancy.multitenancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MultiTenancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiTenancyApplication.class, args);
	}

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		return "Hello, " + name + "!";
	}
}