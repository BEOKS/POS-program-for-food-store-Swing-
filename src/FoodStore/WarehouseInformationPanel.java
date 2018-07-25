package FoodStore;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class WarehouseInformationPanel extends JPanel {
	public JTextField nameTextField;
	public JTextField priceTextField;
	public JTextField sellingPlaceTextField;
	public JTextField numberTextField;
	public JTextField addressTextField;
	public JTextField orderSizeTextField;
	public JLabel nameLabel;
	public JLabel pricelabel;
	public JLabel sellingPlaceLabe;
	public JLabel countLabel;
	public JLabel addressLabel;
	public JLabel orderSizeLabel;
	public JButton orderButton;
	public JButton orderCancelButton;

	public static ArrayList<String> sellerNameList=new ArrayList<String>();
	public static ArrayList<String> sellerAddressList=new ArrayList<String>();
	public static int[] orderNum=new int[100];
	/**
	 * Create the panel.
	 */
	public WarehouseInformationPanel() {
		setLayout(null);
		setSize(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH/2,FirstSettingPanel.MAIN_DESCRIPTION_PANLE_HEIGHT);
		
		nameLabel = new JLabel("이름");
		nameLabel.setBounds(196, 140, 53, 40);
		add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(241, 147, 130, 26);
		add(nameTextField);
		nameTextField.setColumns(10);
		
		priceTextField = new JTextField();
		priceTextField.setColumns(10);
		priceTextField.setBounds(241, 210, 130, 26);
		add(priceTextField);
		
		pricelabel = new JLabel("가격");
		pricelabel.setBounds(196, 203, 53, 40);
		add(pricelabel);
		
		sellingPlaceTextField = new JTextField();
		sellingPlaceTextField.setColumns(10);
		sellingPlaceTextField.setBounds(108, 300, 130, 26);
		add(sellingPlaceTextField);
		
		sellingPlaceLabe = new JLabel("판매처");
		sellingPlaceLabe.setBounds(63, 293, 53, 40);
		add(sellingPlaceLabe);
		
		numberTextField = new JTextField();
		numberTextField.setColumns(10);
		numberTextField.setBounds(108, 379, 130, 26);
		add(numberTextField);
		
		countLabel = new JLabel("수량");
		countLabel.setBounds(63, 372, 53, 40);
		add(countLabel);
		
		addressTextField = new JTextField();
		addressTextField.setColumns(10);
		addressTextField.setBounds(376, 300, 130, 26);
		add(addressTextField);
		
		addressLabel = new JLabel("연락처");
		addressLabel.setBounds(331, 293, 53, 40);
		add(addressLabel);
		
		orderSizeTextField = new JTextField();
		orderSizeTextField.setColumns(10);
		orderSizeTextField.setBounds(376, 379, 130, 26);
		add(orderSizeTextField);
		
		orderSizeLabel = new JLabel("주문량");
		orderSizeLabel.setBounds(331, 372, 53, 40);
		add(orderSizeLabel);
		
		orderButton = new JButton("주문");
		orderButton.setBounds(255, 508, 117, 29);
		orderButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WarehouseOrderFrame warehouseOrderFramea=new WarehouseOrderFrame();
				warehouseOrderFramea.setVisible(true);
			}
		});
		add(orderButton);
		
		orderCancelButton = new JButton("취소");
		orderCancelButton.setBounds(402, 508, 117, 29);
		orderCancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WarehousCancelJFrame warehousCancelJFram=new WarehousCancelJFrame();
				warehousCancelJFram.setVisible(true);
			}
		});
		add(orderCancelButton);
		setVisible(true);
	}
	public void setVisible1(boolean b){
		nameTextField.setVisible(b);
		priceTextField.setVisible(b);
		sellingPlaceTextField.setVisible(b);
		numberTextField.setVisible(b);
		addressTextField.setVisible(b);
		orderSizeTextField.setVisible(b);

		nameLabel.setVisible(b);
		pricelabel.setVisible(b);
		sellingPlaceLabe.setVisible(b);
		countLabel.setVisible(b);
		addressLabel.setVisible(b);
		orderSizeLabel.setVisible(b);

		orderButton.setVisible(b);
		orderCancelButton.setVisible(b);
	}
}
