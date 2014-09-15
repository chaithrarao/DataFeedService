/**
 * 
 */
package com.thomsonreuters.dfs.security.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomsonreuters.dfs.security.dao.UserAuthenticationDao;
import com.thomsonreuters.dfs.security.dao.UserAuthorizationDao;
import com.thomsonreuters.dfs.security.domain.UserAuthorization;
import com.thomsonreuters.dfs.security.service.AuthorizationService;

/**
 * @author UC167163
 *
 */
@Service
public class AuthorizationServiceImpl implements AuthorizationService {
	@Autowired
	private UserAuthenticationDao userAuthenticationDao;

	@Autowired
	private UserAuthorizationDao userAuthorizationDao;

	private static final Logger logger = Logger
			.getLogger(AuthorizationServiceImpl.class.getName());

	@Override
	public UserAuthorization authorize(UserAuthorization authorization) {

		UserAuthorization userAuthorization = null;

		try {
			userAuthorization = authorization;
			userAuthorization = userAuthorizationDao
					.saveAndFlush(userAuthorization);
		} catch (Exception ex) {
			logger.error("|ERROR|  ERROR WHILE AUTHORIZING USER : "
					+ userAuthorization.getUser_id().getDfsUserName(), ex);
		}

		return null;
	}

}
