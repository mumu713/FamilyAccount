package com.fa.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.fa.dao.UserDao;
import com.fa.dto.User;
import com.fa.util.JdbcUtil;

public class UserDaoImpl implements UserDao{

	public User findUser(String name, String password) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		User user=null;
		JdbcUtil ju=new JdbcUtil();
		
		con=ju.getCon();
		String sql="select * from user where u_name=? and u_password=?";
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		rs=ps.executeQuery();
		while(rs.next()){
			user=new User();//根据u_name和u_password只能确定一个u_id，也就是一条记录
			user.setUserId(rs.getInt(1));
			user.setUserName(rs.getString(2));
			user.setUserPassword(rs.getString(3));
		}
		ju.closeJdbc(rs, ps, con);
		return user;
	}

}
