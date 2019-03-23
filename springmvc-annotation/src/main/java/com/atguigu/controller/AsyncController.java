package com.atguigu.controller;

import java.util.UUID;
import java.util.concurrent.Callable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import com.atguigu.service.DeferredResultQuert;

@Controller
public class AsyncController {
	/**
	 * ʹ��һ�����н������ݵĴ����ͱ���
	 * @return
	 */
	
	//�����첽����
	@ResponseBody
	@RequestMapping("/order")
	public DeferredResult<Object> createOrder(){
		DeferredResult<Object> deferredResult = new DeferredResult<>((long)3000, "I do know");
		DeferredResultQuert.save(deferredResult);
		return deferredResult;
	}
	
	@ResponseBody
	@RequestMapping("/succ")
	public String success() {
		String string = UUID.randomUUID().toString();
		DeferredResult<Object> deferredResult = DeferredResultQuert.get();
		deferredResult.setResult(string);
		return "success==>"+string;
	}
	
	/**
	 * 1������������Callable
	 * 2��Spring�첽������Callable �ύ�� TaskExecutor ʹ��һ��������߳̽���ִ��
	 * 3��DispatcherServlet�����е�Filter�˳�web�������̣߳�����response ���ִ�״̬��
	 * 4��Callable���ؽ����SpringMVC�����������ɷ����������ָ�֮ǰ�Ĵ���
	 * 5������Callable���صĽ����SpringMVC����������ͼ��Ⱦ���̵ȣ���������-��ͼ��Ⱦ����
	 * 
	 * preHandle.../springmvc-annotation/async01
		���߳̿�ʼ...Thread[http-bio-8081-exec-3,5,main]==>1513932494700
		���߳̽���...Thread[http-bio-8081-exec-3,5,main]==>1513932494700
		=========DispatcherServlet�����е�Filter�˳��߳�============================
		
		================�ȴ�Callableִ��==========
		���߳̿�ʼ...Thread[MvcAsync1,5,main]==>1513932494707
		���߳̿�ʼ...Thread[MvcAsync1,5,main]==>1513932496708
		================Callableִ�����==========
		
		================�ٴ��յ�֮ǰ�ط�����������========
		preHandle.../springmvc-annotation/async01
		postHandle...��Callable��֮ǰ�ķ���ֵ����Ŀ�귽���ķ���ֵ��
		afterCompletion...
		
		�첽��������:
			1����ԭ��API��AsyncListener
			2����SpringMVC��ʵ��AsyncHandlerInterceptor��
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/async01")
	public Callable<String> async01(){
		System.out.println("���߳̿�ʼ..."+Thread.currentThread()+"==>"+System.currentTimeMillis());
		
		Callable<String> callable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("���߳̿�ʼ..."+Thread.currentThread()+"==>"+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("���߳̿�ʼ..."+Thread.currentThread()+"==>"+System.currentTimeMillis());
				return "Callable<String> async01()";
			}
		};
		
		System.out.println("���߳̽���..."+Thread.currentThread()+"==>"+System.currentTimeMillis());
		return callable;
	}
	
}
