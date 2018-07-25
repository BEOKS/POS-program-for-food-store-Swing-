package FoodStore;

import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.event.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberListPanel extends JPanel {
	public static JTable MemberList;
	public static Object[] newRow = new Object[5];
	
	public static Object[][] MemberInfo = new Object[1000][5]; // 1000명의 회원 관리

	/**
	 * Create the panel.
	 */
	public MemberListPanel() {
		setSize(1176, 750);
		setLayout(null);
		
		/*
		 * JTable 생성
		 */
		String[] colInfo = {"번호", "등급", "이름", "마일리지", "연락처"};
		DefaultTableModel dtm = new DefaultTableModel(colInfo, 0);
		MemberList = new JTable(dtm);
		
		JScrollPane MemberListScroll = new JScrollPane(MemberList);
		MemberListScroll.setBounds(0, 0, 1176, 600);
		add(MemberListScroll);
		
		/*
		 * JButton 설정
		 */
		JButton btnNewButton = new JButton("편집");
		btnNewButton.setBounds(699, 612, 149, 132);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditMemberFrame Efr = new EditMemberFrame(MemberList);
				Efr.setVisible(true);
				//DefaultTableModel Edtm = (DefaultTableModel)MemberList.getModel();
				//Edtm.addRow(newRow);
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("추가");
		btnNewButton_1.setBounds(860, 612, 149, 132);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMemberFrame fr = new AddMemberFrame();
				fr.setVisible(true);
			}
		});
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.setBounds(1021, 612, 149, 132);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = MemberList.getSelectedRow();
				DefaultTableModel deleteInfo = (DefaultTableModel)MemberList.getModel();
				deleteInfo.removeRow(row);
				
				int tmp = row;
				while(true) {
					if(MemberInfo[tmp][1].equals(null)) {
						break;
					}
					MemberInfo[tmp][0] = MemberInfo[tmp+1][0];
					MemberInfo[tmp][1] = MemberInfo[tmp+1][1];
					MemberInfo[tmp][2] = MemberInfo[tmp+1][2];
					MemberInfo[tmp][3] = MemberInfo[tmp+1][3];
					MemberInfo[tmp][4] = MemberInfo[tmp+1][4];
					tmp++;
				}
				
			}
		});
		add(btnNewButton_2);
		
	}
}
