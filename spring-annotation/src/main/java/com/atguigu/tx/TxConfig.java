package com.atguigu.tx;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 事务控制
 * @author 鲜磊
 *
 */
@EnableTransactionManagement  //开启注解事务管理
@ComponentScan({"com.atguigu.tx"})
@Configuration
public class TxConfig {

	//创建数据源
	@Bean
	public DataSource dataSource() {
		 ComboPooledDataSource dataSource = new ComboPooledDataSource();
		 try {
			 dataSource.setUser("root");
			 dataSource.setPassword("123456");
			 dataSource.setDriverClass("com.mysql.jdbc.Driver");
			 dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSource;
	}
	
	//调用jdbc提供的jdbcTemplate
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	
	//事务管理器
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
	
}
