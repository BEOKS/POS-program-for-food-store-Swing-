package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class PayNotMemberTableFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PayNotMemberTableFrame() {
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
		
		JButton btnNewButton = new JButton("결제");
		btnNewButton.setBounds(117, 215, 75, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TableMainPanel.result = TableMainPanel.result + payRe;
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
					TableMainPanel.selectedTable.setText("테이블2");
					TLP2.result = 0;
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
		
		JButton btnNo = new JButton("취소");
		btnNo.setBounds(258, 215, 80, 40);
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnNo);
		
		JLabel label_1 = new JLabel("총 금액");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(131, 68, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_4 = new JLabel("결제 금액");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(131, 126, 61, 16);
		contentPane.add(label_4);
		
		textField_1 = new JTextField(Integer.toString(tmpResult));
		textField_1.setBounds(208, 63, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField(Integer.toString(tmpResult));
		textField_4.setBounds(208, 121, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
	}

}
