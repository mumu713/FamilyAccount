package com.fa.dao;

import com.fa.dto.User;

public interface UserDao {
		
	//按照用户的名字和姓名查询	
	User findUser(String name, String password) throws Exception;

}
