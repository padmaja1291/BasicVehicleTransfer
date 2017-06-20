package com.demo.rest.models;
/**
 * 
 * @author Padmaja Krishnakumar
 * @version 1.0
 * @since 20 June 2017
 */
public class Vehicle {
	private String make;
	private String model;
	private int year;
	private String VIN;//24 AN, 8 al ending 5 numeric
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		 if(vIN.matches("^[a-zA-Z0-9]{19}[0-9]{5}$") &&
				 vIN.matches("/(.*[a-z]){8}/i")){
			 VIN = vIN;
		 }else{
			VIN = ""; 
		 }
	}
	
	
	
	
}
