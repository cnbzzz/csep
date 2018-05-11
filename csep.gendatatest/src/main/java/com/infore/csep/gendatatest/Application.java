package com.infore.csep.gendatatest;


import com.infore.csep.gendatatest.gendata.GenFactLeachHis;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.infore.csep")
@MapperScan(basePackages = "com.infore.csep.pojo.mapper")
@EnableScheduling
public class Application implements CommandLineRunner {

	@Autowired
	private GenFactLeachHis genFactLeachHis;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Start.......");
		genFactLeachHis.genOneRecord();
	}
}
