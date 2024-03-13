package com.train.domen.Configuration;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HelloBean {

    private String message;

    public void printMessage() {
        System.out.println("Your message: " + message);
    }
}
