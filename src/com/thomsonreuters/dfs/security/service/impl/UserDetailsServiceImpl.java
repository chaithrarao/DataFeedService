/**
 * 
 */
package com.thomsonreuters.dfs.security.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thomsonreuters.dfs.security.dao.UserAuthenticationDao;
import com.thomsonreuters.dfs.security.dao.UserDetailsDao;
import com.thomsonreuters.dfs.security.domain.DFS_UserDetails;
import com.thomsonreuters.dfs.security.domain.UserAuthentication;
import com.thomsonreuters.dfs.security.service.UserDetailsService;
import com.thomsonreuters.dfs.util.idgen.Uuid;

/**
 * @author UC167163
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsDao userDetailsDao;

	@Autowired
	private UserAuthenticationDao userAuthenticationDao;

	public static final Logger logger = Logger
			.getLogger(UserDetailsServiceImpl.class.getName());

	@Override
	@Transactional(rollbackFor = Exception.class)
	public DFS_UserDetails createNewUser(DFS_UserDetails userDetails) {
		logger.debug("|INFO| Trying to create new user "
				+ userDetails.getDfsUserName() + ".");
		DFS_UserDetails user = userDetails;
		try {

			user = userDetailsDao.saveAndFlush(user);

			UserAuthentication userAuthentication = new UserAuthentication(
					user, user.getDfsUserName(), false);
			userAuthentication = userAuthenticationDao
					.saveAndFlush(userAuthentication);
		} catch (Exception ex) {
			logger.error(
					"|ERROR|  Error occurred while creating the user. Find the error details below.",
					ex);

		}

		return user;
	}

	@Override
	public void deleteUser(DFS_UserDetails userDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public DFS_UserDetails updateExistingUser(DFS_UserDetails userDetails) {

		return userDetailsDao.saveAndFlush(userDetails);
	}

	@Override
	public DFS_UserDetails findOne(Uuid uuid) {

		return userDetailsDao.findOne(uuid);
	}

}
