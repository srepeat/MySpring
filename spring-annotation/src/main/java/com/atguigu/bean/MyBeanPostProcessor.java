package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//BeanPostProcessor ==>ºóÖÃ´¦ÀíÆ÷
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MyBeanPostProcessor....postProcessBeforeInitialization"+bean+"==>"+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MyBeanPostProcessor....postProcessAfterInitialization"+bean+"==>"+beanName);
		return bean;
	}

}
