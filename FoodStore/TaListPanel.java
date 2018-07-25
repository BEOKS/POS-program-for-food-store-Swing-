package FoodStore;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.Serializable;
import javax.swing.event.*;
import javax.swing.table.*;

public class TaListPanel implements Serializable{
	public static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9;
	public static JTable aT1, aT2, aT3, aT4, aT5, aT6, aT7, aT8, aT9;
	public static JScrollPane tS1, tS2, tS3, tS4, tS5, tS6, tS7, tS8, tS9;
	
	public TaListPanel() {
		String[] colName = {"메뉴", "가격"};
		DefaultTableModel dTM1 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM2 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM3 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM4 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM5 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM6 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM7 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM8 = new DefaultTableModel(colName, 0);
		DefaultTableModel dTM9 = new DefaultTableModel(colName, 0);
		
		p1 = new JPanel();
		p1.setSize(411, 750);
		p1.setLayout(null);
		aT1 = new JTable(dTM1);
		tS1 = new JScrollPane(aT1);
		tS1.setBounds(6, 6, 399, 600);
		p1.add(tS1);
		
		p2 = new JPanel();
		p2.setSize(411, 750);
		p2.setLayout(null);
		aT2 = new JTable(dTM2);
		tS2 = new JScrollPane(aT2);
		tS2.setBounds(6, 6, 399, 600);
		p2.add(tS2);
		
		p3 = new JPanel();
		p3.setSize(411, 750);
		p3.setLayout(null);
		aT3 = new JTable(dTM3);
		tS3 = new JScrollPane(aT3);
		tS3.setBounds(6, 6, 399, 600);
		p3.add(tS3);
		
		p4 = new JPanel();
		p4.setSize(411, 750);
		p4.setLayout(null);
		aT4 = new JTable(dTM4);
		tS4 = new JScrollPane(aT4);
		tS4.setBounds(6, 6, 399, 600);
		p4.add(tS4);
		
		p5 =  new JPanel();
		p5.setSize(411, 750);
		p5.setLayout(null);
		aT5 = new JTable(dTM5);
		tS5 = new JScrollPane(aT5);
		tS5.setBounds(6, 6, 399, 600);
		p5.add(tS5);
		
		p6 = new JPanel();
		p6.setSize(411, 750);
		p6.setLayout(null);
		aT6 = new JTable(dTM6);
		tS6 = new JScrollPane(aT6);
		tS6.setBounds(6, 6, 399, 600);
		p6.add(tS6);
		
		p7 = new JPanel();
		p7.setSize(411, 750);
		p7.setLayout(null);
		aT7 = new JTable(dTM7);
		tS7 = new JScrollPane(aT7);
		tS7.setBounds(6, 6, 399, 600);
		p7.add(tS7);
		
		p8 = new JPanel();
		p8.setSize(411, 750);
		p8.setLayout(null);
		aT8 = new JTable(dTM8);
		tS8 = new JScrollPane(aT8);
		tS8.setBounds(6, 6, 399, 600);
		p8.add(tS8);
		
		p9 = new JPanel();
		p9.setSize(411, 750);
		p9.setLayout(null);
		aT9 = new JTable(dTM9);
		tS9 = new JScrollPane(aT9);
		tS9.setBounds(6, 6, 399, 600);
		p9.add(tS9);
		
		JButton addBtn = new JButton("추가");
		addBtn.setBounds(16, 618, 175, 126);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTableFrame fr = new AddTableFrame();
				fr.setVisible(true);
			}
		});
		p1.add(addBtn);
		p2.add(addBtn);
		p3.add(addBtn);
		p4.add(addBtn);
		p5.add(addBtn);
		p6.add(addBtn);
		p7.add(addBtn);
		p8.add(addBtn);
		p9.add(addBtn);
		
		JButton payBtn = new JButton("결제");
		payBtn.setBounds(218, 618, 175, 126);
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayTableFrame pfr = new PayTableFrame();
				pfr.setVisible(true);
			}
		});
		p1.add(payBtn);
		p2.add(payBtn);
		p3.add(payBtn);
		p4.add(payBtn);
		p5.add(payBtn);
		p6.add(payBtn);
		p7.add(payBtn);
		p8.add(payBtn);
		p9.add(payBtn);
	}
}
