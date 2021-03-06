package by.htp.carparking.commands.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.service.CarService;

import static by.htp.carparking.commands.util.ParametresPool.CARS_LIST;
import static by.htp.carparking.web.controller.util.JspPagesNames.*;

public class ShowCarsList implements BaseCommand{
	
	private CarService carService;

	public ShowCarsList(CarService carService) {
		super();
		this.carService = carService;
	}

	public void setCarService(CarService carService) {
		this.carService = carService;
	}
	
	@Override
	public String doAction(HttpServletRequest request) {
		request.setAttribute(CARS_LIST, carService.getAllCars());
		return CARS_LIST_PAGE;
	}

}
