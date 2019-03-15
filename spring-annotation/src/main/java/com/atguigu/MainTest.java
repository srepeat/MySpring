package com.atguigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.PersonConfig;

/**
 * 
 * @author ����
 * 1��ʹ��classPathXml�ķ�ʽ�������÷�ʽ,ͨ��������������Դ�ӡ��ǰ������������
 * 2��ʹ��AnnoationConfigע�ⷽ����������bean�ķ�ʽ��ȡperson�Ĳ���
 */
public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = context.getBean(Person.class);
		String[] type = context.getBeanNamesForType(Person.class);
		System.out.println(person);
		for (String name : type) {
			System.out.println(name);
		}
		
		ApplicationContext context2 =new  AnnotationConfigApplicationContext(PersonConfig.class);
		Person bean = context2.getBean(Person.class);
		String[] beanName = context2.getBeanNamesForType(Person.class);
		System.out.println(bean);
		for (String bName : beanName) {
			System.out.println(bName);
		}
	}
}
