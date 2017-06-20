package com.demo.rest.models;


/**
 * 
 * @author Padmaja Krishnakumar
 * @version 1.0
 * @since 20 June 2017
 */
public enum VehicleTransfer {
	
	instance;

	public <E extends Location> VehicleInfo<E>  transfer(VehicleInfo<E> vehicleInfo, E destination){
		if(vehicleInfo.getStatus().equalsIgnoreCase(VehicleStatus.getStandBy()))
		{
			if(vehicleInfo.getType().equalsIgnoreCase(VehicleType.getSemi())){
				if(vehicleInfo.getLocation().getType().equalsIgnoreCase("Distribution Center") && 
						destination.getType().equalsIgnoreCase("Distribution Center")){
					vehicleInfo.setLocation(destination);
				}else
					System.out.println("Semi could be transferred only between Distribution Centres");
			}else{
				if(vehicleInfo.getLocation().getType().equalsIgnoreCase("Branch") && 
						destination.getType().equalsIgnoreCase("Branch")){
					vehicleInfo.setLocation(destination);
				}else
					System.out.println("Truck or van could be transferred only between branches");
			}
		}else
		{
			System.out.println("Vehicle cannot be transferred because status is not in stand-by");
		}
	
	return vehicleInfo;
	}

}
