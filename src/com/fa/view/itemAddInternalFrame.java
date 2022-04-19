package com.fa.view;

import javax.swing.*;

import com.fa.dao.impl.ItemDaoImpl;
import com.fa.dto.Item;
import com.fa.util.StringUtil;

/**
 *
 * 项目添加界面
 */
public class itemAddInternalFrame extends JInternalFrame {  //内部窗口

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
		setIconifiable(true);//可图标化窗口
		setTitle("收支项目添加");  
		setVisible(true);

		jLabel1.setFont(new java.awt.Font("幼圆", 0, 14));
		jLabel1.setText("项目名称");       

		jLabel2.setFont(new java.awt.Font("幼圆", 0, 14));
		jLabel2.setText("项目类型");      

		itemaddnametxt.setFont(new java.awt.Font("宋体", 0, 14));    //设置字体，字体风格字号

		itemaddtypetxt.setFont(new java.awt.Font("宋体", 0, 14));

		jButton1.setFont(new java.awt.Font("幼圆", 1, 14));
		//jButton1
				
		jButton1.setText("添加");                         
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("幼圆", 1, 14));
		//jButton2
				
		jButton2.setText("重置");                       
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(   //建立分组布局
				getContentPane());                                      //获取内容面板
		getContentPane().setLayout(layout);     //内容面板布局
		layout
				.setHorizontalGroup(layout   //水平分组
						.createParallelGroup(       //面板区域1
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup() //创建串行组
										.addGap(75, 75, 75)      //创建间隙
										.addGroup(
												layout
														.createParallelGroup(    //面板区域2
																javax.swing.GroupLayout.Alignment.LEADING)//对齐方式
														.addComponent(jButton1)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(  //面板区域3
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
																						.createParallelGroup(  //面板区域4
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								itemaddtypetxt,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								70,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								layout
																										.createParallelGroup(   //面板区域5
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
				.setVerticalGroup(layout    //垂直分组
						.createParallelGroup(   //创造面板区域
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(42, 42, 42)
										.addGroup(
												layout
														.createParallelGroup(   //创造面板区域1
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
														.createParallelGroup(  //创建面板区域2
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
														.createParallelGroup(  //创建面板区域3
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
			JOptionPane.showMessageDialog(null, "项目名称不能为空!");  
			return;
		}
		if (StringUtil.isEmpty(itemtype)) {
			JOptionPane.showMessageDialog(null, "项目类型不能为空!");
			return;
		}

		ItemDaoImpl idi = new ItemDaoImpl();
		Item item = new Item(itemname, itemtype);
		int i;
		try {
			if (idi.ifExist(item)) {
				JOptionPane.showMessageDialog(null, "该项目已存在!");
			} else {
				i = idi.addItem(item);
				if (i != 0) {
					JOptionPane.showMessageDialog(null, "添加成功!");
					this.itemaddnametxt.setText("");
					this.itemaddtypetxt.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "添加失败!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "添加失败!");
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