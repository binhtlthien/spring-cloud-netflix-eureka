package com.binhtlt.springcloudnetflixeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudNetflixEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixEurekaServerApplication.class, args);
	}

}