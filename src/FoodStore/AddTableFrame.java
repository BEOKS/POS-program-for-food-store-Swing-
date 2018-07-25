package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.table.*;

public class AddTableFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	private JTextField textField;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AddTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("선택 테이블");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(129, 34, 87, 38);
		contentPane.add(label);
		
		//선택 테이블 이름
		JLabel label_3 = new JLabel(TableMainPanel.selectedTable.getText().toString());
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_3.setBounds(228, 34, 130, 38);
		contentPane.add(label_3);
		
		JLabel label_1 = new JLabel("추가할 메뉴");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_1.setBounds(129, 84, 87, 38);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 91, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("메뉴 가격");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_2.setBounds(129, 160, 87, 38);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(228, 167, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel label_4 = new JLabel("수량");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_4.setBounds(129, 122, 87, 38);
		contentPane.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(228, 129, 130, 26);
		contentPane.add(textField);
		
		JButton addButton = new JButton("추가");
		addButton.setBounds(48, 224, 117, 29);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty(textField) || isEmpty(textField_1) || isEmpty(textField_2)) {
					System.err.println("Error");
				}else {
					Object[] Obj = new Object[2];
					Obj[0] = textField_1.getText();
					int temp1, temp2;
					temp1 = Integer.parseInt(textField_2.getText());
					Obj[1] = temp1;
					temp2 = Integer.parseInt(textField.getText());
					//TableMainPanel.result = TableMainPanel.result + temp1 * temp2;
					
					DefaultTableModel dtm = null, dtm2 = null, dtm3 = null, dtm4 = null, dtm5 = null, dtm6 = null, dtm7 = null, dtm8 = null, dtm9 = null;
					if(TableMainPanel.selectedTable == TableMainPanel.Table1) {
						dtm = (DefaultTableModel)TLP1.addTable.getModel();
						dtm.addRow(Obj);
						TLP1.result = TLP1.result + temp1 * temp2;
						TLP1.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table2) {
						dtm2 = (DefaultTableModel)TLP2.addTable2.getModel();
						dtm2.addRow(Obj);
						TLP2.result = TLP2.result + temp1 * temp2;
						TLP2.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table3) {
						dtm3 = (DefaultTableModel)TLP3.addTable3.getModel();
						dtm3.addRow(Obj);
						TLP3.result = TLP3.result + temp1 * temp2;
						TLP3.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table4) {
						dtm4 = (DefaultTableModel)TLP4.addTable4.getModel();
						dtm4.addRow(Obj);
						TLP4.result = TLP4.result + temp1 * temp2;
						TLP4.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table5) {
						dtm5 = (DefaultTableModel)TLP5.addTable5.getModel();
						dtm5.addRow(Obj);
						TLP5.result = TLP5.result + temp1 * temp2;
						TLP5.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table6) {
						dtm6 = (DefaultTableModel)TLP6.addTable6.getModel();
						dtm6.addRow(Obj);
						TLP6.result = TLP6.result + temp1 * temp2;
						TLP6.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table7) {
						dtm7 = (DefaultTableModel)TLP7.addTable7.getModel();
						dtm7.addRow(Obj);
						TLP7.result = TLP7.result + temp1 * temp2;
						TLP7.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table8) {
						dtm8 = (DefaultTableModel)TLP8.addTable8.getModel();
						dtm8.addRow(Obj);
						TLP8.result = TLP8.result + temp1 * temp2;
						TLP8.counter++;
					}
					if(TableMainPanel.selectedTable == TableMainPanel.Table9) {
						dtm9 = (DefaultTableModel)TLP9.addTable9.getModel();
						dtm9.addRow(Obj);
						TLP9.result = TLP9.result + temp1 * temp2;
						TLP9.counter++;
					}
					
					textField_1.setText("");
					textField.setText("");
					textField_2.setText("");
				}
			}
		});
		contentPane.add(addButton);
		
		JButton completeBtn = new JButton("취소");
		completeBtn.setBounds(299, 224, 117, 29);
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(completeBtn);
		
		JButton button = new JButton("완료");
		button.setBounds(170, 224, 117, 29);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tmpResult = 0;
				if(TableMainPanel.selectedTable == TableMainPanel.Table1) {
					tmpResult = TLP1.result;
					TLP1.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table2) {
					tmpResult = TLP2.result;
					TLP2.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table3) {
					tmpResult = TLP3.result;
					TLP3.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table4) {
					tmpResult = TLP4.result;
					TLP4.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table5) {
					tmpResult = TLP5.result;
					TLP5.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table6) {
					tmpResult = TLP6.result;
					TLP6.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table7) {
					tmpResult = TLP7.result;
					TLP7.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table8) {
					tmpResult = TLP8.result;
					TLP8.Tok = true;
				}
				if(TableMainPanel.selectedTable == TableMainPanel.Table9) {
					tmpResult = TLP9.result;
					TLP9.Tok = true;
				}
				String string=(TableMainPanel.selectedTable.getText().toString());
				string=string.substring(0,3);
				TableMainPanel.selectedTable.setText(string+"\n\n"
						+ "총 " + tmpResult + " 원");
				dispose();
			}
		});
		contentPane.add(button);
		
	}
	
	public boolean isEmpty(JTextField txt){
		return (txt == null) ? true : false;
	}
}
