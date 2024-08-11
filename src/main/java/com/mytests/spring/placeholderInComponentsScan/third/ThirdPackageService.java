package com.mytests.spring.placeholderInComponentsScan.third;

import org.springframework.stereotype.Service;

@Service
public class ThirdPackageService {

    public String getServiceMessage() {
        return "from ThirdPackageService";
    }
}
