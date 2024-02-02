package com.practice.reference;

public class Address {
	private String district;
	private String state;
	private String country;
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String district, String state, String country) {
		super();
		this.district = district;
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [district=" + district + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
