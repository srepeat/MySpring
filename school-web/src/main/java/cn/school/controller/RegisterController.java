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
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/user")
	public Object registerUser(User user,Model model) {
		
		Result result = new Result();
		
		
		return result;
		
	}
	
}
