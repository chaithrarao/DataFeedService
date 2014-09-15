/**
 * 
 */
package com.thomsonreuters.dfs.security.service;

import org.springframework.http.HttpStatus;

import com.thomsonreuters.dfs.security.domain.DFS_UserDetails;
import com.thomsonreuters.dfs.security.domain.UserAuthentication;

/**
 * @author UC167163
 *
 */
public interface AuthenticationService {

	HttpStatus enableUser(DFS_UserDetails userDetails);

	HttpStatus disableUser(DFS_UserDetails userDetails);

	UserAuthentication findOne(Integer id);

	UserAuthentication findOneWithUserName(String userName);

}
