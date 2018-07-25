package FoodStore;

import javax.swing.JPanel;
import java.io.Serializable;

public class MenuMainPanel extends JPanel implements Serializable{

	/**
	 * Create the panel.
	 */
	public MenuMainPanel() {
		setLayout(null);
			//setSize(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH,FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH);
		setSize(FirstSettingPanel.MAIN_DESCRIPTION_PANLE_WIDTH,FirstSettingPanel.MAIN_DESCRIPTION_PANLE_HEIGHT);
		MenuListPanel menuListPanel=new MenuListPanel();
		add(menuListPanel);
		MenuInformationPanel menuInformationPanel=new MenuInformationPanel();
		add(menuInformationPanel);
		setLayout(null);
	}

}
