package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class EditPatternGUI {

	private JFrame frame;
	private JTextField txtHereIsThe;
	private JTextField txtHereIsThe_1;

	/**
	 * Create the application.
	 */
	public EditPatternGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 654);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 60, 252, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblEditPattern = new JLabel("Edit Pattern");
		lblEditPattern.setBounds(10, 35, 75, 14);
		frame.getContentPane().add(lblEditPattern);
		
		JButton btnSetPattern = new JButton("Set Pattern");
		btnSetPattern.setBounds(266, 59, 89, 23);
		frame.getContentPane().add(btnSetPattern);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(85, 587, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(183, 587, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 91, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblContext = new JLabel("Context");
		lblContext.setBounds(10, 203, 46, 14);
		frame.getContentPane().add(lblContext);
		
		JLabel lblProblem = new JLabel("Problem");
		lblProblem.setBounds(10, 331, 56, 14);
		frame.getContentPane().add(lblProblem);
		
		JLabel lblConsequences = new JLabel("Consequences");
		lblConsequences.setBounds(10, 459, 85, 14);
		frame.getContentPane().add(lblConsequences);
		
		JLabel lblImageLink = new JLabel("Image Link");
		lblImageLink.setBounds(10, 147, 75, 14);
		frame.getContentPane().add(lblImageLink);
		
		txtHereIsThe = new JTextField();
		txtHereIsThe.setText("");
		txtHereIsThe.setBounds(10, 116, 133, 20);
		frame.getContentPane().add(txtHereIsThe);
		txtHereIsThe.setColumns(10);
		
		txtHereIsThe_1 = new JTextField();
		txtHereIsThe_1.setText("");
		txtHereIsThe_1.setBounds(10, 172, 133, 20);
		frame.getContentPane().add(txtHereIsThe_1);
		txtHereIsThe_1.setColumns(10);
		
		JTextPane txtpnHereIsThe = new JTextPane();
		txtpnHereIsThe.setText("");
		txtpnHereIsThe.setBounds(10, 228, 252, 92);
		frame.getContentPane().add(txtpnHereIsThe);
		
		JTextPane txtpnHereIsThe_1 = new JTextPane();
		txtpnHereIsThe_1.setText("");
		txtpnHereIsThe_1.setBounds(10, 356, 252, 92);
		frame.getContentPane().add(txtpnHereIsThe_1);
		
		JTextPane txtpnHereIsThe_2 = new JTextPane();
		txtpnHereIsThe_2.setText("");
		txtpnHereIsThe_2.setBounds(10, 484, 252, 92);
		frame.getContentPane().add(txtpnHereIsThe_2);
	}
}
