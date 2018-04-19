package by.htp.carparking.web.controller.util;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import by.htp.carparking.web.controller.MainServlet;

public class AppContextManager {
	private static final XmlWebApplicationContext appContext = new XmlWebApplicationContext();
	
	private AppContextManager() {
	}
	
	public static void initAppContext(MainServlet servlet) {
		appContext.setConfigLocation("/WEB-INF/app-context.xml");
		appContext.setServletContext(servlet.getServletContext());
		appContext.refresh();
	}

	public static ApplicationContext getAppcontext() {
		
		return appContext;
	}
	
}
