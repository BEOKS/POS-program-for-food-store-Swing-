package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.event.*;

public class AddMemberFrame extends JFrame {
	
	public static int memberNumber = 0;
	public static int idx = 0;

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
	public AddMemberFrame() {
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
		
		textField = new JTextField();
		textField.setBounds(193, 39, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 91, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
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
		
		JButton button_1 = new JButton("입력");
		button_1.setBounds(130, 201, 75, 53);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty(textField) || isEmpty(textField_1) || isEmpty(textField_2)) {
					System.err.println("Error");
				}else {
					Object[] tmp = new Object[5];
					int tmpMNumber;
					int mileage = 0;
					String tmpName;
					String tmpLevel;
					String tmpPhone;
					
					tmpMNumber = memberNumber++;
					tmpName = textField.getText().toString();
					tmpPhone = textField_2.getText().toString();
					mileage = Integer.parseInt(textField_1.getText().toString());
					
					tmp[0] = tmpMNumber;
					tmp[2] = tmpName;
					tmp[3] = mileage;
					//general 500 500~1000 gold 1000 platinum
					if(mileage < 500) {
						tmpLevel = "General";
					}else if(500 <= mileage && mileage < 1000) {
						tmpLevel = "Gold";
					}else {
						tmpLevel = "Platinum";
					}
					tmp[1] = tmpLevel;
					tmp[4] = tmpPhone;
					
					DefaultTableModel tmpDTM = (DefaultTableModel)MemberListPanel.MemberList.getModel();
					tmpDTM.addRow(tmp);
					
					MemberListPanel.MemberInfo[idx][0] = tmpMNumber;
					MemberListPanel.MemberInfo[idx][1] = tmpLevel;
					MemberListPanel.MemberInfo[idx][2] = tmpName;
					MemberListPanel.MemberInfo[idx][3] = mileage;
					MemberListPanel.MemberInfo[idx][4] = tmpPhone;
					idx++;
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
