package com.nivtek.shippingportal.shipping;

import java.util.List;

public class Customer {

	private String firstName;
	private String lastName;
	private String email;

	private Address adrBilling;
	private Address adrShip;
	private Address adrMail;

	private List<Order> orders;

	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the adrBilling
	 */
	public Address getAdrBilling() {
		return adrBilling;
	}

	/**
	 * @param adrBilling the adrBilling to set
	 */
	public void setAdrBilling(Address adrBilling) {
		this.adrBilling = adrBilling;
	}

	/**
	 * @return the adrShip
	 */
	public Address getAdrShip() {
		return adrShip;
	}

	/**
	 * @param adrShip the adrShip to set
	 */
	public void setAdrShip(Address adrShip) {
		this.adrShip = adrShip;
	}

	/**
	 * @return the adrMail
	 */
	public Address getAdrMail() {
		return adrMail;
	}

	/**
	 * @param adrMail the adrMail to set
	 */
	public void setAdrMail(Address adrMail) {
		this.adrMail = adrMail;
	}

}
