package by.htp.carparking.service.impl;

import by.htp.carparking.dao.OrderDao;
import by.htp.carparking.service.OrderService;
import by.htp.carparking.web.controller.util.AppContextManager;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao ;

	public OrderServiceImpl() {
		//orderDao = (OrderDao)AppContextManager.getAppcontext().getBean("orderDBase");
	}
	
	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void orderCar(int userId, int carId) {
		orderDao.insertNewOrder(userId, carId);
	}

}
