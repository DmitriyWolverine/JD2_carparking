package by.htp.carparking.commands.impl;

import static by.htp.carparking.commands.util.ParametresPool.*;
import static by.htp.carparking.web.controller.util.JspPagesNames.CARS_LIST_PAGE;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.commands.util.IdSaver;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

public class UpdateCar implements BaseCommand{
	
	private CarService carService;

	public UpdateCar(CarService carService) {
		super();
		this.carService = carService;
	}

	@Override
	public String doAction(HttpServletRequest request) {
		Car car = new Car(IdSaver.getId());
		car.setBrand(request.getParameter(CAR_BRAND));
		car.setModel(request.getParameter(CAR_MODEL));
		carService.updateCar(car);
		request.setAttribute(CARS_LIST, carService.getAllCars());
		return CARS_LIST_PAGE;
	}

}
