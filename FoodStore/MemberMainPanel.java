package FoodStore;

import javax.swing.JPanel;

public class MemberMainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberMainPanel() {
		setSize(1176, 750);
		MemberListPanel MLP = new MemberListPanel();
		MLP.setVisible(true);
		setLayout(null);
		MLP.setBounds(0, 0, 1176, 750);
		add(MLP);
	}

}
