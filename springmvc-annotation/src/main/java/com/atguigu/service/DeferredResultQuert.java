package com.atguigu.service;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.web.context.request.async.DeferredResult;
/**
 * 创建异步请求队列
 * @author 鲜磊
 *
 */
public class DeferredResultQuert {

	private static Queue<DeferredResult<Object>> queue =new ConcurrentLinkedQueue<>();
	
	//保存队列
	public static void save(DeferredResult<Object> deferredResult) {
		queue.add(deferredResult);
	}
	
	public static DeferredResult<Object> get() {
		return queue.poll();
	}
}
