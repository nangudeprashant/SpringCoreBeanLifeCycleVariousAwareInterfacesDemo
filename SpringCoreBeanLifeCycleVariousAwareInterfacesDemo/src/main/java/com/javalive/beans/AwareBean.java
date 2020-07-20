package com.javalive.beans;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBean implements ApplicationContextAware,BeanNameAware,BeanFactoryAware{
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	       System.out.println("setBeanFactory method of BeanFactoryAware interface implemented by AwareBean class is called");
	       System.out.println("setBeanFactory:: Aware bean singleton="
	                + beanFactory.isSingleton("awareBean"));
	}
	public void setBeanName(String beanName) {
	     System.out.println("setBeanName method of BeanNameAware interface implemented by AwareBean class is called");
	     System.out.println("setBeanName:: Bean Name defined in context="
	                    + beanName);
	}
	public void setApplicationContext(ApplicationContext applicationContext)
	        throws BeansException {
	        System.out.println("setApplicationContext method of ApplicationContextAware interface implemented by AwareBean class is called");
	        System.out.println("setApplicationContext:: Bean Definition Names="
	                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
	}
