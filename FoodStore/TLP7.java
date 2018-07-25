package FoodStore;

import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TLP7 extends JPanel {
	public static JTable addTable7;
	public static Object[] name = new Object[2];
	public static int result = 0;
	public static JScrollPane tableScroll7;
	public static int counter = 0;
	
	public static boolean Tok = false;
	/**
	 * Create the panel.
	 */
	public TLP7(TableMainPanel tableMainPanel) {
		setSize(411, 750);
		setLayout(null);
		
		String[] colName = {"메뉴", "가격"};
		DefaultTableModel defaultTableMod = new DefaultTableModel(colName, 0);
		
		addTable7 = new JTable(defaultTableMod);
		tableScroll7 = new JScrollPane(addTable7);
		tableScroll7.setBounds(6, 6, 399, 600);
		add(tableScroll7);
		
		JButton addBtn = new JButton("추가");
		addBtn.setBounds(16, 618, 175, 58);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTableFrame fr = new AddTableFrame();
				fr.setVisible(true);
			}
		});
		add(addBtn);
		
		JButton payBtn = new JButton("결제");
		payBtn.setBounds(218, 618, 175, 58);
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayTableFrame pfr = new PayTableFrame();
				pfr.setVisible(true);
			}
		});
		add(payBtn);
		addTableButton(tableMainPanel);
	}
	public void addTableButton(TableMainPanel tableMainPanel){
		JButton addTableButton=new JButton("테이블 추가");
		addTableButton.setBounds(16, 686, 175, 58);
		addTableButton.addActionListener(new tableAddAction(tableMainPanel));

		JButton removeTableButton=new JButton("테이블 삭제");
		removeTableButton.setBounds(218, 686, 175, 58);
		removeTableButton.addActionListener(new tableDeleteButton(tableMainPanel));
		add(addTableButton);
		add(removeTableButton);
		//TODO 테이블 추가 제거 버튼 설정
	}
	class tableAddAction implements ActionListener{
		TableMainPanel tableMainPanel=null;
		tableAddAction(TableMainPanel tableMainPanel){
			this.tableMainPanel=tableMainPanel;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jButton=new JButton("테이블"+(TableMainPanel.tableNum+1));
			TableMainPanel.tableNum++;
			jButton.setSize(225,225);
			TableMainPanel.tableButtonList.add(jButton);
			TableMainPanel.tableScrollPane.add(jButton);
			TableMainPanel.tableScrollPane.setVisible(false);
			TableMainPanel.tableScrollPane.repaint();
			TableMainPanel.tableScrollPane.setVisible(true);
			tableMainPanel.setVisible(false);
			tableMainPanel.repaint();
			tableMainPanel.setVisible(true);
		}
	}
	class tableDeleteButton implements ActionListener{
		TableMainPanel tableMainPanel=null;
		tableDeleteButton(TableMainPanel tableMainPanel){
			this.tableMainPanel=tableMainPanel;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			TableMainPanel.tableScrollPane.remove(TableMainPanel.tableButtonList.get(
					TableMainPanel.tableButtonList.size()-1));
			TableMainPanel.tableScrollPane.setVisible(false);
			TableMainPanel.tableScrollPane.repaint();
			TableMainPanel.tableScrollPane.setVisible(true);
			TableMainPanel.tableNum-=1;
			tableMainPanel.setVisible(false);
			tableMainPanel.repaint();
			tableMainPanel.setVisible(true);

		}
	}
}