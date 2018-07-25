package FoodStore;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TableMainPanel extends JPanel {
	public static TLP1 t1;
	public static TLP2 t2;
	public static TLP3 t3;
	public static TLP4 t4;
	public static TLP5 t5;
	public static TLP6 t6;
	public static TLP7 t7;
	public static TLP8 t8;
	public static TLP9 t9;
	public static int tableNum=9;
	public static Panel tableScrollPane=new Panel();
	//TODO 9개 이후의 테이블 버튼 저장
	public static ArrayList<JButton> tableButtonList=new ArrayList<JButton>();
	//TODO 9개 이후의 TLP저장
	public static ArrayList<TLP> tlpArrayList=new ArrayList<TLP>();
	//TODO 테이블 추가, 제거 버튼
	public static JButton addTableButton,removeTableButton;
	
	public static JButton selectedTable, Table1, Table2, Table3, Table4, Table5, Table6, Table7, Table8, Table9;
	public static double result = 0;
	/**
	 * Create the panel.
	 */
	public TableMainPanel() {
		setSize(1176, 750);
		setLayout(null);
		
		t1 = new TLP1(this);
		t1.setVisible(false);
		t1.setBounds(765, 0, 411, 750);
		add(t1);
		
		t2 = new TLP2(this);
		t2.setVisible(false);
		t2.setBounds(765, 0, 411, 750);
		add(t2);
		
		t3 = new TLP3(this);
		t3.setVisible(false);
		t3.setBounds(765, 0, 411, 750);
		add(t3);
		
		t4 = new TLP4(this);
		t4.setVisible(false);
		t4.setBounds(765, 0, 411, 750);
		add(t4);
		
		t5 = new TLP5(this);
		t5.setVisible(false);
		t5.setBounds(765, 0, 411, 750);
		add(t5);
		
		t6 = new TLP6(this);
		t6.setVisible(false);
		t6.setBounds(765, 0, 411, 750);
		add(t6);
		
		t7 = new TLP7(this);
		t7.setVisible(false);
		t7.setBounds(765, 0, 411, 750);
		add(t7);
		
		t8 = new TLP8(this);
		t8.setVisible(false);
		t8.setBounds(765, 0, 411, 750);
		add(t8);
		
		t9 = new TLP9(this);
		t9.setVisible(false);
		t9.setBounds(765, 0, 411, 750);
		add(t9);
		//TODO 테이블 수정하기
		tableScrollPane.setBounds(25,25,711,711);
		GridLayout gridLayout=new GridLayout(3,3,18,18);
		tableScrollPane.setLayout(gridLayout);
		add(tableScrollPane);
		
		Table1 = new JButton("테이블1");
		Table1.setSize(225,225);
		Table1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table1;
				TableMainPanel.t1.setVisible(true);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table1);
		
		Table2 = new JButton("테이블2");
		Table2.setSize(225,225);
		Table2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table2;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(true);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table2);
		
		Table3 = new JButton("테이블3");
		Table3.setSize(225,225);
		Table3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table3;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(true);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table3);
		
		Table4 = new JButton("테이블4");
		Table4.setSize(225,225);
		Table4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table4;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(true);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table4);
		
		Table5 = new JButton("테이블5");
		Table5.setSize(225,225);
		Table5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table5;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(true);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table5);
		
		Table6 = new JButton("테이블6");
		Table6.setSize(225,225);
		Table6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table6;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(true);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table6);
		
		Table7 = new JButton("테이블7");
		Table7.setSize(225,225);
		Table7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table7;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(true);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table7);
		
		Table8 = new JButton("테이블8");
		Table8.setSize(225,225);
		Table8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table8;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(true);TableMainPanel.t9.setVisible(false);
			}
		});
		tableScrollPane.add(Table8);
		
		Table9 = new JButton("테이블9");
		Table9.setSize(225,225);
		Table9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedTable = Table9;
				TableMainPanel.t1.setVisible(false);TableMainPanel.t2.setVisible(false);TableMainPanel.t3.setVisible(false);
				TableMainPanel.t4.setVisible(false);TableMainPanel.t5.setVisible(false);TableMainPanel.t6.setVisible(false);
				TableMainPanel.t7.setVisible(false);TableMainPanel.t8.setVisible(false);TableMainPanel.t9.setVisible(true);
			}
		});



		tableScrollPane.add(Table9);


		//TODO 테이블 추가 제거 버튼 설정
		addTableButton=new JButton("테이블 추가");
		addTableButton.setBounds(16, 686, 175, 58);
		addTableButton.addActionListener(new tableAddAction());

		removeTableButton=new JButton("테이블 삭제");
		removeTableButton.setBounds(218, 686, 175, 58);
		removeTableButton.addActionListener(new tableDeleteButton());

	}
	class tableAddAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jButton=new JButton("테이블"+(tableNum+1));
			jButton.setSize(225,225);
			tableButtonList.add(jButton);
			tableScrollPane.add(jButton);
		}
	}
	class tableDeleteButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			tableScrollPane.remove(tableButtonList.get(tableButtonList.size()-1));
			tableNum-=1;
		}
	}

}
