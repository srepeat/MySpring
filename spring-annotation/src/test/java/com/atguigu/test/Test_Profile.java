package com.atguigu.test;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MyConfigOfProfile;

//≤‚ ‘«–ªªª∑æ≥
public class Test_Profile {

	
	@Test
	public void testName() throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigOfProfile.class);
		PrintBean.printGetBean(applicationContext);
	}
}
