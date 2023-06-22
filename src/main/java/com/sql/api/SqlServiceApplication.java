package com.sql.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.sql.api" })
public class SqlServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlServiceApplication.class, args);
	}

}

