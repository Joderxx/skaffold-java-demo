package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This class serves as an entry point for the Spring Boot app
 * Here, we check to ensure all required environment variables are set
 */
@SpringBootApplication
@Controller
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(final String[] args) throws Exception {
        String port = System.getenv("PORT");
        if (port == null) {
            logger.warn("$PORT environment variable not set");
        }
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello22";
    }
}
