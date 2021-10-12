package de.quantumrange.tensile.main;

import de.quantumrange.tensile.gui.AccountGUI;
import de.quantumrange.tensile.manager.UserManager;
import net.harawata.appdirs.AppDirs;
import net.harawata.appdirs.AppDirsFactory;

import javax.swing.*;
import java.io.File;

public class Main {

	private static final AppDirs APP_DIRS = AppDirsFactory.getInstance();

	private static final String C_APP_NAME = "Tensile",
			                   C_AUTHOR = "de.quantumrange",
	                           C_VERSION = "v1.0.0";

	public static final File USER_DATA_DIR		= new File(APP_DIRS.getUserDataDir(C_APP_NAME, C_VERSION, C_AUTHOR));
	public static final File USER_CONFIG_DIR	= new File(APP_DIRS.getUserConfigDir(C_APP_NAME, C_VERSION, C_AUTHOR));
	public static final File USER_CACHE_DIR		= new File(APP_DIRS.getUserCacheDir(C_APP_NAME, C_VERSION, C_AUTHOR));

	public static final UserManager USER_MANAGER = new UserManager(new File(USER_DATA_DIR, ""));

	public static void main(String[] args) {
		JFrame frame = new JFrame("AccountGUI");
		frame.setContentPane(new AccountGUI().viewPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
