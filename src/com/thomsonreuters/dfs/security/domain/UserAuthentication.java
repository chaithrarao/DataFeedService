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
@Table(name = "USER_AUTHENTICATION")
public class UserAuthentication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer user_id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_UUID")
	private DFS_UserDetails dfsUserName;

	@Column(name = "PASSWORD")
	protected String password;

	@Column(name = "ENABLED")
	private boolean enabled;

	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the dfs_userName
	 */
	public DFS_UserDetails getDfsUserName() {
		return dfsUserName;
	}

	/**
	 * @param dfs_userName
	 *            the dfs_userName to set
	 */
	public void setDfsUserName(DFS_UserDetails dfsUserName) {
		this.dfsUserName = dfsUserName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled
	 *            the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @param userName
	 * @param password
	 * @param enabled
	 */
	public UserAuthentication(DFS_UserDetails dfsUserName, String password,
			boolean enabled) {
		super();
		this.dfsUserName = dfsUserName;
		this.password = password;
		this.enabled = enabled;
	}

}
