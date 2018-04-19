package by.htp.carparking.commands.impl;

import static by.htp.carparking.commands.util.ParametresPool.CAR_ID;
import static by.htp.carparking.web.controller.util.JspPagesNames.BOOK_CAR_PAGE;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.commands.util.IdSaver;

public class GoToBookCarPage implements BaseCommand{

	public GoToBookCarPage() {
		super();
	} 
	
	@Override
	public String doAction(HttpServletRequest request) {
		IdSaver.setId(Integer.parseInt(request.getParameter(CAR_ID)));
		return BOOK_CAR_PAGE;
	}
	
}