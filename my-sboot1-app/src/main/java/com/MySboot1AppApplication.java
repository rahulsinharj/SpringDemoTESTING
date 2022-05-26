package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySboot1AppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MySboot1AppApplication.class, args);

		System.out.println("MySboot1 running");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MySboot1 is running fine !");
	}
}
