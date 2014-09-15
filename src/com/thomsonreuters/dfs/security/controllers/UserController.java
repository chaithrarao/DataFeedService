/**
 * 
 */
package com.thomsonreuters.dfs.security.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thomsonreuters.dfs.security.domain.DFS_UserDetails;
import com.thomsonreuters.dfs.security.domain.UserAuthentication;
import com.thomsonreuters.dfs.security.domain.UserAuthorization;
import com.thomsonreuters.dfs.security.domain.UserRoles;
import com.thomsonreuters.dfs.security.service.AuthenticationService;
import com.thomsonreuters.dfs.security.service.AuthorizationService;
import com.thomsonreuters.dfs.security.service.UserDetailsService;
import com.thomsonreuters.dfs.util.idgen.Uuid;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * @author UC167163
 *
 */

@Controller
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	public UserDetailsService userDetailsService;

	@Autowired
	public AuthenticationService authenticationService;

	@Autowired
	public AuthorizationService authorizationService;

	public static Logger logger = Logger.getLogger(UserController.class
			.getName());

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<DFS_UserDetails> addNewUser(
			@RequestBody final DFS_UserDetails userDetails) {

		DFS_UserDetails newUserDetails = null;

		try {

			newUserDetails = userDetailsService.createNewUser(userDetails);

		} catch (DataIntegrityViolationException ex) {
			logger.debug("|DEBUG|  User already exists", ex);

			return new ResponseEntity<DFS_UserDetails>(newUserDetails,
					HttpStatus.OK);
		}

		return new ResponseEntity<DFS_UserDetails>(newUserDetails,
				HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{uuid}/enabled/{enabled}", method = RequestMethod.PUT)
	public ResponseEntity<UserAuthentication> toggleUser(
			@ApiParam(value = "User UUID", required = true) @RequestParam(value = "uuid", required = true) final Uuid uuid,
			@ApiParam(value = "enabled", required = true) @RequestParam(value = "enabled", required = true) final boolean enabled) {

		DFS_UserDetails userDetails = null;
		UserAuthentication authentication = null;
		UserAuthorization authorization = null;

		try {
			userDetails = userDetailsService.findOne(uuid);
			authentication = authenticationService
					.findOneWithUserName(userDetails.getDfsUserName());
			authorization = new UserAuthorization(authentication,
					UserRoles.ROLE_USER);
			HttpStatus status = HttpStatus.OK;
			if (enabled == true) {

				authentication.setEnabled(true);
				try {
					status = authenticationService.enableUser(userDetails);
				} catch (Exception ex) {

					logger.error("|ERROR|  COULD NOT ENABLE USER "
							+ userDetails.getDfsUserName(), ex);

				}
				if (status == HttpStatus.OK)
					authorizationService.authorize(authorization);

			} else {

				System.out.println("DISABLED USER CANNOT BE AUTHORIZED");

			}

		} catch (Exception ex) {

		}

		return null;
	}
}
