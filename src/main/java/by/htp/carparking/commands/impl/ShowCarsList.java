package by.htp.carparking.commands.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.service.CarService;
import by.htp.carparking.service.impl.CarServiceImpl;
import static by.htp.carparking.commands.util.ParametresPool.CARS_LIST;
import static by.htp.carparking.web.controller.util.JspPagesNames.*;

public class ShowCarsList implements BaseCommand{
	
	private CarService carService;
	
	public ShowCarsList() {
		carService = new CarServiceImpl();
	} 
	
	@Override
	public String doAction(HttpServletRequest request) {
		request.setAttribute(CARS_LIST, carService.getAllCars());
		System.out.println(carService.getAllCars());
		return CARS_LIST_PAGE;
	}

}
