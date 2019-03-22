package com.atguigu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/hello",asyncSupported=true)
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("猪线程开始"+Thread.currentThread());
		sayHello();
		System.out.println("🐖线程开始"+Thread.currentThread());
		resp.getWriter().write("Hello");;
	}
	
	
	public void sayHello() {
		System.out.println("副线程开始"+Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("副线程结束"+Thread.currentThread());
	}
}
