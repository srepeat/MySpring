package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	/**
	 * 给属性赋值三种方式
	 * 1、@value("参数")
	 * 2、使用springEl表达式#{}
	 * 3、使用${}取出属性文件中给定的参数
	 */
	
	@Value("李四")
	private String name;
	@Value("#{18+2}")
	private Integer age;
	@Value("${person.nickName}")
	private String nickName;
	
	
	public Person() {
	
	}
	
	public Person(String name , Integer age){
		this.name = name;
		this.age = age;
	}
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ",nickName="+nickName+"]";
	}
	
}
