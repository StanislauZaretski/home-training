package com.train.domen.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({ "classpath:persistence-${envTarget:dev}.properties" })
public class AppConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    @Bean
    public HelloBean helloWorld() {
        HelloBean hw = new HelloBean();
        hw.setMessage("App Config Runmode: " + applicationName);
        return hw;
    }
}
