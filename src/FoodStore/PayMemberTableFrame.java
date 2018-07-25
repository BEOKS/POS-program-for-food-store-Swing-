package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.event.*;

public class PayMemberTableFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button_1;
	private JButton button_2;
	
	public static int findIdx;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PayMemberTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("회원 번호");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(131, 43, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("회원 이름");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(131, 81, 61, 16);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(204, 38, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 76, 130, 26);
		contentPane.add(textField_1);
		
		String str = "";
		
		textField_2 = new JTextField(str);
		textField_2.setBounds(6, 155, 438, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("검색");
		button.setBounds(172, 114, 117, 29);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cnt = 0;
				while(true) {
					if(MemberListPanel.MemberInfo[cnt][1].equals(null)) {
						textField_2.setText("회원정보를 찾지 못하였습니다.");
						dispose();
						break;
					}
					if(Integer.parseInt(textField.getText()) == (int)MemberListPanel.MemberInfo[cnt][0]
							&& textField_1.getText().toString().equals(MemberListPanel.MemberInfo[cnt][2])) {
						textField_2.setText("회원정보를 확인하였습니다.");
						findIdx = cnt;
						break;
					}
					cnt++;
				}
			}
		});
		contentPane.add(button);
		
		button_1 = new JButton("결제 진행");
		button_1.setBounds(101, 210, 117, 29);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PayCompleteTableFrame pcfr = new PayCompleteTableFrame();
				pcfr.setVisible(true);
			}
		});
		contentPane.add(button_1);
		
		button_2 = new JButton("취소");
		button_2.setBounds(242, 210, 117, 29);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(button_2);
	}

}
