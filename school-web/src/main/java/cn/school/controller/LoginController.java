package cn.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.school.bean.User;
import cn.school.result.Result;
import cn.school.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	//跳转登录页
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//跳转首页
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	//跳转注册页面
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	//登录验证
	@RequestMapping("/doResultLogin")
	public @ResponseBody Object doResultLogin(User user,Model model) {
		Result result = new Result();
		//调用service方法
		User dbUser = userService.query4Login(user);
		//判断是否为空，不为空进行登录操作
		if(dbUser != null) {
			model.addAttribute("dbUser", dbUser);
			result.setSuccess(true);
		}else {
			result.setSuccess(false);
		}
		return result;
	}
	
	
	//使用传统验证
	@ResponseBody
	@RequestMapping("/doLogin")
	public Object doLogin(User user,Model model) {
		User login = userService.query4Login(user);
		if(login != null) {
			return "index";
		}else {
			String message = "用户名或者密码错误";
			model.addAttribute("message", message);
			return "login";
		}
	}
	
	
}
