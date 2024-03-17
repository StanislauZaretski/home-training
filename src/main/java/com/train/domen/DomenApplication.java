package com.train.domen;

import com.train.domen.Configuration.AppConfig;
import com.train.domen.Configuration.HelloBean;
import com.train.domen.data.model.Customer;
import com.train.domen.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class DomenApplication {
    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(DomenApplication.class, args);
//		ApplicationContext context = new ClassPathXmlApplicationContext("helloconfig.xml"); //XML config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //Annotations config
        HelloBean helloBean = (HelloBean) context.getBean("CurrentConfigBean");
        helloBean.printMessage();


    }

    @Bean(name = "CLI - 1")
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

    @Bean(name = "CLI - 2")
    public CommandLineRunner commandLineRunnerSecond(ApplicationContext context) {
        return args -> {
            System.out.println("==== 2 ==Let's inspect the beans provided by Spring Boot:=====");
        };
    }

    @Bean(name = "CLI - 3")
    public CommandLineRunner run(CustomerService customerService) throws Exception {
        return args -> {
            Iterable<Customer> customers = customerService.getAllCustomers();
            System.out.println("==== 3 == Let's inspect database. has any? - " + customers.iterator().hasNext());
            for (Customer customer : customers) {
                System.out.println(customer);
            }
            customerService.getOrders().forEach(System.out::println);
        };
    }

}
