package com.atguigu.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@PropertySource("classpath:/c3p0Config.properties")
@Configuration
public class MyConfigOfProfile implements EmbeddedValueResolverAware {

	@Value("${jdbc.user}")
	private String user;
	
	@Value("${jdbc.pwd}")
	private String pwd;
	
	private StringValueResolver valueResolver;
	
	private String diver;
	
	@Bean("dataSourceTest")
	public DataSource dataSourceTest() throws Exception {
		ComboPooledDataSource dataSource = new  ComboPooledDataSource();
		dataSource.setUser(user);
		dataSource.setPassword(pwd);
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setDriverClass(diver);
		return dataSource;
	}
	
	@Bean("dataSourceDev")
	public DataSource dataSourceDev() throws Exception {
		ComboPooledDataSource dataSource = new  ComboPooledDataSource();
		dataSource.setUser(user);
		dataSource.setPassword(pwd);
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setDriverClass(diver);
		return dataSource;
	}
	
	@Bean("dataSourceProved")
	public DataSource dataSourceProved() throws Exception {
		ComboPooledDataSource dataSource = new  ComboPooledDataSource();
		dataSource.setUser(user);
		dataSource.setPassword(pwd);
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setDriverClass(diver);
		return dataSource;
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		// TODO Auto-generated method stub
		this.valueResolver = resolver;
		diver = valueResolver.resolveStringValue("${jdbc.driver}");
	}
	
}
