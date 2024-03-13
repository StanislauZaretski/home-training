package com.train.domen.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloBean helloWorld() {
        HelloBean hw = new HelloBean();
        hw.setMessage("Hello App Config");
        return hw;
    }
}
