package com.mytests.spring.placeholderInComponentsScan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"${application.scan-package}"})
public class Application  {


    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
    }


}
