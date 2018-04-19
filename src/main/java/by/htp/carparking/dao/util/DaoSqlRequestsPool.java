package by.htp.carparking.dao.util;

public class DaoSqlRequestsPool {
	private DaoSqlRequestsPool() {
		super();
	}
	
	public static final  String SQL_REQUEST_CREATE_NEW_CAR 	= "INSERT INTO cars (brand, model) VALUES(?, ?) ;";
	public static final String SQL_REQUEST_READ_CAR 		= "SELECT * FROM cars WHERE id=? ;";
	public static final String SQL_REQUEST_UPDATE_CAR 		= "UPDATE cars SET brand=?, model=? WHERE id=? ;";
	public static final String SQL_REQUEST_DELETE_CAR 		= "DELETE FROM cars WHERE id=? ;";
	public static final String SQL_REQUEST_GET_CARS 		= "SELECT * FROM cars ;";
	public static final String SQL_REQUEST_INSERT_NEW_ORDER	= "INSERT INTO orders (user_id, car_id) VALUES(?, ?) ;";
}
