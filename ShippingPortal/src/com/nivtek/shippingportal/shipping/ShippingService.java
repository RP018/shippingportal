package com.nivtek.shippingportal.shipping;

import java.util.List;

public class ShippingService {

	public void processShipping(Customer customer) {

		Address shipAddress = customer.getAdrShip();
		ShippingDao shippingDao = new ShippingDao();
		shippingDao.printShippingDetails(shipAddress);

		if (shipAddress != null && shipAddress.getCity() != null && shipAddress.getCity().equals("Irving")) {

			System.out.println("Texas");
		}

	}

	public void printOrderDetails(Customer customer) {

		List<Order> orders = customer.getOrders();

		for (Order order : orders) {

			System.out.println(order.getOrderNumber());

			List<Product> products = order.getProducts();

			for (Product product : products) {

				System.out.println(product.getDescription());

			}

		}

	}

}
