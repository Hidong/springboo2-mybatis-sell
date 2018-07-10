package com.xxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxx.mapper")
public class Springboo2MybatisSellApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboo2MybatisSellApplication.class, args);
	}
}
