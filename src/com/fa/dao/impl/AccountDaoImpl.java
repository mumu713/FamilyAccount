package com.fa.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.fa.dao.AccountDao;
import com.fa.dto.Account;
import com.fa.util.JdbcUtil;
import com.fa.util.StringUtil;

public class AccountDaoImpl implements AccountDao{
	
	//添加收支
	public int addAccount(Account account) throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int i;
		
		JdbcUtil ju=new JdbcUtil();	
		con=ju.getCon();
		
		int id=0;
		String sqlid="select * from item where item_name=? and item_type=?";
		ps=con.prepareStatement(sqlid);
		ps.setString(1, account.getAccountItemName());
		ps.setString(2, account.getAccountItemType());
		rs=ps.executeQuery();
		while(rs.next()){
			id=rs.getInt(1);
		}
		
		String sql="insert into account values(null,?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setDate(1,account.getAccountDate());
		ps.setFloat(2, account.getAccountMoney());
		ps.setInt(3, id);
		ps.setString(4, account.getAccountDesc());
		
//		String sql="insert into account values(null,?,?, select item.item_id from item where item_name=? and item_type=? ,?)  ";
//		ps=con.prepareStatement(sql);
//		ps.setDate(1,account.getAccountDate());
//		ps.setFloat(2, account.getAccountMoney());
//		ps.setString(3, account.getAccountItemName());
//		ps.setString(4, account.getAccountItemType());
//		ps.setString(5, account.getAccountDesc());
		
		i=ps.executeUpdate();
		ju.closeJdbc(rs, ps, con);
		return i;
	}
	
	//按项目和起止时间查询,
	public void findAccount(String item,Date datefrom,Date dateto,DefaultTableModel dtm) throws Exception{
		   Connection con=null;
		   PreparedStatement ps=null;
		   ResultSet rs=null;
		   Vector v = null;
		   JdbcUtil ju=new JdbcUtil();
		   con=ju.getCon();
		   StringBuffer sb=new StringBuffer("SELECT acc_id,acc_money,acc_date,acc_detail from account,item ");
		   sb.append("where account.item_id=item.item_id ");
		   sb.append("AND item_name=? ");
		   sb.append("AND acc_date BETWEEN ? AND ? ");
		   ps=con.prepareStatement(sb.toString());
		   ps.setString(1, item);
		   ps.setDate(2, datefrom);
		   ps.setDate(3, dateto);
		   rs=ps.executeQuery();
			  while (rs.next()) {
					v = new Vector();
					v.add(rs.getObject(1));
					v.add(rs.getObject(2));
					v.add(rs.getObject(3));
					v.add(rs.getObject(4));
					dtm.addRow(v);
				}
			  ju.closeJdbc(rs, ps, con);	
	}
	
	//根据收支的id来删除一笔收支记录
	public int deleteAccount(int id) throws Exception{
		   Connection con=null;
		   PreparedStatement ps=null;
		   ResultSet rs=null;
		   int i;
		   JdbcUtil ju=new JdbcUtil();
		   con=ju.getCon();
		   String sql="delete from account where acc_id=?";
		   ps=con.prepareStatement(sql);
		   ps.setInt(1, id);
		   i=ps.executeUpdate();
		   ju.closeJdbc(rs, ps, con);
		   return i;
	   }
	   
	//根据收支表的id来修改这笔收支的时间，金额和说明
	   public int modifyAccount(Date date,float money,String desc,int id) throws Exception{
		   Connection con=null;
		   PreparedStatement ps=null;
		   ResultSet rs=null;
		   int i;
		   JdbcUtil ju=new JdbcUtil();
		   con=ju.getCon();
		   String sql="update account set acc_date=? ,acc_money=?,acc_detail=? where acc_id=?";
		   ps=con.prepareStatement(sql);
		   ps.setDate(1, date);
		   ps.setFloat(2,money);
		   ps.setString(3, desc);
		   ps.setInt(4, id);
		   i=ps.executeUpdate();
		   ju.closeJdbc(rs, ps, con);
		   return i;
	   }
	   
	   //根据项目表中的id号在account表中检索数据，判断item表中的id在account表中有没有被使用
	   public boolean getAccountByItemId(int itemid) throws Exception{
	        Connection con= null;
			PreparedStatement ps = null;
			ResultSet rs= null;
			JdbcUtil ju = new JdbcUtil();
			boolean f;
			con = ju.getCon();
			
			String sql="select * from account where item_id=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, itemid);
			rs=ps.executeQuery();
			f=rs.next();
			ju.closeJdbc(rs, ps, con);
			return f;
	   }
	
}
