package by.htp.carparking.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.commands.CommandManager;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainServlet() {
    	System.out.println("Hello from MainServlet");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doPost");
		String command = request.getParameter("action");
		BaseCommand currentCommand = CommandManager.getManager().defineServerAction(command);
		try {
			String actionResult = currentCommand.doAction(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher(actionResult);
			dispatcher.forward(request, response);
		}
		catch(ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
