package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		String name = helloService.sayName("tomcat..");
		return name;
	}
	
	@ResponseBody
	@RequestMapping("/index")
	public String index() {
		return "success";
	}
	
}
