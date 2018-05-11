package com.infore.csep.etl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


//public class EtlApplication implements CommandLineRunner {
@SpringBootApplication
@ComponentScan("com.infore.csep")
@MapperScan(basePackages = "com.infore.csep.pojo.mapper")
@EnableScheduling
public class EtlApplication{

	public static void main(String[] args) {
		SpringApplication.run(EtlApplication.class, args);
	}

//	@Override
//	public void run(String... strings) throws Exception {
//
//	}
}
