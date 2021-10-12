package de.quantumrange.tensile.gui;

import javax.swing.*;

public class AccountGUI {

	private JPanel viewPanel;
	private JComboBox usernameBox;
	private JButton loginButton;
	private JButton createAccountButton;
	private JPasswordField passwordField;
	private JLabel passwordInfoLabel;

	public AccountGUI() {
		usernameBox.setModel(new DefaultComboBoxModel(new String[] {"test", "test1", "test2"}));
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("AccountGUI");
		frame.setContentPane(new AccountGUI().viewPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
