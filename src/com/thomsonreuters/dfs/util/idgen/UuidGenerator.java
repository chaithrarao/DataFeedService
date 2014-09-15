package com.thomsonreuters.dfs.util.idgen;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author DEEPAK
 * 
 */
public final class UuidGenerator {

	private static final char DEFAULT_PREFIX = 'M';
	private static final String INVALID_PREFIX_CHARACTER = "First character not valid for Uuid: ";
	private static final String VALID_PREFIX_CHARACTER = "[M|O|D|S]";

	private UuidGenerator() {
	}

	public static String generateId(final char prefixCharacter) {

		if (Character.toString(prefixCharacter).matches(VALID_PREFIX_CHARACTER)) {

			return prefixCharacter
					+ StringUtils.upperCase(StringUtils.remove(UUID
							.randomUUID().toString(), '-'));
		}

		else {
			throw new IllegalArgumentException(INVALID_PREFIX_CHARACTER
					+ prefixCharacter);
		}

	}

	public static String generateId() {
		return generateId(DEFAULT_PREFIX);
	}

}