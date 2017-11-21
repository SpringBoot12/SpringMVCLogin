package com.dev.pradeep.WebAppLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.dev.pradeep.WebAppLogin.*")
public class WebAppLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppLoginApplication.class, args);
	}
}
