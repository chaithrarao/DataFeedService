/**
 * 
 */
package com.thomsonreuters.dfs.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomsonreuters.dfs.security.domain.DFS_UserDetails;
import com.thomsonreuters.dfs.util.idgen.Uuid;

/**
 * @author UC167163
 *
 */
public interface UserDetailsDao extends JpaRepository<DFS_UserDetails, Uuid> {
	
	
		

}
