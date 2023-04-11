package com.prowings.practice.immutable;

public class Address {

	private int pin;
	private String country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String country) {
		super();
		this.pin = pin;
		this.country = country;
	}
	
	
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", country=" + country + "]";
	}
	
	
}
