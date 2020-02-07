package com.nivtek.shippingportal.shipping;

public class ShippingDao {
	
	public void printShippingDetails(Address address) {
		
		String city = address.getCity();
		
		System.out.println(city);
	}
	

}
