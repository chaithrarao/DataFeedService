/**
 * 
 */
package com.thomsonreuters.dfs.security.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.thomsonreuters.dfs.security.dao.UserAuthenticationDao;
import com.thomsonreuters.dfs.security.domain.DFS_UserDetails;
import com.thomsonreuters.dfs.security.domain.UserAuthentication;
import com.thomsonreuters.dfs.security.service.AuthenticationService;

/**
 * @author UC167163
 *
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private UserAuthenticationDao userAuthenticationDao;

	private static Logger logger = Logger
			.getLogger(AuthenticationServiceImpl.class.getName());

	@Override
	public HttpStatus enableUser(DFS_UserDetails userDetails) {

		logger.info("|INFO|  enabling User " + userDetails.getDfsUserName()
				+ ". At " + new Date().toString());

		try {
			// userAuthenticationDao.enableUser(userDetails.getDfsUserName());
		} catch (Exception ex) {

			logger.error("|ERROR|  Error occurred while enabling the user "
					+ userDetails.getDfsUserName(), ex);
			return HttpStatus.BAD_REQUEST;

		}

		return HttpStatus.OK;
	}

	@Override
	public HttpStatus disableUser(DFS_UserDetails userDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAuthentication findOne(Integer id) {
		return userAuthenticationDao.findOne(id);

	}

	@Override
	public UserAuthentication findOneWithUserName(String userName) {
		List<UserAuthentication> userList = null;
		UserAuthentication authenticatedUser = null;
		try {
			// userList = userAuthenticationDao.findOneWithUserName(userName);
			if (userList != null) {
				/*for (UserAuthentication authentication : userList) {

					authenticatedUser = authentication;

				}*/
			}
		} catch (Exception ex) {

		}
		return authenticatedUser;
	}

}
