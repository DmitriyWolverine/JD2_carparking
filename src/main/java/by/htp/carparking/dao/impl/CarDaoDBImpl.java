package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class CarDaoDBImpl implements CarDao{

	public CarDaoDBImpl() {
		super();
	}

	@Override
	public void create(Car entity) {
		Connection cn = DBConnectionHelper.connect();
		try (PreparedStatement ps = cn.prepareStatement(SQL_REQUEST_CREATE_NEW_CAR)) {
			ps.setString(1, entity.getBrand() );
			ps.setString(2, entity.getModel() );
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnectionHelper.disconnect(cn);
		}
	}

	@Override
	public Car read(int id) {
		Car car = null;
		Connection cn = DBConnectionHelper.connect();
		try (PreparedStatement ps = cn.prepareStatement(SQL_REQUEST_CREATE_NEW_CAR);
				ResultSet carSet  = ps.executeQuery()) {
			ps.setInt(1, id );
			while(carSet.next()) {
				car = new Car(id);
				car.setBrand(carSet.getString("brand"));
				car.setModel(carSet.getString("model"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnectionHelper.disconnect(cn);
		}
		return car;
	}

	@Override
	public void update(Car entity) {
		Connection cn = DBConnectionHelper.connect();
		try( PreparedStatement statement = cn.prepareStatement(SQL_REQUEST_UPDATE_CAR)) {
			statement.setString(1, entity.getBrand());
			statement.setString(2, entity.getModel());
			statement.setInt(3, entity.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnectionHelper.disconnect(cn);
		}
	}

	@Override
	public void delete(Car entity) {
		Connection cn = DBConnectionHelper.connect();
		try( PreparedStatement statement = cn.prepareStatement(SQL_REQUEST_DELETE_CAR)) {
			statement.setInt(1, entity.getId());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnectionHelper.disconnect(cn);
		}
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
