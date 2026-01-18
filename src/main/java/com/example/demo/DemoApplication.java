package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Value("${app.env.secret:default-secret}")
	private String secretValue;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Rudhra Koul Mahaan ki Production slot demol!!!" + secretValue;
	}

	@GetMapping("/env")
	public String env() {
		return "value of secret is: " + secretValue;
	}
}
