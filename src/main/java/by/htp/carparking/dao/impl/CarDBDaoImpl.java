package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.domain.Car;
import static by.htp.carparking.dao.util.DaoSqlRequestsPool.*;
import static by.htp.carparking.dao.util.DBDaoColumnNames.*;

public class CarDBDaoImpl implements CarDao{

	public CarDBDaoImpl() {
	}

	@Override
	public void create(Car entity) {
	
	}

	@Override
	public Car read(int id) {
		
		return null;
	}

	@Override
	public void update(Car entity) {
		
	}

	@Override
	public void delete(Car entity) {
	
	}

	@Override
	public List<Car> readAll() {
		Connection cn = DBConnectionHelper.connect();
		List<Car> carList = new ArrayList<>();
		try (Statement st = cn.createStatement() ;
				ResultSet carSet = st.executeQuery(SQL_REQUEST_GET_CARS)){
			while (carSet.next()) {
				addCarToList(carList, carSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnectionHelper.disconnect(cn);
		}
		return carList;
	}
	
	private void addCarToList(List<Car> carList, ResultSet carSet) {
		Car currentCar = createCar(carSet);
		carList.add(currentCar);
	}
	
	private Car createCar(ResultSet carSet) {
		Car currentCar = null;
		try {
			currentCar = new Car(carSet.getInt(CAR_ID_COLUMN) );
			currentCar.setModel(carSet.getString(CAR_MODEL_COLUMN));
			currentCar.setBrand(carSet.getString(CAR_BRAND_COLUMN));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return currentCar;
	}

}
