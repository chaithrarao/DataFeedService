/**
 * 
 */
package com.thomsonreuters.dfs.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.knappsack.swagger4springweb.controller.ApiDocumentationController;

/**
 * @author DEEPAK
 * 
 */
@Controller
@RequestMapping(value = "/documentation")
public class DocumentationController extends ApiDocumentationController {

	public static Logger logger = Logger
			.getLogger(DocumentationController.class.getName());

	public DocumentationController() {
		setBaseControllerPackage("com.thomsonreuters.dfs.controllers");
		setBaseModelPackage("com.thomsonreuters.dfs.model");
		setApiVersion("v1");

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView documentation() {
		/*
		 * User user = (User) SecurityContextHolder.getContext()
		 * .getAuthentication().getPrincipal();
		 */
		// logger.info(user.getUsername() + "Has accessed DFS API");
		// model.addAttribute("username", user.getUsername());
		return new ModelAndView("documentation");
	}
}
