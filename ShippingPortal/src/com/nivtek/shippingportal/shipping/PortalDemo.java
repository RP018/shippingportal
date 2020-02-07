/**
 * 
 */
package com.nivtek.shippingportal.shipping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bootcamp Java
 *
 */
public class PortalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		  Customer customer = new Customer();
		  
		  Address adrship = new Address();
		  
		  adrship.setCity("Irving");
		  
		  customer.setAdrShip(adrship);
		  
		  ShippingService shippingService = new ShippingService();
		  
		  shippingService.processShipping(customer);*/
		
		
				
		Customer customer = new Customer();
		
		customer.setFirstName("Haocheng"); 
		customer.setLastName("Lin");
		
		Order order = new Order();
		order.setOrderNumber("1");
		
		Product product = new Product();
		product.setDescription("Mouse");
		
		List<Product> productList = new ArrayList<Product>(); 
		productList.add(product);
		order.setProducts(productList);
		
		List<Order> orderList = new ArrayList<Order>();
		
		
		Order order2 = new Order();
		order2.setOrderNumber("2");
		
		Product product2 = new Product();
		product2.setDescription("Duster");
		
		List<Product> productList2 = new ArrayList<Product>(); 
		productList2.add(product2);
		order2.setProducts(productList2);
		
		orderList.add(order);
		orderList.add(order2);
		
		customer.setOrders(orderList);
		
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		
		ShippingService shippingService = new ShippingService();
		shippingService.printOrderDetails(customer);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
