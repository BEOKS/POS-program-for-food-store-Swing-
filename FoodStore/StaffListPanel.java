package FoodStore;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.event.*;

public class StaffListPanel extends JPanel {
	public static JTable StaffList;
	public static Object[] StaffRow = new Object[6];

	public static Object[][] StaffInfo = new Object[1000][6];
	public static int idx = 0;
	/**
	 * Create the panel.
	 */
	public StaffListPanel() {
		setSize(1176, 750);
		setLayout(null);
		
		String[] colInfo = {"번호", "이름", "급여", "직급", "입사일", "연락처"};
		DefaultTableModel dtm = new DefaultTableModel(colInfo, 0);
		StaffList = new JTable(dtm);
		
		JScrollPane StaffListScroll = new JScrollPane(StaffList);
		StaffListScroll.setBounds(0, 0, 1176, 600);
		add(StaffListScroll);
		
		JButton btnNewButton = new JButton("편집");
		btnNewButton.setBounds(699, 612, 149, 132);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditStaffFrame Efr = new EditStaffFrame(StaffList);
				Efr.setVisible(true);
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("추가");
		btnNewButton_1.setBounds(860, 612, 149, 132);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStaffFrame fr = new AddStaffFrame();
				fr.setVisible(true);
			}
		});
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.setBounds(1021, 612, 149, 132);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = StaffList.getSelectedRow();
				DefaultTableModel deleteInfo = (DefaultTableModel)StaffList.getModel();
				deleteInfo.removeRow(row);
				
				int tmp = row;
				while(true) {
					if(StaffInfo[tmp][1].equals(null)) {
						break;
					}
					StaffInfo[tmp][0] = StaffInfo[tmp+1][0];
					StaffInfo[tmp][1] = StaffInfo[tmp+1][1];
					StaffInfo[tmp][2] = StaffInfo[tmp+1][2];
					StaffInfo[tmp][3] = StaffInfo[tmp+1][3];
					StaffInfo[tmp][4] = StaffInfo[tmp+1][4];
					StaffInfo[tmp][5] = StaffInfo[tmp+1][5];
					tmp++;
				}
			}
		});
		add(btnNewButton_2);
	}

}
