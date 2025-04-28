package com.cicdP.CICDP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CicdpApplication {

	@GetMapping("/get")
	public String getma(){
		return "I am Vinay git action";
	}


	public static void main(String[] args) {
		SpringApplication.run(CicdpApplication.class, args);
	}

}
