package com.libra.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.libra.demo.mapper")
@ComponentScan(basePackages= {"com.libra.demo"})
public class LibraDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraDemoApplication.class, args);
	}

}
