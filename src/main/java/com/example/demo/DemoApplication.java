package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        return "Hello Will!";
    }

    public static void main(String[] args) {

        for(int x = 0; x < 5; x++)
        {
            return x;
        }
        SpringApplication.run(DemoApplication.class, args);
    }

}