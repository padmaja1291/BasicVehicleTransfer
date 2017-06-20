package com.demo.rest.models;

import java.util.List;
/**
 * 
 * @author Padmaja Krishnakumar
 * @version 1.0
 * @since 20 June 2017
 */
public class DistributionCenter extends Location{
	private List<Branch> branches;
	private List<Vehicle> vehicles;
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	@Override
	public void setType() {
		this.type = "Distribution Center";
	}
	
	
	
	

}
