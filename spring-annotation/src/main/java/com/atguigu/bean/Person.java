package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	/**
	 * �����Ը�ֵ���ַ�ʽ
	 * 1��@value("����")
	 * 2��ʹ��springEl���ʽ#{}
	 * 3��ʹ��${}ȡ�������ļ��и����Ĳ���
	 */
	
	@Value("����")
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
