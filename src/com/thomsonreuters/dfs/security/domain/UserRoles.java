/**
 * 
 */
package com.thomsonreuters.dfs.security.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author UC167163
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Entity(name = "USER_ROLES")
public enum UserRoles {

	/**
	 * Level 1: USER
	 */
	ROLE_USER("ROLE_USER", 1),
	/**
	 * Level 2: ADMIN
	 */
	ROLE_ADMIN("ROLE_ADMIN", 2),
	/**
	 * Level 3: MANAGER
	 */
	ROLE_MANAGER("ROLE_MANAGER", 3),
	/**
	 * Level 4: DEVELOPER. This role is for internal development purpose only.
	 */
	ROLE_DEVELOPER("ROLE_DEVELOPER", 4);

	@Column(name = "ROLES")
	private String displayName;

	@Id
	private int id;

	private UserRoles(final String displayName, final int id) {
		this.displayName = displayName;
		this.id = id;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return NodeType
	 */
	public String getName() {
		return this.name();
	}

}
