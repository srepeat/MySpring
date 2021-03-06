package com.atguigu.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsConditional implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		//1、能获取ioc加载的bean工厂信息
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		//2、获取加载类信息
		ClassLoader classLoader = context.getClassLoader();
		//获取到那些bean定义注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		//4、获取当前编译环境
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");
		//判断当前是否位windows系统
		if(property.contains("Windows")) {
			return true;
		}
		return false;
	}

}
