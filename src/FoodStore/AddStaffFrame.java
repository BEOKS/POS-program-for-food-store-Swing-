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
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.util.Calendar;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class AddStaffFrame extends JFrame {
	
	public static int StaffNumber = 0;

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
	public AddStaffFrame() {
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
		
		textField = new JTextField();
		textField.setBounds(193, 39, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 79, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(193, 119, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
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
		
		JButton button_1 = new JButton("입력");
		button_1.setBounds(130, 201, 75, 53);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEmpty(textField) || isEmpty(textField_1) || isEmpty(textField_2)) {
					System.err.println("Error");
				}else {
					Object[] tmp = new Object[6];
					tmp[0] = StaffNumber++;
					tmp[1] = textField.getText();
					tmp[2] = textField_1.getText();
					tmp[3] = textField_2.getText();
					tmp[5] = textField_3.getText();
					
					Calendar cal = FirstSettingPanel.todateDateInfo;
					int year = cal.get(cal.YEAR);
					int month = cal.get(cal.MONTH) + 1;
					int date = cal.get(cal.DATE);
					
					String ymd = "";
					ymd += year + "년 " + month + "월 " + date + "일";
					tmp[4] = ymd;
					
					DefaultTableModel tmpDTM = (DefaultTableModel)StaffListPanel.StaffList.getModel();
					tmpDTM.addRow(tmp);
					
					StaffListPanel.StaffInfo[StaffListPanel.idx][0] = tmp[0];
					StaffListPanel.StaffInfo[StaffListPanel.idx][1] = tmp[1];
					StaffListPanel.StaffInfo[StaffListPanel.idx][2] = tmp[2];
					StaffListPanel.StaffInfo[StaffListPanel.idx][3] = tmp[3];
					StaffListPanel.StaffInfo[StaffListPanel.idx][4] = tmp[4];
					StaffListPanel.StaffInfo[StaffListPanel.idx][5] = tmp[5];
					StaffListPanel.idx++;
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
