package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SecondAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondAppApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
