package by.htp.carparking.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class DBConnectionHelper {
	
	private static final String DB_CONFIG = "db_config";

	private DBConnectionHelper() {
		super();
	}

	public static Connection connect() {

		Connection connection = null;

		try {
			ResourceBundle rb = ResourceBundle.getBundle(DB_CONFIG);
			String url = rb.getString("db.url");
			String login = rb.getString("db.login");
			String pass = rb.getString("db.pass");
			Class.forName(rb.getString("db.driver"));
			connection = DriverManager.getConnection(url, login, pass);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return connection;
	}

	public static void disconnect(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
