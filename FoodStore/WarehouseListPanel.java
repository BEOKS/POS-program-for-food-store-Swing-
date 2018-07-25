package FoodStore;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WarehouseListPanel extends JPanel {
	public static JTable table;
	public static Object[] newRow=new Object[4];
	public JButton addButton;
	public JButton deleteButton;

	public static int rowNum=0;

	/**
	 * Create the panel.
	 */
	public WarehouseListPanel(WarehouseInformationPanel warehouseInformationPanel) {
		setSize(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH/2,FirstSettingPanel.MAIN_DESCRIPTION_PANLE_HEIGHT);
		setLayout(null);


		//TODO : 테이블 초기 세팅

		String[] colName={"이름","재고","주문","가격"};
		DefaultTableModel defaultTableModel=new DefaultTableModel(colName,0);
		table = new JTable(defaultTableModel);
		JScrollPane tableScrollPanel = new JScrollPane(table);
		tableScrollPanel.setBounds(6, 6, 576, 637);
		add(tableScrollPanel);

		//TODO : 버튼 세팅
		
		addButton = new JButton("추가");
		addButton.setBounds(304, 664, 133, 53);
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO: 추가 할 창을 실행시키고 데이터를 입력
				AddWarehouseFrame addWarehouseFrame=new AddWarehouseFrame();
				addWarehouseFrame.setVisible(true);
			}
		});
		add(addButton);
		
		deleteButton = new JButton("삭제");
		deleteButton.setBounds(449, 664, 133, 53);
		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO: 선택된 데이블을 삭제
				int row=table.getSelectedRow();
				if(row==-1){
					return ;
				}
				else{
					DefaultTableModel model=(DefaultTableModel)table.getModel();
					model.removeRow(row);
				}
			}
		});
		add(deleteButton);

		//TODO: 테이블이 선택되었을때 세부정보 표시장 변경
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if (table.getSelectedRow() > -1) {
					// print first column value from selected row
					System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
					//TODO : 세부정보 창 변경
					int row=table.getSelectedRow();
					warehouseInformationPanel.nameTextField.setText(table.getValueAt(row,0).toString());
					warehouseInformationPanel.priceTextField.setText(table.getValueAt(row,3).toString());
					warehouseInformationPanel.sellingPlaceTextField.setText(WarehouseInformationPanel.sellerNameList.get(row));
					warehouseInformationPanel.addressTextField.setText(WarehouseInformationPanel.sellerAddressList.get(row));
					warehouseInformationPanel.numberTextField.setText(table.getValueAt(row,1).toString());
					warehouseInformationPanel.orderSizeTextField.setText(table.getValueAt(row,2).toString());
				}
			}
		});
		setVisible(true);
	}
	public void setVisible1(boolean b){
		table.setVisible(b);
		addButton.setVisible(b);
		deleteButton.setVisible(b);
	}

}
