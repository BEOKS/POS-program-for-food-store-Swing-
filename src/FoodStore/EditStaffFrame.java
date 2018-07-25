package FoodStore;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.event.*;
import javax.swing.table.*;

public class EditStaffFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public EditStaffFrame(JTable SL) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("이름");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(120, 31, 61, 40);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("급여");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(120, 71, 61, 40);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("직급");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(120, 111, 61, 40);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("연락처");
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(120, 151, 61, 40);
		contentPane.add(label_3);
		
		int row = SL.getSelectedRow();
		
		textField = new JTextField(SL.getValueAt(row, 1).toString());
		textField.setBounds(193, 39, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(SL.getValueAt(row, 2).toString());
		textField_1.setBounds(193, 79, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(SL.getValueAt(row, 3).toString());
		textField_2.setBounds(193, 119, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(SL.getValueAt(row, 5).toString());
		textField_3.setBounds(193, 159, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("취소");
		button.setBounds(217, 201, 75, 53);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(button);
		
		String date = SL.getValueAt(row, 4).toString();
		
		JButton button_1 = new JButton("확인");
		button_1.setBounds(130, 201, 75, 53);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty(textField) || isEmpty(textField_1) || isEmpty(textField_2)) {
					System.err.println("Error");
				}else {
					Object[] tmp = new Object[6];
					tmp[0] = SL.getValueAt(row, 0);
					tmp[1] = textField.getText();
					tmp[2] = textField_1.getText();
					tmp[3] = textField_2.getText();
					tmp[5] = textField_3.getText();
					
					tmp[4] = date;
					
					DefaultTableModel tmpDTM = (DefaultTableModel)StaffListPanel.StaffList.getModel();
					tmpDTM.insertRow(row, tmp);
					tmpDTM.removeRow(row + 1);
					
					StaffListPanel.StaffInfo[row][0] = tmp[0];
					StaffListPanel.StaffInfo[row][1] = tmp[1];
					StaffListPanel.StaffInfo[row][2] = tmp[2];
					StaffListPanel.StaffInfo[row][3] = tmp[3];
					StaffListPanel.StaffInfo[row][4] = tmp[4];
					StaffListPanel.StaffInfo[row][5] = tmp[5];
				}
				dispose();
			}
		});
		contentPane.add(button_1);
	}

	public boolean isEmpty(JTextField txt){
		return (txt == null) ? true : false;
	}
}
