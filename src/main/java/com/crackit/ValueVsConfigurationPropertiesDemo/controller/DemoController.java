package com.crackit.ValueVsConfigurationPropertiesDemo.controller;

import com.crackit.ValueVsConfigurationPropertiesDemo.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crackit/v1/ValueVsConfigurationProperties")
public class DemoController {

    @Value("${employee.age}")
    private String age;

    @Autowired
    private ServiceConfig serviceConfig;

    @GetMapping("/valueDemo")
    public String getAge() {
        return "Welcome to crackIT!!! This is your age : " + age ;
    }

    @GetMapping("/configurationPropertiesDemo")
    public String studentDetails() {
        return "Base url :" + serviceConfig.getBaseUrl() +
                " \nclientId :" + serviceConfig.getClientId() +
                " \nclientSecret :" + serviceConfig.getClientSecret();
    }


}
