package com.fa.dao;


import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import com.fa.dto.Item;

public interface ItemDao {
	
	//添加收支项目
	int addItem(Item item) throws Exception;
	
	//根据名称和类型判断项目是否已存在
	boolean ifExist(Item item) throws Exception;
	
	//按项目名称和项目类型查询
	void findItemResult(String item, DefaultTableModel dtm) throws Exception;

	//按照id号来删除记录
	int deleteItem(int id) throws Exception;
	
	//按照item_name修改记录
	int modifyItem(String name, int id) throws Exception;
	
	void findItem(JComboBox jcb, String str) throws Exception;
	
	void findAllItem(JComboBox jcb) throws Exception;
	
}
