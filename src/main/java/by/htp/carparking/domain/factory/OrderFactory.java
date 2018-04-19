package by.htp.carparking.domain.factory;

import by.htp.carparking.domain.Order;

public class OrderFactory implements EntityFactory<Order> {

	@Override
	public Order createEntity() {
		return new Order();
	}

}
