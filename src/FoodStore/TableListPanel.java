package FoodStore;/*package FoodStore;

import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableListPanel extends JPanel {
	public static JTable addTable, addTable2, addTable3, addTable4, addTable5, addTable6, addTable7, addTable8, addTable9;
	public static Object[] name = new Object[2];
	public static int result = 0;
	public static JScrollPane tableScroll, tableScroll2, tableScroll3, tableScroll4, tableScroll5, tableScroll6, tableScroll7, tableScroll8, tableScroll9;
	
	public TableListPanel() {
		setSize(411, 750);
		setLayout(null);
		
		String[] colName = {"메뉴", "가격"};
		DefaultTableModel defaultTableMod = new DefaultTableModel(colName, 0);
		
		addTable = new JTable(defaultTableMod);
		tableScroll = new JScrollPane(addTable);
		tableScroll.setBounds(6, 6, 399, 600);
		tableScroll.setVisible(false);
		add(tableScroll);
		
		addTable2 = new JTable(defaultTableMod);
		tableScroll2 = new JScrollPane(addTable2);
		tableScroll2.setBounds(6, 6, 399, 600);
		tableScroll2.setVisible(false);
		add(tableScroll2);
		
		addTable3 = new JTable(defaultTableMod);
		tableScroll3 = new JScrollPane(addTable3);
		tableScroll3.setBounds(6, 6, 399, 600);
		add(tableScroll3);
		tableScroll3.setVisible(false);
		
		addTable4 = new JTable(defaultTableMod);
		tableScroll4 = new JScrollPane(addTable4);
		tableScroll4.setBounds(6, 6, 399, 600);
		add(tableScroll4);
		tableScroll4.setVisible(false);
		
		addTable5 = new JTable(defaultTableMod);
		tableScroll5 = new JScrollPane(addTable5);
		tableScroll5.setBounds(6, 6, 399, 600);
		add(tableScroll5);
		tableScroll5.setVisible(false);
		
		addTable6 = new JTable(defaultTableMod);
		tableScroll6 = new JScrollPane(addTable6);
		tableScroll6.setBounds(6, 6, 399, 600);
		add(tableScroll6);
		tableScroll6.setVisible(false);
		
		addTable7 = new JTable(defaultTableMod);
		tableScroll7 = new JScrollPane(addTable7);
		tableScroll7.setBounds(6, 6, 399, 600);
		add(tableScroll7);
		tableScroll7.setVisible(false);
		
		addTable8 = new JTable(defaultTableMod);
		tableScroll8 = new JScrollPane(addTable8);
		tableScroll8.setBounds(6, 6, 399, 600);
		add(tableScroll8);
		tableScroll8.setVisible(false);
		
		addTable9 = new JTable(defaultTableMod);
		tableScroll9 = new JScrollPane(addTable9);
		tableScroll9.setBounds(6, 6, 399, 600);
		add(tableScroll9);
		tableScroll9.setVisible(false);
		
		JButton addBtn = new JButton("추가");
		addBtn.setBounds(16, 618, 175, 126);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTableFrame fr = new AddTableFrame();
				fr.setVisible(true);
			}
		});
		add(addBtn);
		
		JButton payBtn = new JButton("결제");
		payBtn.setBounds(218, 618, 175, 126);
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayTableFrame pfr = new PayTableFrame();
				pfr.setVisible(true);
			}
		});
		add(payBtn);
	}
}
*/
