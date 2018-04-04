package by.htp.carparking.commands.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import static by.htp.carparking.web.controller.util.JspPagesNames.*;

public class DefaultCommand implements BaseCommand{

	@Override
	public String doAction(HttpServletRequest request) {
		return MAIN_PAGE;
	}

}
