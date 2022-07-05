package com.silviurm.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTest1Application {

	@GetMapping("/message")
	public String message(){
		return "Salutare lume";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTest1Application.class, args);
	}

}
