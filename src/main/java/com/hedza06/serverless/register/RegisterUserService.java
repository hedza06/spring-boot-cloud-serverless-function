package com.hedza06.serverless.register;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegisterUserService {

    public String handle(String payload) {
        log.info("Request payload for registering user: {}", payload);

        // **Logic goes here... For example:**
        // - convert received payload to class (DTO)
        // - connect to database and check if user exists
        // - insert data into database
        // - wrap all code in try and catch

        return "success";
    }

}
