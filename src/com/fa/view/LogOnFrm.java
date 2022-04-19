package com.fa.view;

import javax.swing.JOptionPane;

import com.fa.dao.impl.UserDaoImpl;
import com.fa.dto.User;
import com.fa.util.StringUtil;

/**
 *
 * ��¼����
 */
public class LogOnFrm extends javax.swing.JFrame {

	/** Creates new form LogOnFrm */
	public LogOnFrm() {
		initComponents();
		setLocation(400, 250);
	}

	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		userTxt = new javax.swing.JTextField();
		passwordTxt = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("����Ա��¼");
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("��Բ", 1, 24));
		//jLabel1
				
		jLabel1.setText("��ͥ��֧����ϵͳ");

		jLabel2.setFont(new java.awt.Font("��Բ", 0, 14));
		//jLabel2
				
		jLabel2.setText("�û���");

		userTxt.setFont(new java.awt.Font("����", 0, 14));

		jLabel3.setFont(new java.awt.Font("��Բ", 0, 14));
		//jLabel3
				
		jLabel3.setText("�� ��");

		passwordTxt.setFont(new java.awt.Font("����", 0, 14));

		jButton1.setFont(new java.awt.Font("��Բ", 1, 14));
		//jButton1
			
		jButton1.setText("��¼");
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

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(                      //��Ӽ�϶
																				129,                  //��϶��С��С
																				129,                  //��϶��ѡ��С
																				129)                  //��϶����С
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton2))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel2)
																														.addComponent(
																																jLabel3))
																										.addGap(
																												34,
																												34,
																												34)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																passwordTxt,
																																0,
																																0,
																																Short.MAX_VALUE)
																														.addComponent(
																																userTxt,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																120,
																																Short.MAX_VALUE)))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				100,
																				100,
																				100)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				277,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(123, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(50, 50, 50)
										.addComponent(jLabel1)
										.addGap(26, 26, 26)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																userTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(31, 31, 31)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(
																passwordTxt,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(62, 62, 62)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addContainerGap(81, Short.MAX_VALUE)));

		pack();
	}
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String logName = userTxt.getText();
		String logPassword = new String(passwordTxt.getPassword());

		if (StringUtil.isEmpty(logName)) {
			JOptionPane.showMessageDialog(null, "�û�������Ϊ��!");
			return;
		}
		if (StringUtil.isEmpty(logPassword)) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ��!");
			return;
		}

		UserDaoImpl udi = new UserDaoImpl();
		User logUser = null;
		try {
			logUser = udi.findUser(logName, logPassword);
			if (logUser != null) { 
				JOptionPane.showMessageDialog(null,"��¼�ɹ�");
				this.dispose();//�ͷŵ�ǰ����
				new MainFrm().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "�û������������");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "��¼ʧ��");
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.userTxt.setText("");
		this.passwordTxt.setText("");
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LogOnFrm().setVisible(true);
			}
		});
	}

	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField passwordTxt;
	private javax.swing.JTextField userTxt;
	

}