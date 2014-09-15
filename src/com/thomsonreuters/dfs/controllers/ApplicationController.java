/**
 * 
 */
package com.thomsonreuters.dfs.controllers;

import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author UC167163
 * 
 */
@Controller
@RequestMapping(value = "/application")
public class ApplicationController {

	public static Logger logger = Logger.getLogger(ApplicationController.class
			.getName());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelMap model) {

		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		logger.info(user.getUsername()
				+ " Has Accessed the application Resources!");
		model.addAttribute("username", user.getUsername());
		return new ModelAndView("info", "model", model);

	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView application() {

		return new ModelAndView("home");

	}

}
