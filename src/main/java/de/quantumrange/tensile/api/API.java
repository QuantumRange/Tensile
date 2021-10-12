package de.quantumrange.tensile.api;

import de.quantumrange.tensile.models.language.Word;

import java.util.regex.Pattern;

/*
 * TODO: Rename Class and more
 */
public class API {

	public static final Pattern FORM_PATTERN = Pattern.compile("<tbody><tr><th>(.+?)<\\/th><\\/tr><tr><td " +
			"class=\"tg-6k2t\">He\\/She\\/It\\s(.+?)\\s..+?<\\/tbody>");

	public static Word request(String neutral) {
		return null;
	}

}
