package com.demo.rest.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.demo.rest.models.Location;
import com.demo.rest.models.VehicleInfo;
import com.demo.rest.models.VehicleTransfer;


import javax.ws.rs.core.UriInfo;

/**
 * This class handles  the rest api requests (transfer Operations)
 * @author Padmaja Krishnakumar
 * @version 1.0
 * @since 20 June 2017
 */
@Path("/transfer")
public class TransferController {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{vinfo}/{destination}")
	public <E extends Location> Response readUser(@PathParam("vin") VehicleInfo vinfo, @PathParam("destination") E destination) {
		VehicleInfo vehicleInfo = VehicleTransfer.instance.transfer(vinfo,destination);
		return Response.status(Status.OK).entity(vehicleInfo).type(MediaType.APPLICATION_JSON).build();
		
	}

	

}
