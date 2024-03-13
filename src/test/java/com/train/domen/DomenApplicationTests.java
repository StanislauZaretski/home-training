package com.train.domen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DomenApplicationTests {

	@Autowired
	private ApplicationContext ctx;

	@Test
	void contextLoads() {
		System.out.println("Test case success");
	}

	@Test
	void allBeansExist() {
		String[] beanNames = ctx.getBeanDefinitionNames();
		assertThat(beanNames).contains("helloWorld");
	}

}