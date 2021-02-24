package com.fengfeng.dbtest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());



	@Override
	public void run(String...args) throws Exception {


	}


	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
		System.out.println("So easy ");
	}


}
