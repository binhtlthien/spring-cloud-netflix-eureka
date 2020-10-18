package com.binhtlt.springcloudnetflixeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudNetflixEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixEurekaClientApplication.class, args);
	}

}
