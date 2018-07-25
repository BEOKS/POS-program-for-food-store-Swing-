package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AddNewMenuFrame extends JFrame implements Serializable{

	private JPanel contentPane;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton checkButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		AddNewMenuFrame addNewMenuFrame=new AddNewMenuFrame();
		addNewMenuFrame.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public static DefaultTableModel model;
	public static JTextField nameTextField;
	public static JTextField priceTextField;
	private JTable table;
	public AddNewMenuFrame() {
		setTitle("AddNewMenuFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(42, 30, 61, 16);
		contentPane.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(75, 25, 130, 26);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel priceLabel = new JLabel("가격");
		priceLabel.setBounds(234, 30, 61, 16);
		contentPane.add(priceLabel);
		
		priceTextField = new JTextField();
		priceTextField.setBounds(275, 25, 130, 26);
		contentPane.add(priceTextField);
		priceTextField.setColumns(10);
		
		label = new JLabel("");
		label.setBounds(181, 89, 61, 16);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("사용된 재료");
		lblNewLabel.setBounds(194, 72, 61, 16);
		contentPane.add(lblNewLabel);

		//TODO 테이블 세팅
		String[] colName={"이름","가격"};
		model=new DefaultTableModel(colName,40);
		table = new JTable(model);
		table.setBounds(0, 0, 366, 332);
		JScrollPane jScrollPane=new JScrollPane(table);
		jScrollPane.setBounds(39, 89, 366, 332);
		contentPane.add(jScrollPane);
		
		checkButton = new JButton("확인");
		checkButton.setBounds(178, 431, 117, 29);
		checkButton.addActionListener(new ActionListener() {
			//TODO 확인 버튼을 누를 경우 테이블 모델의 데이터를 가져와서 넣음
			@Override
			public void actionPerformed(ActionEvent e) {

				Menu menu=new Menu();
				menu.name=nameTextField.getText();
				menu.price=Integer.parseInt(priceTextField.getText());
				int producePrice=0;
				int row=0;
				String[] ingredientNames=new String[100];
				int[] ingredientPrice=new int[100];
				while(table.getModel().getValueAt(row,0)!=null){
					ingredientNames[row]=table.getModel().getValueAt(row,0).toString();
					ingredientPrice[row]=Integer.parseInt(table.getModel().getValueAt(row,1).toString());
					producePrice+=ingredientPrice[row];
					row++;
				}
				menu.ingredientName=ingredientNames;
				menu.ingredientPrice=ingredientPrice;
				menu.producePrice=producePrice;

				MenuListPanel.menuArrayList.add(menu);
				// TODO : 테이블에 메뉴 추가
				String[] list=new String[1];
				list[0]=MenuListPanel.menuArrayList.get(MenuListPanel.menuArrayList.size()-1).name;
				((DefaultTableModel)MenuListPanel.foodListTable.getModel()).addRow(list);
				dispose();
				int d=0;
			}
		});
		contentPane.add(checkButton);
		
		cancelButton = new JButton("취소");
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setBounds(293, 431, 117, 29);
		contentPane.add(cancelButton);
		
	
		
	}
}
