package com.kscapser.rest.api.spock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpockApplication.class, args);
    }

}
