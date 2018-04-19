package by.htp.carparking.service.factory;

import by.htp.carparking.service.OrderService;
import by.htp.carparking.service.impl.OrderServiceImpl;

public class OrderServiceFactory implements ServiceCreator<OrderService>{

	@Override
	public OrderService serviceCreator() {
		return new OrderServiceImpl();
	}

}
