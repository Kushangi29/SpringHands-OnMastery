package com.learning.spring.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class D05P03 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	
		Battery bat= (Battery)context.getBean("battery");
		System.out.println(bat);
		
		Disc disc= (Disc)context.getBean("disc");
		System.out.println(disc);
	}
}
