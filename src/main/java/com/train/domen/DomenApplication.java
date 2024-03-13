package com.train.domen;

import com.train.domen.Configuration.AppConfig;
import com.train.domen.Configuration.HelloBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DomenApplication {
    public static void main(String[] args) {
        SpringApplication.run(DomenApplication.class, args);
//		ApplicationContext context = new ClassPathXmlApplicationContext("helloconfig.xml"); //XML config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //Annotations config
        HelloBean helloBean = (HelloBean) context.getBean("helloWorld");
        helloBean.printMessage();
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return args -> {

            System.out.println("==== 1 == Let's inspect the beans provided by Spring Boot:====");

//            String[] beanNames = context.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            int index = 0;
//            for (String beanName : beanNames) {
//                System.out.println(index + " - " + beanName);
//                index++;
//            }

        };
    }

    @Bean
    public CommandLineRunner commandLineRunnerSecond(ApplicationContext context) {
        return args -> {
            System.out.println("==== 2 ==Let's inspect the beans provided by Spring Boot:=====");
        };
    }

}
