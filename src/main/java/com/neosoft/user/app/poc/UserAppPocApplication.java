package com.neosoft.user.app.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserAppPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserAppPocApplication.class, args);
    }

}
