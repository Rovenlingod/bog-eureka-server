package com.example.bogeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BogEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BogEurekaServerApplication.class, args);
    }

}
