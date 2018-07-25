package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class PayYESTableFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PayYESTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("회원이십니까?");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 75, 300, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("YES");
		btnNewButton.setBounds(75, 168, 117, 74);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PayMemberTableFrame fr = new PayMemberTableFrame();
				fr.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNo = new JButton("NO");
		btnNo.setBounds(258, 168, 117, 74);
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PayNotMemberTableFrame fr = new PayNotMemberTableFrame();
				fr.setVisible(true);
			}
		});
		contentPane.add(btnNo);
	}

}
