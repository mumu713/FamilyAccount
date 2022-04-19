package com.fa.view;

import java.sql.Date;

import javax.swing.JOptionPane;

import com.fa.dao.impl.AccountDaoImpl;
import com.fa.dao.impl.ItemDaoImpl;
import com.fa.dto.Account;
import com.fa.util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class accountAddInterFrm extends javax.swing.JInternalFrame {

	/** Creates new form accountAddInterFrm */
	public accountAddInterFrm() {
		initComponents();
		this.setLocation(400, 100);
		this.accountAddOut.setSelected(true);
		this.accountAddIn.setSelected(false);
		this.fillItem();
		if (this.accountAddItem.getItemCount() > 0) {
			this.accountAddItem.setSelectedIndex(0);
		}
	}

	private void fillItem() {
		ItemDaoImpl idi = new ItemDaoImpl();
		accountAddItem.removeAllItems();
		try {
			if (accountAddOut.isSelected()) {
				idi.findItem(accountAddItem, accountAddOut.getText());
			} else if (accountAddIn.isSelected()) {
				idi.findItem(accountAddItem, accountAddIn.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initComponents() {

jLabel1 = new javax.swing.JLabel();
accountAddOut = new javax.swing.JRadioButton();
accountAddIn = new javax.swing.JRadioButton();
jLabel2 = new javax.swing.JLabel();
accountAddItem = new javax.swing.JComboBox();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
accountAddMoney = new javax.swing.JTextField();
accountAddDate = new javax.swing.JTextField();
accountAddDesc = new javax.swing.JTextField();
accountAddAdd = new javax.swing.JButton();
accountAddReset = new javax.swing.JButton();

setClosable(true);
setIconifiable(true);
setTitle("\u6536\u652f\u6dfb\u52a0");
setVisible(true);

jLabel1.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel1.setText("\u7c7b\u578b\uff1a");

accountAddOut.setFont(new java.awt.Font("幼圆", 0, 12));
accountAddOut.setText("\u652f\u51fa");
accountAddOut.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
accountAddOutActionPerformed(evt);
}
});

accountAddIn.setFont(new java.awt.Font("幼圆", 0, 12));
accountAddIn.setText("\u6536\u5165");
accountAddIn.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
accountAddInActionPerformed(evt);
}
});

jLabel2.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel2.setText("\u9879\u76ee\uff1a");


jLabel3.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel3.setText("\u91d1\u989d\uff1a");

jLabel4.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel4.setText("\u65e5\u671f\uff1a");

jLabel5.setFont(new java.awt.Font("幼圆", 0, 14));
jLabel5.setText("\u8bf4\u660e\uff1a");

accountAddMoney.setFont(new java.awt.Font("宋体", 0, 14));

accountAddDate.setFont(new java.awt.Font("宋体", 0, 14));

accountAddDesc.setFont(new java.awt.Font("宋体", 0, 14));

accountAddAdd.setFont(new java.awt.Font("幼圆", 1, 14));
//accountAddAdd.setIcon(new javax.swing.ImageIcon("E:\\Workspaces\\MyEclipse 8.5\\FamilyAccount\\images\\add.png")); // NOI18N
accountAddAdd.setText("\u6dfb\u52a0");
accountAddAdd.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
accountAddAddActionPerformed(evt);
}
});

accountAddReset.setFont(new java.awt.Font("幼圆", 1, 14));
//accountAddReset.setIcon(new javax.swing.ImageIcon("E:\\Workspaces\\MyEclipse 8.5\\FamilyAccount\\images\\reset.png")); // NOI18N
accountAddReset.setText("\u91cd\u7f6e");
accountAddReset.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
accountAddResetActionPerformed(evt);
}
});

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(50, 50, 50)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addGap(8, 8, 8)
.addComponent(accountAddOut)
.addGap(1, 1, 1)
.addComponent(accountAddIn)
.addGap(31, 31, 31)
.addComponent(jLabel2)
.addGap(8, 8, 8)
.addComponent(accountAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel3)
.addGap(8, 8, 8)
.addComponent(accountAddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(40, 40, 40)
.addComponent(jLabel4)
.addGap(8, 8, 8)
.addComponent(accountAddDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel5)
.addGap(8, 8, 8)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(accountAddDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createSequentialGroup()
.addComponent(accountAddAdd)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(accountAddReset)
.addGap(34, 34, 34)))))
.addContainerGap(66, Short.MAX_VALUE))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(50, 50, 50)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(accountAddOut)
.addComponent(accountAddIn)
.addComponent(jLabel2)
.addComponent(accountAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(37, 37, 37)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel3)
.addComponent(accountAddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel4)
.addComponent(accountAddDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(48, 48, 48)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel5)
.addComponent(accountAddDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(51, 51, 51)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(accountAddAdd)
.addComponent(accountAddReset))
.addContainerGap(73, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents

	//添加按钮
	private void accountAddAddActionPerformed(java.awt.event.ActionEvent evt) {
		String datestr = accountAddDate.getText();
		String moneystr = accountAddMoney.getText();
		if (StringUtil.isEmpty(moneystr)) {
			JOptionPane.showMessageDialog(null, "金额不能为空！");
			return;
		}
		if (StringUtil.isEmpty(datestr)) {
			JOptionPane.showMessageDialog(null, "日期不能为空！");
			return;
		}

		String desc = accountAddDesc.getText();
		String itemname = (String) accountAddItem.getSelectedItem();
		Date date = null;
		float money = 0;
		try {
			//最好先判断下moneystr里面有没有出字母efd
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

		String itemtype = null;
		if (accountAddOut.isSelected()) {
			itemtype = accountAddOut.getText();
		} else if (accountAddIn.isSelected()) {
			itemtype = accountAddIn.getText();
		}

		Account account = new Account(date, money, desc, itemname, itemtype);
		AccountDaoImpl adi = new AccountDaoImpl();
		try {
			int i = adi.addAccount(account);
			if (i == 1) {
				JOptionPane.showMessageDialog(null, "添加成功！");
				this.resetValues();
			} else {
				JOptionPane.showMessageDialog(null, "添加失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "添加失败！");
		}

	}

	//选择收入时，不选择支出
	private void accountAddInActionPerformed(java.awt.event.ActionEvent evt) {
		this.accountAddOut.setSelected(false);
		this.fillItem();
	}

	//选择支出时，不选择收入
	private void accountAddOutActionPerformed(java.awt.event.ActionEvent evt) {
		this.accountAddIn.setSelected(false);
		this.fillItem();
	}

	//重置按钮
	private void accountAddResetActionPerformed(java.awt.event.ActionEvent evt) {
		this.resetValues();
	}

	private void resetValues() {
		this.accountAddOut.setSelected(true);
		this.accountAddIn.setSelected(false);
		this.fillItem();
		if (this.accountAddItem.getItemCount() > 0) {
			this.accountAddItem.setSelectedIndex(0);
		}
		this.accountAddDate.setText("");
		this.accountAddDesc.setText("");
		this.accountAddMoney.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton accountAddAdd;
	private javax.swing.JTextField accountAddDate;
	private javax.swing.JTextField accountAddDesc;
	private javax.swing.JRadioButton accountAddIn;
	private javax.swing.JComboBox accountAddItem;
	private javax.swing.JTextField accountAddMoney;
	private javax.swing.JRadioButton accountAddOut;
	private javax.swing.JButton accountAddReset;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	// End of variables declaration//GEN-END:variables

}