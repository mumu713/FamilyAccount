package com.fa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUtil {
	private String url="jdbc:mysql://localhost/familyaccount?characterEncoding=utf8";
	private String user="root";
	private String password="123456";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	//获取数据库连接,
	//缺陷：每使用一次这个方法就会加载一次驱动
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);     //加载驱动
		Connection con=DriverManager.getConnection(url, user, password);    //创建连接
		return con;	
	}
	
	//关闭数据库连接
	//缺陷：rs关闭异常的话，后面的就不能关闭了
	public void closeJdbc(ResultSet rs,Statement st,Connection con) throws Exception{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}
/*	
	public static void main(String[] args) {
		JdbcUtil ju=new JdbcUtil();
		Connection con=null;
		try{
			con=ju.getCon();
			System.out.println("数据连接成功");
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				ju.closeJdbc(null,null,con);
			}catch (Exception e){
				e.printStackTrace();
			}finally{
				System.out.println("数据库关闭成功");
			}
		}
	}
*/
}
