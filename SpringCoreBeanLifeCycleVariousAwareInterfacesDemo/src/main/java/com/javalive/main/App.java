package com.javalive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalive.beans.AwareBean;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		AwareBean bean = (AwareBean) context.getBean("awareBean");
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
