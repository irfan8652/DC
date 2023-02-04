package com.rajnish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDiscoveryClient
public class DeterminationElivigilityModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeterminationElivigilityModuleApplication.class, args);
	}

}
