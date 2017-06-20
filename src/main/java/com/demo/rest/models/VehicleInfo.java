package com.demo.rest.models;
/**
 * 
 * @author Padmaja Krishnakumar
 * @version 1.0
 * @since 20 June 2017
 */
public class VehicleInfo<E extends Location> {
	private Vehicle vehicle;
	private String type;//truck van semi
	private String status;//stand by,transit,service,repair
	private E location;//dc or branch
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public E getLocation() {
		return location;
	}
	public void setLocation(E destination) {
		this.location = destination;
	}
	
}
