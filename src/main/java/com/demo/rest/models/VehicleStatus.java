package com.demo.rest.models;
/**
 * 
 * @author Padmaja Krishnakumar
 * @version 1.0
 * @since 20 June 2017
 */
public class VehicleStatus {
	private static final String standBy = "stand-by";
	private static final String transit = "in transit";
	private static final String service = "in service";
	private static final String repair = "in repair";
	
	public static String getStandBy() {
		return standBy;
	}
	public static String getTransit() {
		return transit;
	}
	public static String getService() {
		return service;
	}
	public static String getRepair() {
		return repair;
	}
	
	
}
