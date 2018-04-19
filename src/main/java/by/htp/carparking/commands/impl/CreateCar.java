package by.htp.carparking.commands.impl;

import static by.htp.carparking.commands.util.ParametresPool.*;
import static by.htp.carparking.web.controller.util.JspPagesNames.*;

import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.commands.BaseCommand;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

public class CreateCar implements BaseCommand{
	
	private CarService carService;
	
	public CreateCar(CarService carService) {
		this.carService = carService;
	} 
	
	@Override
	public String doAction(HttpServletRequest request) {
		String brand = request.getParameter(CAR_BRAND);
		String model = request.getParameter(CAR_MODEL);
		Car car = new Car(1,brand,model);
		carService.createCar(car);
		request.setAttribute(CARS_LIST, carService.getAllCars());
		return CARS_LIST_PAGE;
	}

}
