package Main;

import java.awt.EventQueue;

import View.EditPatternGUI;

public class Main {
	/**
	 * Launch the application EditPatternGUI.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditPatternGUI window = new EditPatternGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
