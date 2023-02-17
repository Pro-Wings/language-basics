package com.prowings.aggregation;

public class Address {
	
	String city;
	String country;
	int pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
	
	

}
