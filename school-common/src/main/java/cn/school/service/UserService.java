package cn.school.service;

import cn.school.bean.User;
/**
 * ����ӿ�
 * @author ����
 *
 */
public interface UserService {

	//��ѯ�û�����������е�½��֤
	User query4Login(User user);
	
	//����ע���û�
	void insertUser(User user);
	
}
