/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Akshay
 */
@Path("stock")
public class StockResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StockResource
     */
    public StockResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.stockarchive.StockResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public StockResponse getJson(
                        @DefaultValue("bestperforming") @QueryParam("type") String type,
                        @DefaultValue("1") @QueryParam("page") int page,
                        @DefaultValue("") @QueryParam("fromDT") String fromDT,
                        @DefaultValue("") @QueryParam("toDT") String toDT ){
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        Stock stock = new Stock(type, page, fromDT, toDT);
        StockResponse response = stock.getResponse();
        return response;
    }

    /**
     * PUT method for updating or creating an instance of StockResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        
    }
}
