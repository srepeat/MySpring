package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.atguigu.bean.Person;

@PropertySource(value="classpath:/person.properties")
@Configuration //配置类
public class MyPropertyValue {

	@Bean  //创建一个bean
	public Person person() {
		return new Person();
	}
	
	
	
}
