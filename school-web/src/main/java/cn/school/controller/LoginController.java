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

	//��ת��¼ҳ
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//��ת��ҳ
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	//��תע��ҳ��
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	//��¼��֤
	@RequestMapping("/doResultLogin")
	public @ResponseBody Object doResultLogin(User user,Model model) {
		Result result = new Result();
		//����service����
		User dbUser = userService.query4Login(user);
		//�ж��Ƿ�Ϊ�գ���Ϊ�ս��е�¼����
		if(dbUser != null) {
			model.addAttribute("dbUser", dbUser);
			result.setSuccess(true);
		}else {
			result.setSuccess(false);
		}
		return result;
	}
	
	
	//ʹ�ô�ͳ��֤
	@ResponseBody
	@RequestMapping("/doLogin")
	public Object doLogin(User user,Model model) {
		User login = userService.query4Login(user);
		if(login != null) {
			return "index";
		}else {
			String message = "�û��������������";
			model.addAttribute("message", message);
			return "login";
		}
	}
	
	
}
