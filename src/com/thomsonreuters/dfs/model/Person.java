/**
 * 
 */
package com.thomsonreuters.dfs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import com.thomsonreuters.dfs.util.idgen.Uuid;

/**
 * @author UC167163
 *
 */
@Entity
@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name = "UUID", unique = true, nullable = false)
	@GeneratedValue(generator = "UuidIdentifierGenerator")
	@GenericGenerator(name = "UuidIdentifierGenerator", strategy = "com.thomsonreuters.dfs.util.idgen.UuidIdentifierGenerator", parameters = {})
	@Type(type = "com.thomsonreuters.dfs.util.idgen.UuidUserType")
	private Uuid uuid;

	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name="INSERT_DATE")
	@DateTimeFormat(pattern = "DD-MM-YYYY")
	protected Date insertDate;
	
	@Column(name="DELETE_DATE")
	@DateTimeFormat(pattern = "DD-MM-YYYY")
	protected Date deleteDate;

}
