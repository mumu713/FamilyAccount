package com.fa.dao;

import com.fa.dto.User;

public interface UserDao {
		
	//�����û������ֺ�������ѯ	
	User findUser(String name, String password) throws Exception;

}
