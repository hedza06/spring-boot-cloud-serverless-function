package com.hedza06.serverless.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    public String handle(String payload) {
        log.info("Request payload for ordering food: {}", payload);

        // business logic goes here (wrapped in try-catch block)

        return "food-ordered";
    }

}
