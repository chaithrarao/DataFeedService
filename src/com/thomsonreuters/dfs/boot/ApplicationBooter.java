/**
 * 
 */
package com.thomsonreuters.dfs.boot;

import java.util.Arrays;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.apache.log4j.Logger;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author DEEPAK
 * 
 */
public class ApplicationBooter implements WebApplicationInitializer {

	String[] contexts = new String[] {
			"classpath:appContext/swaggerContext.xml",
			"classpath:appContext/rootContext.xml" };

	public static Logger logger = Logger.getLogger(ApplicationBooter.class
			.getName());

	@Override
	public void onStartup(ServletContext container) {

		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
		logger.info("\n|INFO|  -----------> loading context for the application");
		logger.info("\n|INFO|  -----------> " + Arrays.toString(contexts));
		appContext.setConfigLocations(contexts);
		logger.info("\n|INFO|  -----------> contexts successfully loaded.");
		ServletRegistration.Dynamic registration = container.addServlet(
				"applicationDispatcher", new DispatcherServlet(appContext));
		registration.setLoadOnStartup(1);
		registration.addMapping("/");

	}
}
