package com.infore.csep.test.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyClientApplication implements CommandLineRunner {

	@Autowired
	private NettyClient nettyClient;

	public static void main(String[] args) {
		SpringApplication.run(NettyClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		nettyClient.start();
	}
}
