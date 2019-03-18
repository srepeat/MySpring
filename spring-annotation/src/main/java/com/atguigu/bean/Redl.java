package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Redl implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware{

	private ApplicationContext aplicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ioc。。"+applicationContext);
		this.aplicationContext = applicationContext;
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		// TODO Auto-generated method stub
		
		String resolveStringValue = resolver.resolveStringValue("你好${ os.name} #{15*8}");
		System.out.println("字符串解析"+resolveStringValue);
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean得名字"+name);
	}

}
