package com.icarus.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AiBlogAdminApplication {

    public static void main(String[] args) {
        //SpringApplication.run(AiBlogAdminApplication.class, args);
        SpringApplication.run(AiBlogAdminApplication.class, args);
    }
}
