/**
 * 
 */
package com.thomsonreuters.dfs.security.service;

import com.thomsonreuters.dfs.security.domain.DFS_UserDetails;
import com.thomsonreuters.dfs.util.idgen.Uuid;

/**
 * @author UC167163
 *
 */
public interface UserDetailsService {

	DFS_UserDetails createNewUser(DFS_UserDetails userDetails);

	void deleteUser(DFS_UserDetails userDetails);

	DFS_UserDetails updateExistingUser(DFS_UserDetails userDetails);

	DFS_UserDetails findOne(Uuid uuid);

}
