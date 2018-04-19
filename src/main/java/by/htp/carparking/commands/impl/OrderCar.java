package by.htp.carparking.commands.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.service.OrderService;

import static by.htp.carparking.web.controller.util.JspPagesNames.*;
import static by.htp.carparking.commands.util.ParametresPool.*;
import static by.htp.carparking.commands.util.HttpRequestParamValidator.*;
import static by.htp.carparking.commands.util.HttpRequestParamFormater.*;
import static by.htp.carparking.commands.util.Message.*;

public class OrderCar implements BaseCommand{
	
	private OrderService orderService;
	
	public OrderCar(OrderService orderService) { 
		this.orderService = orderService;
	} 
	
	@Override
	public String doAction(HttpServletRequest request) {
		String carId = request.getParameter(CAR_ID);
		String userId = request.getParameter(USER_ID);
		validateRequestParamNotNull(carId, userId);
		orderService.orderCar(formateFromStringToInt(userId), formateFromStringToInt(carId));
		
		request.setAttribute(ORDER_RESULT_MSG, CAR_ORDERED_SUCCESSFULLY);
		return MAIN_PAGE;
	}

}
