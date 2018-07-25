package FoodStore;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

public class MenuInformationPanel extends JPanel implements Serializable{
	public static JTextField nameTextField;
	public static JTextField priceTextField;
	public static JTextField produceTextField;
	public static JTable table;

	/**
	 * Create the panel.
	 */
	public MenuInformationPanel() {
		setBounds((int)(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH*(1.0/3)),0,
				(int)(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH*(2.0/3)),FirstSettingPanel.MAIN_DESCRIPTION_PANLE_HEIGHT);
		setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		nameTextField.setBounds(208, 50, 142, 26);
		add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(129, 50, 156, 26);
		add(lblNewLabel);
		
		JLabel label = new JLabel("가격");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label.setBounds(129, 133, 156, 26);
		add(label);
		
		priceTextField = new JTextField();
		priceTextField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		priceTextField.setColumns(10);
		priceTextField.setBounds(208, 133, 142, 26);
		add(priceTextField);
		
		JLabel label_1 = new JLabel("생산단가");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_1.setBounds(434, 133, 156, 26);
		add(label_1);
		
		produceTextField = new JTextField();
		produceTextField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		produceTextField.setColumns(10);
		produceTextField.setBounds(513, 133, 142, 26);
		add(produceTextField);
		
		JLabel label_2 = new JLabel("사용된 재료");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_2.setBounds(333, 200, 156, 26);
		add(label_2);

		//TODO 테이블 세팅
		String[] colNames={"재료","가격"};
		DefaultTableModel defaultTableModel=new DefaultTableModel(colNames,100);
		table=new JTable(defaultTableModel);
		table.setFont(new Font("a",Font.PLAIN,20));
		table.setRowHeight(30);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(129, 249, 529, 395);
		add(scrollPane);


		
		JButton checkButton = new JButton("편집");
		checkButton.setBounds(416, 670, 117, 61);
		checkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO 메뉴 리스트 테이블 모델 이름 변경, 메뉴 배열 데이터 변경
				int row=MenuListPanel.foodListTable.getSelectedRow();
				((DefaultTableModel)MenuListPanel.foodListTable.getModel()).setValueAt(nameTextField.getText(),row,0);

				Menu menu=MenuListPanel.menuArrayList.get(row);

				menu.name=nameTextField.getText();
				menu.price=Integer.parseInt(priceTextField.getText());
				menu.producePrice=Integer.parseInt(produceTextField.getText());

				String[] nameList=new String[100];
				int[] priceList=new int[100];
				int count=0;
				while(table.getValueAt(count,0)!=null){
					nameList[count]=table.getValueAt(count,0).toString();
					priceList[count]=Integer.parseInt(table.getValueAt(count,1).toString());
					count++;
				}

				menu.ingredientName=nameList;
				menu.ingredientPrice=priceList;
			}
		});
		add(checkButton);
		
		JButton deleteButton = new JButton("삭제");
		deleteButton.setBounds(541, 670, 117, 61);
		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO 리스트 테이블에서 삭제, 메뉴 리스트에서 삭제, 정보 창들 초기화
				int selectedRow=MenuListPanel.row;
				nameTextField.setText(null);
				priceTextField.setText(null);
				produceTextField.setText(null);

				MenuListPanel.foodListTable.setRowSelectionAllowed(false);
				((DefaultTableModel)MenuListPanel.foodListTable.getModel()).removeRow(selectedRow);
				MenuListPanel.foodListTable.setRowSelectionAllowed(true);


//				String[] colNames1={"재료","가격"};
//				DefaultTableModel newModel=new DefaultTableModel(colNames1,0);
//				MenuListPanel.menuArrayList.remove(selectedRow);
//				table.setModel(newModel);
				table.removeAll();
			}
		});
		add(deleteButton);
	}
}
