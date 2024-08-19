package com.gestion_des_clients.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
		System.out.println("hello world");
	}
}

@RestController
@RequestMapping("/api")
class HelloController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello world";
	}
}
