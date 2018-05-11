package com.infore.csep.receiver;

import com.infore.csep.receiver.netty.NettyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceiverApplication implements CommandLineRunner {

	@Autowired
	private NettyServer nettyServer;

	public static void main(String[] args) {
		SpringApplication.run(ReceiverApplication.class, args);
	}

	public void run(String... args) throws Exception {
		nettyServer.start();
	}
}
