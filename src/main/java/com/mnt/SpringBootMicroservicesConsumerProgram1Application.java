package com.mnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootMicroservicesConsumerProgram1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesConsumerProgram1Application.class, args);
	}

}
