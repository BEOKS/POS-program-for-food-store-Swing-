package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class EditMemberFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public EditMemberFrame(JTable ML) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("이름");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(120, 31, 61, 40);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("마일리지");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_1.setBounds(120, 83, 61, 40);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("연락처");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label_2.setBounds(120, 135, 61, 40);
		contentPane.add(label_2);
		
		int row = ML.getSelectedRow();
		
		textField = new JTextField(ML.getValueAt(row, 2).toString());
		textField.setBounds(193, 39, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(ML.getValueAt(row, 3).toString());
		textField_1.setBounds(193, 91, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(ML.getValueAt(row, 4).toString());
		textField_2.setBounds(193, 143, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("취소");
		button.setBounds(218, 201, 75, 53);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("확인");
		button_1.setBounds(130, 201, 75, 53);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty(textField) || isEmpty(textField_1) || isEmpty(textField_2)) {
					System.err.println("Error");
				}else {
					Object[] tmp = new Object[5];
					int mileage = 0;
					
					tmp[0] = ML.getValueAt(row, 0);
					tmp[2] = textField.getText();
					mileage = Integer.parseInt(textField_1.getText());
					tmp[3] = mileage;
					//general 500 500~1000 gold 1000 platinum
					if(mileage < 500) {
						tmp[1] = "General";
					}else if(500 <= mileage && mileage < 1000) {
						tmp[1] = "Gold";
					}else {
						tmp[1] = "Platinum";
					}
					tmp[4] = textField_2.getText();
					
					DefaultTableModel tmpDTM = (DefaultTableModel)MemberListPanel.MemberList.getModel();
					tmpDTM.insertRow(row, tmp);
					tmpDTM.removeRow(row + 1);
					
					MemberListPanel.MemberInfo[row][0] = tmp[0];
					MemberListPanel.MemberInfo[row][1] = tmp[1];
					MemberListPanel.MemberInfo[row][2] = tmp[2];
					MemberListPanel.MemberInfo[row][3] = tmp[3];
					MemberListPanel.MemberInfo[row][4] = tmp[4];
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
