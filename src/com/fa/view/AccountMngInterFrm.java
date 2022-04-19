package com.fa.view;

import java.sql.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.fa.dao.impl.AccountDaoImpl;
import com.fa.dao.impl.ItemDaoImpl;
import com.fa.util.JdbcUtil;
import com.fa.util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class AccountMngInterFrm extends javax.swing.JInternalFrame {

	/** Creates new form AccountMngInterFrm */
	public AccountMngInterFrm() {
		initComponents();
		setLocation(400, 100);
		this.fillItem();
	}

	private void fillItem() {
		ItemDaoImpl idi = new ItemDaoImpl();
		accountItem.removeAllItems();
		try {
			idi.findAllItem(accountItem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private void initComponents() {

jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
accountDateFrom = new javax.swing.JTextField();
jLabel4 = new javax.swing.JLabel();
accountDateTo = new javax.swing.JTextField();
accountItem = new javax.swing.JComboBox();
jButton1 = new javax.swing.JButton();
jScrollPane1 = new javax.swing.JScrollPane();
AccountTable = new javax.swing.JTable();
jLabel1 = new javax.swing.JLabel();
idTxt = new javax.swing.JTextField();
jLabel5 = new javax.swing.JLabel();
moneyTxt = new javax.swing.JTextField();
jLabel6 = new javax.swing.JLabel();
dateTxt = new javax.swing.JTextField();
jLabel7 = new javax.swing.JLabel();
descTxt = new javax.swing.JTextField();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();

setClosable(true);
setIconifiable(true);
setTitle("\u6536\u652f\u7ba1\u7406");
setVisible(true);

jLabel2.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel2.setText("\u9879\u76ee:");

jLabel3.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel3.setText("\u65e5\u671f:\u4ece");

accountDateFrom.setFont(new java.awt.Font("宋体", 0, 14));

jLabel4.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel4.setText("\u5230");

accountDateTo.setFont(new java.awt.Font("宋体", 0, 14));


jButton1.setFont(new java.awt.Font("幼圆", 1, 14));
//jButton1.setIcon(new javax.swing.ImageIcon("E:\\Workspaces\\MyEclipse 8.5\\FamilyAccount\\images\\search.png")); // NOI18N
jButton1.setText("\u67e5\u8be2");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});

AccountTable.setModel(new javax.swing.table.DefaultTableModel(
	new Object [][] {

	},
	new String [] {
		"编号", "金额", "日期", "说明"
	}
) {
	boolean[] canEdit = new boolean [] {
		false, false, false, false
	};

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return canEdit [columnIndex];
	}
});
AccountTable.addMouseListener(new java.awt.event.MouseAdapter() {
public void mousePressed(java.awt.event.MouseEvent evt) {
AccountTableMousePressed(evt);
}
});
jScrollPane1.setViewportView(AccountTable);

jLabel1.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel1.setText("\u7f16\u53f7:");

idTxt.setFont(new java.awt.Font("宋体", 0, 14));
idTxt.setEnabled(false);

jLabel5.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel5.setText("\u91d1\u989d:");

moneyTxt.setFont(new java.awt.Font("宋体", 0, 14));

jLabel6.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel6.setText("\u65e5\u671f:");

dateTxt.setFont(new java.awt.Font("宋体", 0, 14));

jLabel7.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel7.setText("\u8bf4\u660e:");

descTxt.setFont(new java.awt.Font("宋体", 0, 14));

jButton2.setFont(new java.awt.Font("幼圆", 1, 14));
//jButton2.setIcon(new javax.swing.ImageIcon("E:\\Workspaces\\MyEclipse 8.5\\FamilyAccount\\images\\modify.png")); // NOI18N
jButton2.setText("\u4fee\u6539");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});

jButton3.setFont(new java.awt.Font("幼圆", 1, 14));
//jButton3.setIcon(new javax.swing.ImageIcon("E:\\Workspaces\\MyEclipse 8.5\\FamilyAccount\\images\\delete.png")); // NOI18N
jButton3.setText("\u5220\u9664");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(32, 32, 32)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(accountItem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(45, 45, 45)
.addComponent(jLabel3)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(accountDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabel4)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(accountDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
.addComponent(jButton1))
.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
.addGap(6, 6, 6)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel5)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(moneyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(56, 56, 56))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel7)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton2)
.addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
.addGap(114, 114, 114))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton3)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel6)
.addGap(18, 18, 18)
.addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(19, 19, 19)))))
.addGap(48, 48, 48))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(20, 20, 20)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(accountItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel3)
.addComponent(jLabel4)
.addComponent(accountDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(accountDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton1))
.addGap(21, 21, 21)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(37, 37, 37)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel6)
.addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel1)
.addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel5)
.addComponent(moneyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(35, 35, 35)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel7)
.addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(28, 28, 28)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton3)
.addComponent(jButton2))
.addContainerGap())
);

pack();
}//

	//修改收支
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String idstr = idTxt.getText();
		String moneystr = moneyTxt.getText();
		String datestr = dateTxt.getText();
		String desc = descTxt.getText();
		Date date = null;
		float money = 0;
		if (StringUtil.isEmpty(moneystr)) {
			JOptionPane.showMessageDialog(null, "金额不能为空!");
			return;
		}
		if (StringUtil.isEmpty(datestr)) {
			JOptionPane.showMessageDialog(null, "时间不能为空!");
			return;
		}

		try {
			money = Float.parseFloat(moneystr);//这里金额有字符d或f的时候不会报错
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "金额格式错误!");
			return;
		}
		try {
			date = Date.valueOf(datestr);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "日期格式错误!");
			return;
		}

		int n = JOptionPane.showConfirmDialog(null, "请确定要修改吗?");
		if (n == 0) {
			AccountDaoImpl adi = new AccountDaoImpl();//这个java文件里只要new一个就可以了

			try {
				int id = Integer.parseInt(idstr);
				int modifyNum = adi.modifyAccount(date, money, desc, id);
				if (modifyNum == 1) {
					JOptionPane.showMessageDialog(null, "修改成功!");
					idTxt.setText("");
					moneyTxt.setText("");
					dateTxt.setText("");
					descTxt.setText("");
					this.serchAccount();
				} else {
					JOptionPane.showMessageDialog(null, "修改失败!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "修改失败!");
				e.printStackTrace();
			}
		}
	}

	//删除收支
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		String idstr = idTxt.getText();
		if (StringUtil.isEmpty(idstr)) {
			JOptionPane.showMessageDialog(null, "请选择要删除的收支!");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "请确定要删除这笔收支吗?");
		if (n == 0) {
			AccountDaoImpl adi = new AccountDaoImpl();//这个java文件里只要new一个就可以了

			try {
				int id = Integer.parseInt(idstr);
				int deleteNum = adi.deleteAccount(id);
				if (deleteNum == 1) {
					JOptionPane.showMessageDialog(null, "删除成功!");
					idTxt.setText("");
					moneyTxt.setText("");
					dateTxt.setText("");
					descTxt.setText("");
					this.serchAccount();
				} else {
					JOptionPane.showMessageDialog(null, "删除失败!");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "删除失败!");
				e.printStackTrace();
			}
		}
	}

	//将表格中选中的行显示出来,注意数据转换
	private void AccountTableMousePressed(java.awt.event.MouseEvent evt) {
		int row = AccountTable.getSelectedRow();
		idTxt.setText((Integer) AccountTable.getValueAt(row, 0) + "");
		moneyTxt.setText((Float) AccountTable.getValueAt(row, 1) + "");
		dateTxt.setText(AccountTable.getValueAt(row, 2).toString());
		descTxt.setText(AccountTable.getValueAt(row, 3).toString());
	}

	//查询比较复杂，所以将这个函数全部写在这里
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.serchAccount();
	}

	private void serchAccount() {
		DefaultTableModel dtm = (DefaultTableModel) AccountTable.getModel();
		String item = (String) accountItem.getSelectedItem();
		String datefromstr = accountDateFrom.getText();
		if (StringUtil.isEmpty(datefromstr)) {
			datefromstr = "2000-01-01";
		}
		String datetostr = accountDateTo.getText();
		if (StringUtil.isEmpty(datetostr)) {
			datetostr = "2099-12-31";
		}
		Date datefrom = null;
		Date dateto = null;
		try {
			datefrom = Date.valueOf(datefromstr);
			dateto = Date.valueOf(datetostr);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "日期格式错误!");
			return;
		}

		dtm.setRowCount(0);
		AccountDaoImpl adi = new AccountDaoImpl();
		try {
			adi.findAccount(item, datefrom, dateto, dtm);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "查询失败!");
		}

	}

	private javax.swing.JTable AccountTable;
	private javax.swing.JTextField accountDateFrom;
	private javax.swing.JTextField accountDateTo;
	private javax.swing.JComboBox accountItem;
	private javax.swing.JTextField dateTxt;
	private javax.swing.JTextField descTxt;
	private javax.swing.JTextField idTxt;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField moneyTxt;

}