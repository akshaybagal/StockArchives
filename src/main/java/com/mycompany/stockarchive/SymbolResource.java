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
@Path("symbol")
public class SymbolResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SymbolResource
     */
    public SymbolResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.stockarchive.SymbolResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SymbolResponse getJson(
                        @DefaultValue("") @QueryParam("ticker") String ticker,
                        @DefaultValue("") @QueryParam("fromDT") String  fromDT,
                        @DefaultValue("") @QueryParam("toDT") String toDT,
                        @DefaultValue("1") @QueryParam("page") int page){
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        Symbol symbol = new Symbol(ticker, fromDT, toDT, page);
        SymbolResponse symbolResponse = symbol.getSymbolResponse();
        return symbolResponse;
    }

    /**
     * PUT method for updating or creating an instance of SymbolResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
