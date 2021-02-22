package com.fengfeng.dbtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

	private final CityMapper cityMapper;

	public StartApplication(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
		System.out.println("So easy ");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.cityMapper.findByState("CA"));
	}
}
