package by.htp.carparking.dao.util;

public class DaoSqlRequestsPool {
	private DaoSqlRequestsPool() {};
	public final static String SQL_REQUEST_CREATE_NEW_CAR = "INSERT INTO cars ( brand, model) VALUES(?, ?) ";
	public final static String SQL_REQUEST_GET_CARS = "SELECT * FROM cars";
}
