package com.atguigu.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Dog implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("Dog....");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Dog....@PostConstruct.....");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("Dog.....@PreDestroy........");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
}
