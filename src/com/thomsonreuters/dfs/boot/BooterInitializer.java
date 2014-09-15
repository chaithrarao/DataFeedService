/**
 * 
 */
package com.thomsonreuters.dfs.boot;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author DEEPAK
 * 
 */
public class BooterInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { DispatcherServlet.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
