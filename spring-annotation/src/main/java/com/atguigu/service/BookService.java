package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDao;

@Service
public class BookService {
	
	/**
	 * 1、自动装配bean===>自动注入默认是寻找属性值
	 * 2、如果有多个组件名，就根据id进行装配，使用Qualifier进行指定装配的id
	 * 3、primary装配第一个默认bean组件为首选，也可以使用qualifier指定
	 */

	@Qualifier("bookDao")
	@Autowired(required=false)
	private BookDao bookDao;
	
	public void print() {
		System.out.println(bookDao);
	}

	@Override
	public String toString() {
		return "BookService [bookDao=" + bookDao + "]";
	}
	
}
