package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.atguigu.bean.Person;

@PropertySource(value="classpath:/person.properties")
@Configuration //������
public class MyPropertyValue {

	@Bean  //����һ��bean
	public Person person() {
		return new Person();
	}
	
	
	
}
