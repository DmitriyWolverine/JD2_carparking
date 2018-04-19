package by.htp.carparking.commands.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.service.OrderService;

import static by.htp.carparking.commands.util.ParametresPool.*;
import static by.htp.carparking.web.controller.util.JspPagesNames.*;

public class ReturnCar implements BaseCommand{

	private OrderService orderService;
	
	
	public ReturnCar(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@Override
	public String doAction(HttpServletRequest request) {
		
		return null;
	}

}
