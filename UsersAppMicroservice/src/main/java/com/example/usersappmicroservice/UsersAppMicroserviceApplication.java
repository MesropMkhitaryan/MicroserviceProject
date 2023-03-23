package com.example.usersappmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UsersAppMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersAppMicroserviceApplication.class, args);
    }

}
