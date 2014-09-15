/**
 * 
 */
package com.thomsonreuters.dfs.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomsonreuters.dfs.security.domain.UserAuthorization;

/**
 * @author UC167163
 *
 */
public interface UserAuthorizationDao extends
		JpaRepository<UserAuthorization, Integer> {

}
