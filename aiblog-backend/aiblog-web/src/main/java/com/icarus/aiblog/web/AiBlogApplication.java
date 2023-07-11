package com.icarus.aiblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.icarus.aiblog.*"})
public class AiBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiBlogApplication.class, args);
    }

}
