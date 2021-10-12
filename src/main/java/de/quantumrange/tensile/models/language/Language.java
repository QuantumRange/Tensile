package de.quantumrange.tensile.models.language;

/**
 * All supported languages are in this enum.
 */
public enum Language {

	GERMAN("de"),
	ENGLISH("en");

	private final String code;

	Language(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
