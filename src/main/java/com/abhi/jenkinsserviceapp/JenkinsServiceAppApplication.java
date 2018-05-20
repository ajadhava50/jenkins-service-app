package com.abhi.jenkinsserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsServiceAppApplication.class, args);
		System.out.println("service started");
	}
}
