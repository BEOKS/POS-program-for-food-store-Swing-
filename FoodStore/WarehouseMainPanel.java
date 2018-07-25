package FoodStore;

import javax.swing.JPanel;
import java.awt.*;

public class WarehouseMainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public static WarehouseInformationPanel warehouseInformationPanel=new WarehouseInformationPanel();
	public static WarehouseListPanel warehouseListPanel=new WarehouseListPanel(warehouseInformationPanel);
	public WarehouseMainPanel() {
		setLayout(null);
		setSize(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH,FirstSettingPanel.MAIN_DESCRIPTION_PANLE_HEIGHT);
		warehouseInformationPanel.setVisible(true);
		warehouseInformationPanel.setBounds(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH/2,0,FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH/2,FirstSettingPanel.MAIN_DESCRIPTION_PANLE_HEIGHT);
		add(warehouseInformationPanel);
		add(warehouseListPanel);
		setVisible(true);
	}

	public static WarehouseInformationPanel getWarehouseInformationPanel() {
		return warehouseInformationPanel;
	}

	public static void setWarehouseInformationPanel(WarehouseInformationPanel warehouseInformationPanel) {
		WarehouseMainPanel.warehouseInformationPanel = warehouseInformationPanel;
	}

	public static WarehouseListPanel getWarehouseListPanel() {
		return warehouseListPanel;
	}

	public static void setWarehouseListPanel(WarehouseListPanel warehouseListPanel) {
		WarehouseMainPanel.warehouseListPanel = warehouseListPanel;
	}

	public void setVisible1(boolean bool){
		warehouseInformationPanel.setVisible1(bool);
		warehouseListPanel.setVisible1(bool);
	}
}
