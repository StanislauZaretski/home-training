package com.train.domen.Endpoints;

import com.train.domen.Configuration.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
