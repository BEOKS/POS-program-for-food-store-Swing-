package FoodStore;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

public class MenuListPanel extends JPanel implements Serializable{
	public static JTable foodListTable;

	/**
	 * Create the panel.
	 */
	public static ArrayList<Menu> menuArrayList=menuArrayList=new ArrayList<Menu>();
	public static int row;
	public MenuListPanel() {
		setSize((int)(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH*(1.0/3)),FirstSettingPanel.MAIN_DESCRIPTION_PANLE_HEIGHT);
		setLayout(null);

		String[] colNames={"음식"};
		DefaultTableModel defaultTableModel=new DefaultTableModel(colNames,0);
		foodListTable = new JTable(defaultTableModel);
		foodListTable.setBounds(0, 0, 380, 648);

		foodListTable.setFont(new Font("Serif", Font.BOLD, 20));
		foodListTable.setRowHeight(30);
		JScrollPane jScrollPane=new JScrollPane(foodListTable);
		jScrollPane.setBounds(6, 6, 380, 648);
		add(jScrollPane);

		JButton addMenuListButton = new JButton("추가");
		addMenuListButton.setBounds(282, 669, 104, 75);
		addMenuListButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddNewMenuFrame addNewMenuFrame=new AddNewMenuFrame();
				addNewMenuFrame.setVisible(true);

			}
		});
		add(addMenuListButton);

		//TODO : 테이블이 선택되었을 떄 메뉴 정보 패널 설정
		foodListTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				//TODO 정보 패널 이름, 가격, 생산단가 변경
				row=foodListTable.getSelectedRow();
				System.out.println(row);
				MenuInformationPanel.nameTextField.setText(menuArrayList.get(row).name);
				MenuInformationPanel.priceTextField.setText(String.valueOf(menuArrayList.get(row).price));
				MenuInformationPanel.produceTextField.setText(String.valueOf(menuArrayList.get(row).producePrice));

				//TODO 사용된 재료 테이블 모델 변경
				String[] colNames1={"재료","가격"};
				DefaultTableModel newModel=new DefaultTableModel(colNames1,100);

				int count=0;
				while(menuArrayList.get(row).ingredientName[count]!=null){
					Object[] objects=new Object[2];
					objects[0]=menuArrayList.get(row).ingredientName[count];
					objects[1]=menuArrayList.get(row).ingredientPrice[count];
					newModel.setValueAt(objects[0],count,0);
					newModel.setValueAt(objects[0],count,1);
					count++;
				}

				MenuInformationPanel.table.setModel(newModel);

			}
		});
	}
}
class Menu implements Serializable{
	public String name;
	public int price;
	public int producePrice;
	public String[] ingredientName;
	public int[] ingredientPrice;
}