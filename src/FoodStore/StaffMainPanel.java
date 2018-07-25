package FoodStore;

import javax.swing.JPanel;

public class StaffMainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public StaffMainPanel() {
		setSize(1176, 750);
		setLayout(null);
		StaffListPanel SLP = new StaffListPanel();
		SLP.setVisible(true);
		SLP.setBounds(0, 0, 1176, 750);
		add(SLP);
	}

}
