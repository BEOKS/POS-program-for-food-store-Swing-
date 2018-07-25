package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;

public class PayCompleteTableFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PayCompleteTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//TODO here
		int tmpResult = 0;
		if(TableMainPanel.selectedTable == TableMainPanel.Table1) {
			tmpResult = TLP1.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table2) {
			tmpResult = TLP2.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table3) {
			tmpResult = TLP3.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table4) {
			tmpResult = TLP4.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table5) {
			tmpResult = TLP5.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table6) {
			tmpResult = TLP6.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table7) {
			tmpResult = TLP7.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table8) {
			tmpResult = TLP8.result;
		}
		if(TableMainPanel.selectedTable == TableMainPanel.Table9) {
			tmpResult = TLP9.result;
		}
		
		int payRe = tmpResult;
		
		double tmpSale = 0;
		double tmpFinal = 0;
		
		JButton btnNo = new JButton("취소");
		btnNo.setBounds(258, 215, 80, 40);
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnNo);
		
		JLabel label = new JLabel("회원 등급");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(131, 30, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("총 금액");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(131, 68, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("적립되는 마일리지");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(100, 106, 92, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("할인 금액");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(131, 144, 61, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("결제 금액");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(131, 182, 61, 16);
		contentPane.add(label_4);
		
		String str = "";
		
		textField = new JTextField(str);
		textField.setBounds(208, 25, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(Integer.toString(payRe));
		textField_1.setBounds(208, 63, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(str);
		textField_2.setBounds(208, 101, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(str);
		textField_3.setBounds(208, 139, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(str);
		textField_4.setBounds(208, 177, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
		if(MemberListPanel.MemberInfo[PayMemberTableFrame.findIdx][1].toString().equals("general")) {
			textField.setText("general");
			tmpSale = payRe * 0.02;
		}
		if(MemberListPanel.MemberInfo[PayMemberTableFrame.findIdx][1].toString().equals("gold")) {
			textField.setText("gold");
			tmpSale = payRe * 0.05;
		}
		if(MemberListPanel.MemberInfo[PayMemberTableFrame.findIdx][1].toString().equals("Platinum")) {
			textField.setText("Platinum");
			tmpSale = payRe * 0.1;
		}
		double tmpMile = payRe * 0.02;
		textField_2.setText(Integer.toString((int)tmpMile));
		
		tmpFinal = payRe - tmpSale;
		textField_3.setText(Integer.toString((int)tmpSale));
		textField_4.setText(Integer.toString((int)tmpFinal));
		
		int s = (int) tmpFinal;
		
		JButton btnNewButton = new JButton("결제");
		btnNewButton.setBounds(117, 215, 75, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				TableMainPanel.result = TableMainPanel.result + s;
				FirstSettingPanel.saleLabel.setText("오늘 매출: "+(int)TableMainPanel.result+"원");
				//TODO here
				if(TableMainPanel.selectedTable == TableMainPanel.Table1) {
					TLP1.result = 0;
					TableMainPanel.selectedTable.setText("테이블1");
					DefaultTableModel dtm = (DefaultTableModel)TLP1.addTable.getModel();
					dtm.setNumRows(0);
					TLP1.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table2) {
					TLP2.result = 0;
					TableMainPanel.selectedTable.setText("테이블2");
					DefaultTableModel dtm = (DefaultTableModel)TLP2.addTable2.getModel();
					dtm.setNumRows(0);
					TLP2.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table3) {
					TLP3.result = 0;
					TableMainPanel.selectedTable.setText("테이블3");
					DefaultTableModel dtm = (DefaultTableModel)TLP3.addTable3.getModel();
					dtm.setNumRows(0);
					TLP3.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table4) {
					TLP4.result = 0;
					TableMainPanel.selectedTable.setText("테이블4");
					DefaultTableModel dtm = (DefaultTableModel)TLP4.addTable4.getModel();
					dtm.setNumRows(0);
					TLP4.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table5) {
					TLP5.result = 0;
					TableMainPanel.selectedTable.setText("테이블5");
					DefaultTableModel dtm = (DefaultTableModel)TLP5.addTable5.getModel();
					dtm.setNumRows(0);
					TLP5.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table6) {
					TLP6.result = 0;
					TableMainPanel.selectedTable.setText("테이블6");
					DefaultTableModel dtm = (DefaultTableModel)TLP6.addTable6.getModel();
					dtm.setNumRows(0);
					TLP6.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table7) {
					TLP7.result = 0;
					TableMainPanel.selectedTable.setText("테이블7");
					DefaultTableModel dtm = (DefaultTableModel)TLP7.addTable7.getModel();
					dtm.setNumRows(0);
					TLP7.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table8) {
					TLP8.result = 0;
					TableMainPanel.selectedTable.setText("테이블8");
					DefaultTableModel dtm = (DefaultTableModel)TLP8.addTable8.getModel();
					dtm.setNumRows(0);
					TLP8.Tok = false;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table9) {
					TLP9.result = 0;
					TableMainPanel.selectedTable.setText("테이블9");
					DefaultTableModel dtm = (DefaultTableModel)TLP9.addTable9.getModel();
					dtm.setNumRows(0);
					TLP9.Tok = false;
				}
			}
		});
		contentPane.add(btnNewButton);
	}
}
