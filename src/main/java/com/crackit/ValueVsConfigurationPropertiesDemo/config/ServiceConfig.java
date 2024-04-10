package com.crackit.ValueVsConfigurationPropertiesDemo.config;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "services.access-token")
@Data
@Validated
public class ServiceConfig {

    private String baseUrl;

    //Validation can be performed
    @Size(max = 10, min = 3)
    private String clientId;

    //Relaxed binding
    private String clientSecret;
}
