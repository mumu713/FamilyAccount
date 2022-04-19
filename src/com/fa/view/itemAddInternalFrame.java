package com.fa.view;

import javax.swing.*;

import com.fa.dao.impl.ItemDaoImpl;
import com.fa.dto.Item;
import com.fa.util.StringUtil;

/**
 *
 * ��Ŀ��ӽ���
 */
public class itemAddInternalFrame extends JInternalFrame {  //�ڲ�����

	public itemAddInternalFrame() {
		initComponents();
		setLocation(400, 100);
	}

	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		itemaddnametxt = new javax.swing.JTextField();
		itemaddtypetxt = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);//��ͼ�껯����
		setTitle("��֧��Ŀ���");  
		setVisible(true);

		jLabel1.setFont(new java.awt.Font("��Բ", 0, 14));
		jLabel1.setText("��Ŀ����");       

		jLabel2.setFont(new java.awt.Font("��Բ", 0, 14));
		jLabel2.setText("��Ŀ����");      

		itemaddnametxt.setFont(new java.awt.Font("����", 0, 14));    //�������壬�������ֺ�

		itemaddtypetxt.setFont(new java.awt.Font("����", 0, 14));

		jButton1.setFont(new java.awt.Font("��Բ", 1, 14));
		//jButton1
				
		jButton1.setText("���");                         
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("��Բ", 1, 14));
		//jButton2
				
		jButton2.setText("����");                       
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(   //�������鲼��
				getContentPane());                                      //��ȡ�������
		getContentPane().setLayout(layout);     //������岼��
		layout
				.setHorizontalGroup(layout   //ˮƽ����
						.createParallelGroup(       //�������1
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup() //����������
										.addGap(75, 75, 75)      //������϶
										.addGroup(
												layout
														.createParallelGroup(    //�������2
																javax.swing.GroupLayout.Alignment.LEADING)//���뷽ʽ
														.addComponent(jButton1)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(  //�������3
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel2))
																		.addGap(
																				29,
																				29,
																				29)
																		.addGroup(
																				layout
																						.createParallelGroup(  //�������4
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								itemaddtypetxt,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								70,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								layout
																										.createParallelGroup(   //�������5
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jButton2)
																										.addComponent(
																												itemaddnametxt,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												152,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addContainerGap(82, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout    //��ֱ����
						.createParallelGroup(   //�����������
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(42, 42, 42)
										.addGroup(
												layout
														.createParallelGroup(   //�����������1
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																itemaddnametxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(45, 45, 45)
										.addGroup(
												layout
														.createParallelGroup(  //�����������2
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2)
														.addComponent(
																itemaddtypetxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												73, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(  //�����������3
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addGap(53, 53, 53)));

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String itemname = itemaddnametxt.getText();
		String itemtype = itemaddtypetxt.getText();

		if (StringUtil.isEmpty(itemname)) {
			JOptionPane.showMessageDialog(null, "��Ŀ���Ʋ���Ϊ��!");  
			return;
		}
		if (StringUtil.isEmpty(itemtype)) {
			JOptionPane.showMessageDialog(null, "��Ŀ���Ͳ���Ϊ��!");
			return;
		}

		ItemDaoImpl idi = new ItemDaoImpl();
		Item item = new Item(itemname, itemtype);
		int i;
		try {
			if (idi.ifExist(item)) {
				JOptionPane.showMessageDialog(null, "����Ŀ�Ѵ���!");
			} else {
				i = idi.addItem(item);
				if (i != 0) {
					JOptionPane.showMessageDialog(null, "��ӳɹ�!");
					this.itemaddnametxt.setText("");
					this.itemaddtypetxt.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "���ʧ��!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "���ʧ��!");
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.itemaddnametxt.setText("");
		this.itemaddtypetxt.setText("");
	}

	
	private javax.swing.JTextField itemaddnametxt;
	private javax.swing.JTextField itemaddtypetxt;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	
}