package com.train.domen.Configuration;

import com.train.domen.bean.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({ "classpath:persistence-${envTarget:dev}.properties" })
public class AppConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    @Bean(name = "CurrentConfigBean")
    public HelloBean helloWorld() {
        HelloBean hw = new HelloBean();
        hw.setMessage("Current App Config Runmode: " + applicationName);
        return hw;
    }

    @Bean
    public Item item(){
        return new Item();
    }

    @Bean(name = "customItemBean")
    public Item itemS(){
        return new Item("sqw");
    }
}
