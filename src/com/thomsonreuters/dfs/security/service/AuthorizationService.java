/**
 * 
 */
package com.thomsonreuters.dfs.security.service;

import com.thomsonreuters.dfs.security.domain.UserAuthorization;

/**
 * @author UC167163
 *
 */
public interface AuthorizationService {

	UserAuthorization authorize(final UserAuthorization authorization);

}
