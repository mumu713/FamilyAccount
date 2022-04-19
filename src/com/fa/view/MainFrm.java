package com.fa.view;

import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class MainFrm extends javax.swing.JFrame {

	/** Creates new form MainFrm */
	public MainFrm() {
		initComponents();
		this.setExtendedState(MAXIMIZED_BOTH);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jDesktopPane1 = new javax.swing.JDesktopPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\\u5bb6\\u5ead\\u6536\\u652f\\u7ba1\\u7406\\u7cfb\\u7edf");  
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing();
			}
		});

		jButton1.setFont(new java.awt.Font("��Բ", 1, 18));

		jButton1.setText("\u6536\u652f\u6dfb\u52a0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed();
			}
		});
		jPanel1.add(jButton1);

		jButton2.setFont(new java.awt.Font("��Բ", 1, 18));

		jButton2.setText("\u6536\u652f\u7ba1\u7406");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed();
			}
		});
		jPanel1.add(jButton2);

		jButton3.setFont(new java.awt.Font("��Բ", 1, 18));

		jButton3.setText("\u9879\u76ee\u6dfb\u52a0");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed();
			}
		});
		jPanel1.add(jButton3);

		jButton4.setFont(new java.awt.Font("��Բ", 1, 18));

		jButton4.setText("\u9879\u76ee\u7ba1\u7406");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed();
			}
		});
		jPanel1.add(jButton4);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550,
				Short.MAX_VALUE).addComponent(jDesktopPane1,
				javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												jPanel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jDesktopPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												334, Short.MAX_VALUE)));

		pack();
	}


	private void jButton2ActionPerformed() {
		AccountMngInterFrm accountmngfrm = new AccountMngInterFrm();
		this.jDesktopPane1.add(accountmngfrm);
	}

	private void jButton1ActionPerformed() {
		accountAddInterFrm accountaddfrm = new accountAddInterFrm();
		this.jDesktopPane1.add(accountaddfrm);
	}

	private void jButton4ActionPerformed() {
		ItemMngInterFrm itemmngfrm = new ItemMngInterFrm();
		this.jDesktopPane1.add(itemmngfrm);
	}

	private void formWindowClosing() {
		int option = JOptionPane.showConfirmDialog(null, "��ȷ��Ҫ�˳�ϵͳ��");
		if (option == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		this
				.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
	}

	private void jButton3ActionPerformed() {
		itemAddInternalFrame itemaddfrm = new itemAddInternalFrame();
		this.jDesktopPane1.add(itemaddfrm);
	}


	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JPanel jPanel1;

}