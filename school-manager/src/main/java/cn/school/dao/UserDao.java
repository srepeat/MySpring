package cn.school.dao;

import org.apache.ibatis.annotations.Select;

import cn.school.bean.User;


public interface UserDao {

	@Select("select * from tb_user where username=#{username} and password = #{password}")
	public User query4Login(User user);

	//ĞÂÔö
	public void insertUser(User user);
	
}
