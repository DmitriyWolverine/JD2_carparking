package by.htp.carparking.dao.factory;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.impl.CarDaoDBImpl;

public class CarDaoFactory implements EntityDaoCreator<CarDao>{
	
	public CarDaoFactory() {
		super();
	}
	
	@Override
	public CarDao createDBDao() {
		return new CarDaoDBImpl();
	}

}
