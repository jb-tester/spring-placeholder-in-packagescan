package com.mytests.spring.placeholderInComponentsScan.second;

import org.springframework.stereotype.Service;

@Service
public class SecondPackageService {
    public String getServiceMessage() {
       return "from SecondPackageService";
    }


}
