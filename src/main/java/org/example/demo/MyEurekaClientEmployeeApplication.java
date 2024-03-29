package org.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MyEurekaClientEmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyEurekaClientEmployeeApplication.class, args);
	}
}
