package by.htp.carparking.domain.factory;

import by.htp.carparking.domain.Car;

public class CarFactory implements EntityFactory<Car>{

	@Override
	public Car createEntity() {
		return new Car();
	}

}
