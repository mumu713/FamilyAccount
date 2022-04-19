package com.fa.dao;

import java.sql.Date;

import javax.swing.table.DefaultTableModel;

import com.fa.dto.Account;

public interface AccountDao {
	
	//�����֧��Ŀ
	int addAccount(Account account) throws Exception;
	
	//��ѯ��֧
	void findAccount(String item, Date datefrom, Date dateto, DefaultTableModel dtm) throws Exception;

	int deleteAccount(int id) throws Exception;
	
	int modifyAccount(Date date, float money, String desc, int id) throws Exception;
	
	boolean getAccountByItemId(int itemid) throws Exception;
	
}
