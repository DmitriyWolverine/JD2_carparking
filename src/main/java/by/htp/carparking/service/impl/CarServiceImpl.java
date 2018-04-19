package by.htp.carparking.service.impl;

import java.util.List;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.factory.CarDaoFactory;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;
import by.htp.carparking.web.controller.util.AppContextManager;

public class CarServiceImpl implements CarService{
	private CarDao carDao;
	
	public CarServiceImpl(CarDao carDao) {
		this.carDao = carDao;
	}

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public void createCar(Car car) {
		carDao.create(car);
	}

	@Override
	public void updateCar(Car car) {
		carDao.update(car);
	}

	@Override
	public void deleteCar(Car car) {
		carDao.delete(car);
	}

	@Override
	public List<Car> getAllCars() {
		return carDao.readAll();
	}

}
