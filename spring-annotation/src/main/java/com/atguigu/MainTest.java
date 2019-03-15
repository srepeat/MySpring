package com.atguigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.PersonConfig;

/**
 * 
 * @author 鲜磊
 * 1、使用classPathXml的方式加载配置方式,通过反射加载类属性打印当前类中所有属性
 * 2、使用AnnoationConfig注解方法加载配置bean的方式获取person的参数
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
