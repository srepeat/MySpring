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
@ComponentScan("com.atguigu.bean")  //ɨ��������µ�������
//@Import({Cat.class,Dog.class})
//����bean
public class BeanConfigLeftCycle {
	
	/**
	 * bean����������
	 *      ����===>��ʼ��(init)==>����(destory)
	 *  ����==>����������ɾͿ�ʼ��ʼ��,���������͹ر� 
	 *  ����==>����������ɣ�������ȥ����bean,ʹ��ʱ�Ż�ȥ��ȡbean,������ùر�   
	 *  
	 *  ͨ��bean��ʵ��InitializingBean(��ʼ��)DisposableBean(����)
	 *  
	 *  ʹ��JSR250:@PostConstoruct ==>��ʼ��(�ڹ��췽����ִ��)
	 *  		  PreDestory ==>����ʱ�Ƴ���һ�������ص�(����destroy) 
	 *  BenaPostProcessor ==> Bean���ô�����
	 *   		postProcessAfterInitialization==>��bean��ʼ��֮ǰ
	 *   		postProcessBeforeInitialization==>��bean��ʼ��֮��
	 *  result = beanProcessor.postProcessBeforeInitialization(result, beanName);
			if (result == null) {
				return result;
			} 
		��������������beanPostProcessor,����ִ��postProcessBeforeInitialization
		������ڿգ�������forѭ��������ִ�к����BeanPostProcessor<==>postProcessBeforeInitialization����
	 * @return
	 */
	@Bean(initMethod="init",destroyMethod="destory")
	public Car car() {
		return new Car();
	}
	
}


