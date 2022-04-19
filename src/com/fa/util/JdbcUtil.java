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
	
	//��ȡ���ݿ�����,
	//ȱ�ݣ�ÿʹ��һ����������ͻ����һ������
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);     //��������
		Connection con=DriverManager.getConnection(url, user, password);    //��������
		return con;	
	}
	
	//�ر����ݿ�����
	//ȱ�ݣ�rs�ر��쳣�Ļ�������ľͲ��ܹر���
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
			System.out.println("�������ӳɹ�");
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				ju.closeJdbc(null,null,con);
			}catch (Exception e){
				e.printStackTrace();
			}finally{
				System.out.println("���ݿ�رճɹ�");
			}
		}
	}
*/
}
