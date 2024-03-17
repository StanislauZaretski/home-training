package com.train.domen.endpoint;

import com.train.domen.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class TestController {

    private CustomerService customerService;

    @GetMapping("/")
    public String index() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Greetings from Spring Boot!<br>");
        customerService.getAllCustomers().forEach(customer -> sb.append(customer.toString()).append("<br>"));
        sb.append("</p>");
        return sb.toString();
    }
}
