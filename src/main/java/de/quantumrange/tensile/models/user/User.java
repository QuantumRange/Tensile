package de.quantumrange.tensile.models.user;

import de.quantumrange.tensile.models.language.Language;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * The User saves all important data of an account.
 */
public class User implements Serializable {

	@Serial
	private static final long serialVersionUID = 6094256775576354757L;

	private final String name;
	/**
	 * The Password ist hashed with the normal java {@link String#hashCode()} function.
	 * <b>It's only for simple access protection, not for encryption.</b>
	 */
	private final int passwordHash;
	/**
	 * Base language is the language that the user knows.
	 */
	private final Language baseLanguage;
	/**
	 * Goal language is the language that the user try to learn.
	 */
	private final Language goalLanguage;

	public User(String name, int passwordHash, Language baseLanguage, Language goalLanguage) {
		this.name = name;
		this.passwordHash = passwordHash;
		this.baseLanguage = baseLanguage;
		this.goalLanguage = goalLanguage;
	}

	public String getName() {
		return name;
	}

	public int getPasswordHash() {
		return passwordHash;
	}

	public Language getBaseLanguage() {
		return baseLanguage;
	}

	public Language getGoalLanguage() {
		return goalLanguage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return getPasswordHash() == user.getPasswordHash() && Objects.equals(getName(), user.getName()) && getBaseLanguage() == user.getBaseLanguage() && getGoalLanguage() == user.getGoalLanguage();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getPasswordHash(), getBaseLanguage(), getGoalLanguage());
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", passwordHash=" + passwordHash +
				", baseLanguage=" + baseLanguage +
				", goalLanguage=" + goalLanguage +
				'}';
	}
}
