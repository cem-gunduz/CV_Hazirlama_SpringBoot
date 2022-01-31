package com.hoaxify.wss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class WssApplication {

	public static void main(String[] args) {
		SpringApplication.run(WssApplication.class, args);
	}

}
