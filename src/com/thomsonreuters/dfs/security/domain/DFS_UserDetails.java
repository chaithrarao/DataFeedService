/**
 * 
 */
package com.thomsonreuters.dfs.security.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.thomsonreuters.dfs.util.idgen.Uuid;

/**
 * @author UC167163
 *
 */
@Entity(name = "DFS_USERDETAILS")
@Table(name = "DFS_USERDETAILS")
public class DFS_UserDetails {

	@Id
	@Column(name = "UUID", unique = true, nullable = false)
	@GeneratedValue(generator = "UuidIdentifierGenerator")
	@GenericGenerator(name = "UuidIdentifierGenerator", strategy = "com.thomsonreuters.dfs.util.idgen.UuidIdentifierGenerator", parameters = {})
	@Type(type = "com.thomsonreuters.dfs.util.idgen.UuidUserType")
	private Uuid uuid;

	@Column(name = "DFS_USERNAME")
	private String dfsUserName;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "M_INITIAL")
	private String m_initial;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "EMAIL_ID")
	private String email;

	@Column(name = "MOBILE")
	private String mobile;

	@Column(name = "OFFICE_PHONE")
	private String office_phone;

	@Column(name = "RESEDENTIAL_PHONE")
	private String resedential_phone;

	@Column(name = "DESIGNATION")
	private String designation;

	/**
	 * @return the dfsUserName
	 */
	public String getDfsUserName() {
		return dfsUserName;
	}

	/**
	 * @param dfsUserName
	 *            the dfsUserName to set
	 */
	public void setDfsUserName(String dfsUserName) {
		this.dfsUserName = dfsUserName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the m_initial
	 */
	public String getM_initial() {
		return m_initial;
	}

	/**
	 * @param m_initial
	 *            the m_initial to set
	 */
	public void setM_initial(String m_initial) {
		this.m_initial = m_initial;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the office_phone
	 */
	public String getOffice_phone() {
		return office_phone;
	}

	/**
	 * @param office_phone
	 *            the office_phone to set
	 */
	public void setOffice_phone(String office_phone) {
		this.office_phone = office_phone;
	}

	/**
	 * @return the resedential_phone
	 */
	public String getResedential_phone() {
		return resedential_phone;
	}

	/**
	 * @param resedential_phone
	 *            the resedential_phone to set
	 */
	public void setResedential_phone(String resedential_phone) {
		this.resedential_phone = resedential_phone;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Default constructor.
	 */
	public DFS_UserDetails() {

	}

	/**
	 * @param userName
	 * @param firstName
	 * @param lastName
	 * @param initial
	 * @param address
	 * @param email
	 * @param mobile
	 * @param office_phone
	 * @param resedential_phone
	 * @param designation
	 */
	public DFS_UserDetails(String dfsUserName, String firstName,
			String lastName, String m_initial, String address, String email,
			String mobile, String office_phone, String resedential_phone,
			String designation) {
		super();
		this.dfsUserName = dfsUserName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.m_initial = m_initial;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.office_phone = office_phone;
		this.resedential_phone = resedential_phone;
		this.designation = designation;
	}

	/**
	 * @param userName
	 * @param firstName
	 * @param lastName
	 */
	public DFS_UserDetails(String dfsUserName, String firstName, String lastName) {
		super();
		this.dfsUserName = dfsUserName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @param userName
	 * @param firstName
	 * @param lastName
	 * @param initial
	 * @param email
	 * @param mobile
	 * @param office_phone
	 * @param designation
	 */
	public DFS_UserDetails(String dfsUserName, String firstName,
			String lastName, String m_initial, String email, String mobile,
			String office_phone, String designation) {
		super();
		this.dfsUserName = dfsUserName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.m_initial = m_initial;
		this.email = email;
		this.mobile = mobile;
		this.office_phone = office_phone;
		this.designation = designation;
	}

	/**
	 * @param userName
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param mobile
	 * @param office_phone
	 * @param designation
	 */
	public DFS_UserDetails(String dfsUserName, String firstName,
			String lastName, String email, String mobile, String office_phone,
			String designation) {
		super();
		this.dfsUserName = dfsUserName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.office_phone = office_phone;
		this.designation = designation;
	}

	/**
	 * @param userName
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param mobile
	 */
	public DFS_UserDetails(String dfsUserName, String firstName,
			String lastName, String email, String mobile) {
		super();
		this.dfsUserName = dfsUserName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DFS_UserDetails other = (DFS_UserDetails) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
