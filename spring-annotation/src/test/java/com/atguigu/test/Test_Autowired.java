package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MyConfigOfAutowired;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;

public class Test_Autowired {

	@Test
	public void test01() {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigOfAutowired.class);
	//PrintBean.printBean(applicationContext);
	//�������ͻ�ȡ
	BookService service = applicationContext.getBean(BookService.class);
	System.out.println(service);
	
	BookDao bean = applicationContext.getBean(BookDao.class);
	System.out.println(bean);
	
	}
}
