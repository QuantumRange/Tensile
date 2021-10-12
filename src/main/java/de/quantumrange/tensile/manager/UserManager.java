package de.quantumrange.tensile.manager;

import de.quantumrange.tensile.models.user.User;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class UserManager {

	/**
	 * The path where all the user data, etc. is stored.
	 */
	private final File path;
	/**
	 * All entry's in this list are sorted by their id.
	 */
	private final List<User> users;

	public UserManager(File path) {
		this.path = path;
		this.users = new LinkedList<>();

		if (!this.path.exists() && !this.path.mkdirs()) {
			throw new IllegalStateException("Folder " + path + " not exist.");
		}

		loadUsers();
	}

	private void loadUsers() {
		// TODO:
	}

	public List<User> getUsers() {
		return users;
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	public User getUserByID(int id) {
		return users.get(id);
	}
}
