package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDao;

@Service
public class BookService {
	
	/**
	 * 1���Զ�װ��bean===>�Զ�ע��Ĭ����Ѱ������ֵ
	 * 2������ж����������͸���id����װ�䣬ʹ��Qualifier����ָ��װ���id
	 * 3��primaryװ���һ��Ĭ��bean���Ϊ��ѡ��Ҳ����ʹ��qualifierָ��
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
