package com.atguigu;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.annotation.HandlesTypes;

import com.atguigu.lizer.HelloServlet;

//����������ʱ��Ὣ@HandlesTypesָ�������������������ࣨʵ���࣬�ӽӿڵȣ����ݹ�����
//�������Ȥ�����ͣ�
@HandlesTypes(value={HelloServlet.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
	/**
	 * Ӧ��������ʱ�򣬻�����onStartup������
	 * 
	 * Set<Class<?>> arg0������Ȥ�����͵����������ͣ�
	 * ServletContext arg1:����ǰWebӦ�õ�ServletContext��һ��WebӦ��һ��ServletContext��
	 * 
	 * 1����ʹ��ServletContextע��Web�����Servlet��Filter��Listener��
	 * 2����ʹ�ñ���ķ�ʽ������Ŀ������ʱ���ServletContext������������
	 * 		��������Ŀ������ʱ������ӣ�
	 * 		1����ServletContainerInitializer�õ���ServletContext��
	 * 		2����ServletContextListener�õ���ServletContext��
	 */
	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext sc) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("����Ȥ�����ͣ�");
		for (Class<?> claz : arg0) {
			System.out.println(claz);
		}
		
		//System.out.println("Hello");
		//����servlet
		Dynamic addServlet = sc.addServlet("userServlet", new UserServlet());
		addServlet.addMapping("/user"); //����mapper
		
		//������
		javax.servlet.FilterRegistration.Dynamic addFilter = sc.addFilter("userFilter", new UserFilter());
		addFilter.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "/");
		
		//������
		sc.addListener(new UserListener());
	}

}
