package com.mytests.spring.placeholderInComponentsScan.main;

import com.mytests.spring.placeholderInComponentsScan.second.SecondPackageService;
import com.mytests.spring.placeholderInComponentsScan.third.ThirdPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private SecondPackageService pkg2Service;
    @Autowired
    private ThirdPackageService pkg3Service;

    @GetMapping("/second")
    public String second() {
        return pkg2Service.getServiceMessage();
    }

    @GetMapping("/third")
    public String third() {
        return pkg3Service.getServiceMessage();
    }
}
