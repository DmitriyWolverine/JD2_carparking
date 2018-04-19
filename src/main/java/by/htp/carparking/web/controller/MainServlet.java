package by.htp.carparking.web.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import by.htp.carparking.commands.ActionCommandContext;
import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.commands.CommandManager;
import by.htp.carparking.web.controller.util.AppContextManager;

import static by.htp.carparking.web.controller.util.ServletConstants.*;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainServlet() {
    	System.out.println("Hello from MainServlet");
    	
    }
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = request.getServletContext();
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		
		String action = request.getParameter(SERVLET_COMMAND);
		
		BaseCommand baseCommand = ActionCommandContext.getAction(action, webApplicationContext);
		try {
			String actionResult = baseCommand.doAction(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher(actionResult);
			dispatcher.forward(request, response);
		}
		catch(ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
    @Override
	public void init() throws ServletException {
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doGet");
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doPost");
		processRequest(request, response);
		
	}

}
