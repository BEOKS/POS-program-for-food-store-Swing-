package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddWarehouseFrame extends JFrame implements Serializable{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField sellerNameTextField;
	private JTextField sellerAddressTextField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AddWarehouseFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel nameLabel = new JLabel("추가할 이름");
		nameLabel.setBounds(24, 43, 61, 16);
		contentPane.add(nameLabel);

		JLabel lblNewLabel_1 = new JLabel("초기 재고");
		lblNewLabel_1.setBounds(24, 95, 61, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("가격");
		lblNewLabel_2.setBounds(24, 148, 61, 16);
		contentPane.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(97, 38, 121, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(97, 90, 121, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(97, 143, 117, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);



		JButton closeButton = new JButton("취소");
		closeButton.setBounds(302, 210, 117, 29);
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(closeButton);

		JLabel label = new JLabel("판매처");
		label.setBounds(235, 43, 61, 16);
		contentPane.add(label);

		sellerNameTextField = new JTextField();
		sellerNameTextField.setColumns(10);
		sellerNameTextField.setBounds(308, 38, 121, 26);
		contentPane.add(sellerNameTextField);

		JLabel label_1 = new JLabel("연락처");
		label_1.setBounds(235, 95, 61, 16);
		contentPane.add(label_1);

		sellerAddressTextField = new JTextField();
		sellerAddressTextField.setColumns(10);
		sellerAddressTextField.setBounds(308, 90, 121, 26);
		contentPane.add(sellerAddressTextField);

		JButton addButton = new JButton("추가");
		addButton.setBounds(174, 210, 117, 29);
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO 비어있지 않으면 추가
				int d=0;
				if(isEmpty(textField)||isEmpty(textField_1)||isEmpty(textField_2)){
					WarningMessage warningMessage=new WarningMessage("모든 칸을 설정한 후 추가해주세요");
					warningMessage.setVisible(true);
				}
				else{
					WarehouseListPanel.rowNum++;
					Object[] list=new Object[4];
					list[0]=textField.getText();
					list[1]=Integer.parseInt(textField_1.getText());
					list[2]=0;
					list[3]=textField_2.getText();
					DefaultTableModel defaultTableModel=(DefaultTableModel)WarehouseListPanel.table.getModel();
					defaultTableModel.addRow(list);
					WarehouseInformationPanel.sellerNameList.add(sellerNameTextField.getText());
					WarehouseInformationPanel.sellerAddressList.add(sellerAddressTextField.getText());
					dispose();
				}

			}
		});
		contentPane.add(addButton);

		setVisible(true);
	}

	public boolean isEmpty(JTextField jTextField){
		return jTextField==null?true:false;
	}
}
