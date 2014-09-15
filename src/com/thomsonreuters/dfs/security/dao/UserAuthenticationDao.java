/**
 * 
 */
package com.thomsonreuters.dfs.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomsonreuters.dfs.security.domain.UserAuthentication;

/**
 * @author UC167163
 *
 */
public interface UserAuthenticationDao extends
		JpaRepository<UserAuthentication, Integer> {

	/*@Query(value = "UPDATE USER_AUTHENTICATION SET ENABLED = 1 WHERE DFS_USRNAME = ?1", nativeQuery = true)
	public List<UserAuthentication> enableUser(String dfsUsrName);

	@Query(value = "SELECT * FROM USER_AUTHENTICATION WHERE DFS_USRNAME LIKE ?1", nativeQuery = true)
	public List<UserAuthentication> findOneWithUserName(String userName);*/
}
