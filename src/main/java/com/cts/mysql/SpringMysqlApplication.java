package com.cts.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.cts.mysql.*"})
public class SpringMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlApplication.class, args);
	}

}
