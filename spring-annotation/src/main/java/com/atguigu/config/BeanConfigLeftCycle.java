package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.atguigu.bean.Car;
import com.atguigu.bean.Cat;
import com.atguigu.bean.Dog;
import com.atguigu.bean.MyBeanPostProcessor;

@Configuration
@ComponentScan("com.atguigu.bean")  //扫描这个包下的所有类
//@Import({Cat.class,Dog.class})
//导入bean
public class BeanConfigLeftCycle {
	
	/**
	 * bean的生命周期
	 *      创建===>初始化(init)==>销毁(destory)
	 *  单例==>容器创建完成就开始初始化,容器结束就关闭 
	 *  多例==>容器创建完成，但不会去管理bean,使用时才会去获取bean,不会调用关闭   
	 *  
	 *  通过bean的实现InitializingBean(初始化)DisposableBean(销毁)
	 *  
	 *  使用JSR250:@PostConstoruct ==>初始化(在构造方法后执行)
	 *  		  PreDestory ==>销毁时移除哪一个方法回调(等于destroy) 
	 *  BenaPostProcessor ==> Bean后置处理器
	 *   		postProcessAfterInitialization==>在bean初始化之前
	 *   		postProcessBeforeInitialization==>在bean初始化之后
	 *  result = beanProcessor.postProcessBeforeInitialization(result, beanName);
			if (result == null) {
				return result;
			} 
		遍历容器中所有beanPostProcessor,挨个执行postProcessBeforeInitialization
		如果等于空，就跳出for循环，不会执行后面的BeanPostProcessor<==>postProcessBeforeInitialization方法
	 * @return
	 */
	@Bean(initMethod="init",destroyMethod="destory")
	public Car car() {
		return new Car();
	}
	
}


