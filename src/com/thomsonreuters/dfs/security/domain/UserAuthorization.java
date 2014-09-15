/**
 * 
 */
package com.thomsonreuters.dfs.security.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author UC167163
 *
 */
@Entity
@Table(name = "USER_AUTHORIZATION")
public class UserAuthorization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ROLE_ID", unique = true, nullable = false)
	private Integer user_role_id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "USR_ID")
	private UserAuthentication user_id;

	@Column(name = "ROLE")
	private UserRoles role;

	/**
	 * @return the user_id
	 */
	public UserAuthentication getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(UserAuthentication user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the role
	 */
	public UserRoles getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(UserRoles role) {
		this.role = role;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAuthorization [user_id=" + user_id + ", role=" + role + "]";
	}

	/**
	 * @param user_id
	 * @param role
	 */
	public UserAuthorization(UserAuthentication user_id, UserRoles role) {
		super();
		this.user_id = user_id;
		this.role = role;
	}

}
