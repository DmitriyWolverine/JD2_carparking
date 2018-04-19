package by.htp.carparking.commands.impl;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

import static by.htp.carparking.commands.util.ParametresPool.*;
import static by.htp.carparking.web.controller.util.JspPagesNames.*;

public class DeleteCar implements BaseCommand{

	private CarService carService;
	
	public DeleteCar(CarService carService) {
		this.carService = carService;
	} 
	
	@Override
	public String doAction(HttpServletRequest request) {
		Car car = new Car(Integer.parseInt(request.getParameter(CAR_ID) ));
		carService.deleteCar(car);
		request.setAttribute(CARS_LIST, carService.getAllCars());
		return CARS_LIST_PAGE;
	}

}
