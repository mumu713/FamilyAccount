/*
 * ItemMngInterFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.fa.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.fa.dao.impl.AccountDaoImpl;
import com.fa.dao.impl.ItemDaoImpl;
import com.fa.util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class ItemMngInterFrm extends javax.swing.JInternalFrame {

	/** Creates new form ItemMngInterFrm */
	public ItemMngInterFrm() {
		initComponents();
		setLocation(400, 100);
	}


	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		itemMngTxt = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		itemMngTable = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		itemMngIdTxt = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		itemMngNameTxt = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u6536\u652f\u9879\u76ee\u7ba1\u7406");
		setVisible(true);

		jLabel1.setFont(new java.awt.Font("��Բ", 0, 14));
		jLabel1.setText("\u9879\u76ee\u540d\u79f0");

		itemMngTxt.setFont(new java.awt.Font("����", 0, 14));

		jButton1.setFont(new java.awt.Font("��Բ", 1, 14));

		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		itemMngTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "���", "��Ŀ����", "��Ŀ����" }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		itemMngTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				itemMngTableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(itemMngTable);

		jLabel2.setFont(new java.awt.Font("��Բ", 0, 14));
		jLabel2.setText("\u7f16\u53f7");

		itemMngIdTxt.setEditable(false);
		itemMngIdTxt.setFont(new java.awt.Font("����", 0, 14));

		jLabel3.setFont(new java.awt.Font("��Բ", 0, 14));
		jLabel3.setText("\u9879\u76ee\u540d\u79f0");

		itemMngNameTxt.setFont(new java.awt.Font("����", 0, 14));

		jButton2.setFont(new java.awt.Font("��Բ", 1, 14));

		jButton2.setText("\u4fee\u6539");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("��Բ", 1, 14));

		jButton3.setText("\u5220\u9664");
		jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				itemMngIdTxt,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				27,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				91,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel3)
																		.addGap(
																				18,
																				18,
																				18))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton2)
																		.addGap(
																				95,
																				95,
																				95)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton3)
														.addComponent(
																itemMngNameTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																116,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(23, 23, 23)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(21, 21, 21)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																itemMngIdTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																itemMngNameTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												14, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton3))
										.addGap(22, 22, 22)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(55, 55, 55)
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addComponent(
												itemMngTxt,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												123,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												65, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(61, 61,
												61))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				379,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap(
																				33,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addGap(29, 29, 29)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(itemMngTxt,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1)).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 175,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								18, 18, 18).addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(18, Short.MAX_VALUE)));

		pack();
	}
	//�޸���Ŀ
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String itemname = itemMngNameTxt.getText();
		String itemid = itemMngIdTxt.getText();
		if (StringUtil.isEmpty(itemname)) {
			JOptionPane.showMessageDialog(null, "��Ŀ����Ϊ��!");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "��ȷ��Ҫ�޸ĸ���Ŀ��?");
		if (n == 0) {
			ItemDaoImpl idi = new ItemDaoImpl();//���java�ļ���ֻҪnewһ���Ϳ�����
			try {
				int id = Integer.parseInt(itemid);
				int modifyNum = idi.modifyItem(itemname, id);
				if (modifyNum == 1) {
					JOptionPane.showMessageDialog(null, "�޸ĳɹ�!");
					itemMngIdTxt.setText("");
					itemMngNameTxt.setText("");
					this.fillTable();
				} else {
					JOptionPane.showMessageDialog(null, "�޸�ʧ��!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "�޸�ʧ��!");
				e.printStackTrace();
			}
		}
	}

	//ɾ����Ŀ
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		String itemid = itemMngIdTxt.getText();
		if (StringUtil.isEmpty(itemid)) {
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫɾ������Ŀ!");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "��ȷ��Ҫɾ������Ŀ��?");
		if (n == 0) {
			ItemDaoImpl idi = new ItemDaoImpl();//���java�ļ���ֻҪnewһ���Ϳ�����
			AccountDaoImpl adi = new AccountDaoImpl();

			try {
				int id = Integer.parseInt(itemid);
				boolean flag = adi.getAccountByItemId(id);
				if (flag) {
					JOptionPane.showMessageDialog(null, "����Ŀ������֧������ɾ��!");
					return;
				}
				int deleteNum = idi.deleteItem(id);
				if (deleteNum == 1) {
					JOptionPane.showMessageDialog(null, "ɾ���ɹ�!");
					itemMngIdTxt.setText("");
					itemMngNameTxt.setText("");
					this.fillTable();
				} else {
					JOptionPane.showMessageDialog(null, "ɾ��ʧ��!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ��!");
				e.printStackTrace();
			}
		}
	}

	//������ѡ�е�����ʾ���ı�����
	private void itemMngTableMousePressed(java.awt.event.MouseEvent evt) {
		int row = itemMngTable.getSelectedRow();
		itemMngIdTxt.setText((Integer) itemMngTable.getValueAt(row, 0) + "");
		itemMngNameTxt.setText((String) itemMngTable.getValueAt(row, 1));
	}

	//�����������Ŀ���Ʋ�ѯ��Ŀ
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		fillTable();
	}

	private void fillTable() {
		DefaultTableModel dtm = (DefaultTableModel) itemMngTable.getModel();
		dtm.setRowCount(0);
		String itemname = itemMngTxt.getText();
		ItemDaoImpl idi = new ItemDaoImpl();
		try {
			idi.findItemResult(itemname, dtm);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "��ѯʧ��!");
		}
	}

	private javax.swing.JTextField itemMngIdTxt;
	private javax.swing.JTextField itemMngNameTxt;
	private javax.swing.JTable itemMngTable;
	private javax.swing.JTextField itemMngTxt;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
}