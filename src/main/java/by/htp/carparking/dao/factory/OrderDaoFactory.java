package by.htp.carparking.dao.factory;

import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.dao.impl.OrderDaoDBImpl;

public class OrderDaoFactory implements EntityDaoCreator<OrderDao> {

	public OrderDaoFactory() {
		super();
	}
	
	@Override
	public OrderDao createDBDao() {
		return new OrderDaoDBImpl();
	}

}
