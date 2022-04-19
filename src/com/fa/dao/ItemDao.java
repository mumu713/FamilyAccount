package com.fa.dao;


import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import com.fa.dto.Item;

public interface ItemDao {
	
	//�����֧��Ŀ
	int addItem(Item item) throws Exception;
	
	//�������ƺ������ж���Ŀ�Ƿ��Ѵ���
	boolean ifExist(Item item) throws Exception;
	
	//����Ŀ���ƺ���Ŀ���Ͳ�ѯ
	void findItemResult(String item, DefaultTableModel dtm) throws Exception;

	//����id����ɾ����¼
	int deleteItem(int id) throws Exception;
	
	//����item_name�޸ļ�¼
	int modifyItem(String name, int id) throws Exception;
	
	void findItem(JComboBox jcb, String str) throws Exception;
	
	void findAllItem(JComboBox jcb) throws Exception;
	
}
