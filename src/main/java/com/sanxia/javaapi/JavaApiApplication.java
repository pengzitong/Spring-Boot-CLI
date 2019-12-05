package com.sanxia.javaapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = {"com.sanxia.javaapi.dao"})

public class JavaApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
	}

}
