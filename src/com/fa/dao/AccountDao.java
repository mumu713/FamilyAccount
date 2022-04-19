package com.fa.dao;

import java.sql.Date;

import javax.swing.table.DefaultTableModel;

import com.fa.dto.Account;

public interface AccountDao {
	
	//添加收支项目
	int addAccount(Account account) throws Exception;
	
	//查询收支
	void findAccount(String item, Date datefrom, Date dateto, DefaultTableModel dtm) throws Exception;

	int deleteAccount(int id) throws Exception;
	
	int modifyAccount(Date date, float money, String desc, int id) throws Exception;
	
	boolean getAccountByItemId(int itemid) throws Exception;
	
}
