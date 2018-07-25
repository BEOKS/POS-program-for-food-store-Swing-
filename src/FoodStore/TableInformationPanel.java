package FoodStore;/*package FoodStore;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.*;

public class TableInformationPanel extends JPanel {
	public static JButton selectedTable, Table1, Table2, Table3, Table4, Table5, Table6, Table7, Table8, Table9;
	public static boolean k = true;
	
	public TableInformationPanel() {
		setLayout(null);
		setSize(765, 750);
		
		Table1 = new JButton("테이블1");
		Table1.setBounds(25, 25, 225, 225);
		Table1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table1;
				TableMainPanel.t1.setVisible(true);TableMainPanel.t2.setVisible(true);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table1);
		
		Table2 = new JButton("테이블2");
		Table2.setBounds(268, 25, 225, 225);
		Table2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table2;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(true);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table2);
		
		Table3 = new JButton("테이블3");
		Table3.setBounds(515, 25, 225, 225);
		Table3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table3;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(true);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table3);
		
		Table4 = new JButton("테이블4");
		Table4.setBounds(25, 264, 225, 225);
		Table4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table4;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(true);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table4);
		
		Table5 = new JButton("테이블5");
		Table5.setBounds(268, 264, 225, 225);
		Table5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table5;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(true);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table5);
		
		Table6 = new JButton("테이블6");
		Table6.setBounds(515, 264, 225, 225);
		Table6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table6;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(true);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table6);
		
		Table7 = new JButton("테이블7");
		Table7.setBounds(25, 505, 225, 225);
		Table7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table7;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(true);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table7);
		
		Table8 = new JButton("테이블8");
		Table8.setBounds(268, 505, 225, 225);
		Table8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table8;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(true);TableMainPanel.t9.setVisible(false);
			}
		});
		add(Table8);
		
		Table9 = new JButton("테이블9");
		Table9.setBounds(515, 505, 225, 225);
		Table9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table9;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(true);
			}
		});
		add(Table9);
	}
}*/
