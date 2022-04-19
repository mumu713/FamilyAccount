package com.fa.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import com.fa.dao.ItemDao;
import com.fa.dto.Item;
import com.fa.util.JdbcUtil;
import com.fa.util.StringUtil;

public class ItemDaoImpl implements ItemDao {
	
	//添加收支项目
   public int addItem(Item item) throws Exception {
	   int i;
	   Connection con=null;        
	   PreparedStatement ps=null;   
	   ResultSet rs=null;          
	   
	   JdbcUtil ju=new JdbcUtil();                      
	   con=ju.getCon();                                 
	   
	   String sql="insert into item values(null,?,?)";  
	   ps=con.prepareStatement(sql);                    
	   ps.setString(1, item.getItemName());            
	   ps.setString(2, item.getItemType());
	   i=ps.executeUpdate();                            
	   ju.closeJdbc(rs, ps, con);                      
	   return i;
   }
   
   //根据收支项目名搜索项目，并将项目添加到DefaultTableModel中
   public void findItemResult(String itemname,DefaultTableModel dtm) throws Exception{
	  Connection con=null;
	  PreparedStatement ps=null;
	  ResultSet rs=null;
	  Vector v=null;         
	  
	  JdbcUtil ju=new JdbcUtil();
	  con=ju.getCon();
	  
	  StringBuffer sb=new StringBuffer("select * from item");  
	  if(StringUtil.isNotEmpty(itemname)){
		  sb.append(" where item_name like '%"+itemname+"%'");   
	  }
	  ps=con.prepareStatement(sb.toString());
	  rs=ps.executeQuery();    //执行数据库语句，返回结果集
	  while (rs.next()) {
			v = new Vector();
			v.add(rs.getInt(1));     //v添加item表中第一列内容，以整数形式
			v.add(rs.getString(2));
			v.add(rs.getString(3));
			dtm.addRow(v);
		}
	  ju.closeJdbc(rs, ps, con);
   }
   
   //判断项目在项目表中是否已经存在
   public boolean ifExist(Item item) throws Exception{
	   	  boolean f;
	      Connection con=null;
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  
		  JdbcUtil ju=new JdbcUtil();
		  
		  con=ju.getCon();
		  String sql="select * from item where item_name=? and item_type=?";
		  
		  ps=con.prepareStatement(sql);
		  ps.setString(1, item.getItemName());
		  ps.setString(2, item.getItemType());
		  
		  rs=ps.executeQuery();
		  f=rs.next();
		  ju.closeJdbc(rs, ps, con);
		  return f;
}
   
   //根据项目id号删除项目
   public int deleteItem(int id) throws Exception{
	   Connection con=null;
	   PreparedStatement ps=null;
	   ResultSet rs=null;
	   int i;
	   
	   JdbcUtil ju=new JdbcUtil();
	   con=ju.getCon();
	   
	   String sql="delete from item where item_id=?";
	   ps=con.prepareStatement(sql);
	   ps.setInt(1, id);
	   
	   i=ps.executeUpdate();
	   ju.closeJdbc(rs, ps, con);
	   return i;
   }
   
   //根据项目的id号修改项目的名称
   public int modifyItem(String name,int id) throws Exception{
	   Connection con=null;
	   PreparedStatement ps=null;
	   ResultSet rs=null;
	   int i;
	   JdbcUtil ju=new JdbcUtil();
	   con=ju.getCon();
	   String sql="update item set item_name=? where item_id=?";
	   ps=con.prepareStatement(sql);
	   ps.setString(1, name);
	   ps.setInt(2,id);
	   i=ps.executeUpdate();
	   ju.closeJdbc(rs, ps, con);
	   return i;
   }
   
   //根据项目类型检索项目，并将项目添加到JComblBox(下拉列表组件)中
   public void findItem(JComboBox jcb,String str) throws Exception{
		  Connection con=null;
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  
		  JdbcUtil ju=new JdbcUtil();
		  
		  con=ju.getCon();
		  
		  String sql="select * from item where item_type=?";
		  ps=con.prepareStatement(sql);
		  ps.setString(1,str);
		  rs=ps.executeQuery();
		  while (rs.next()) {
				jcb.addItem(rs.getString("item_name"));
			}
		 
		  ju.closeJdbc(rs, ps, con);
	   }
   
   //将所有的项目名称添加到JComboBox中
   public void findAllItem(JComboBox jcb) throws Exception{
		  Connection con=null;
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  
		  JdbcUtil ju=new JdbcUtil();
		  con=ju.getCon();
		  
		  String sql="select * from item";
		  ps=con.prepareStatement(sql);
		  rs=ps.executeQuery();
		  while (rs.next()) {
				jcb.addItem(rs.getString("item_name"));
			}
		 
		  ju.closeJdbc(rs, ps, con);
	   }
   
 
   
}
