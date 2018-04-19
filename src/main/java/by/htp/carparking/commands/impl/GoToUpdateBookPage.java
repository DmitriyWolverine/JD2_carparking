package by.htp.carparking.commands.impl;

import static by.htp.carparking.commands.util.ParametresPool.*;
import static by.htp.carparking.web.controller.util.JspPagesNames.*;

import javax.servlet.http.HttpServletRequest;
import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.commands.util.IdSaver;


public class GoToUpdateBookPage implements BaseCommand{

	public GoToUpdateBookPage() {
		super();
	} 
	
	@Override
	public String doAction(HttpServletRequest request) {
		IdSaver.setId(Integer.parseInt(request.getParameter(CAR_ID)));
		return UPDATE_CAR_PAGE;
	}
	
}
