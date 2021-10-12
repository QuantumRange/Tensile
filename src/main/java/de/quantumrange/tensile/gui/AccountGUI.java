package de.quantumrange.tensile.gui;

import javax.swing.*;

public class AccountGUI {

	public JPanel viewPanel;
	private JComboBox usernameBox;
	private JButton loginButton;
	private JButton createAccountButton;
	private JPasswordField passwordField;
	private JLabel passwordInfoLabel;

	public AccountGUI() {
		usernameBox.setModel(new DefaultComboBoxModel(new String[] {"test", "test1", "test2"}));
	}

}
