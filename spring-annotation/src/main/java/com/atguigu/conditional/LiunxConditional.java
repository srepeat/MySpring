package com.atguigu.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LiunxConditional implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		//1、获取bean工厂
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		//2、类加载器
		ClassLoader classLoader = context.getClassLoader();
		//3、读取那些bena定义的注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		//4、查看当前系统的编译环境
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");
		if(property.contains("liunx")) {
			return true;
		}
		return false;
	}

}
