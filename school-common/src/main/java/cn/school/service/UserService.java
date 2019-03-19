package cn.school.service;

import cn.school.bean.User;
/**
 * 服务接口
 * @author 鲜磊
 *
 */
public interface UserService {

	//查询用户名和密码进行登陆验证
	User query4Login(User user);
	
	//新增注册用户
	void insertUser(User user);
	
}
