package by.htp.carparking.dao.impl;

import static by.htp.carparking.dao.util.DaoSqlRequestsPool.SQL_REQUEST_INSERT_NEW_ORDER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.domain.Order;

public class OrderDaoDBImpl implements OrderDao{
	
	private static final Logger logger = LogManager.getLogger();
	
	public OrderDaoDBImpl() {
		super();
	}

	@Override
	public void create(Order entity) {
	
	}

	@Override
	public Order read(int id) {
		
		return null;
	}

	@Override
	public void update(Order entity) {
	
	}

	@Override
	public void delete(Order entity) {
	
	}
	

	@Override
	public List readAll() {
		return null;
	}

	@Override
	public void insertNewOrder(int userId, int carId) {
		Connection cn = DBConnectionHelper.connect();
		try (PreparedStatement ps = cn.prepareStatement(SQL_REQUEST_INSERT_NEW_ORDER)) {
			ps.setInt(1, userId );
			ps.setInt(2, carId );
			ps.executeUpdate();
			logger.info("The order was added");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnectionHelper.disconnect(cn);
		}
	}



}
