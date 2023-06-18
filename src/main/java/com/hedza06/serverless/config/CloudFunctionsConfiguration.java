package com.hedza06.serverless.config;

import com.hedza06.serverless.order.OrderService;
import com.hedza06.serverless.register.RegisterUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class CloudFunctionsConfiguration {

    private final RegisterUserService registerUserService;
    private final OrderService orderService;

    @Bean
    public Function<String, String> registerUser() {
        log.info("Register user function is triggered!");
        return registerUserService::handle;
    }

    @Bean
    public Function<String, String> orderFood() {
        log.info("Order food function is triggered!");
        return orderService::handle;
    }
}
