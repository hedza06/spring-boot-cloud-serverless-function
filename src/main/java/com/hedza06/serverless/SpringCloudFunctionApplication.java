package com.hedza06.serverless;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionApplication.class, args);
    }
}
