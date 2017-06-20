package com.demo.rest.models;
/**
 * 
 * @author Padmaja Krishnakumar
 * @version 1.0
 * @since 20 June 2017
 */
public abstract class Location {
	protected String type;

	public  String getType() {
		return type;
	}

	public abstract void setType();
}
