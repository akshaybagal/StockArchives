/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

import java.util.ArrayList;

/**
 *
 * @author Akshay
 */
public class Stock {
    
    private  int page = 0;
    private String type = "";
    private String fromDT = "";
    private String toDT = "";
    
    public Stock(){}
    
    public Stock(String type, int page, String fromDT,String toDT){
        this.type = type.toLowerCase();
        this.page = page;
        this.fromDT = fromDT;
        this.toDT = toDT;
    }
    
    public StockResponse getResponse(){
     
        ArrayList<StockRow> stockRows = null; 
        StockResponse response = null;
        if(this.type.equals("bestperforming"))
            stockRows = getBestPerfStocks();
        
        if(stockRows != null)
            response = new StockResponse(200,"OK",stockRows);
        else
            response = new StockResponse(500,"Error",stockRows);
        
        return response;
    }
    
    public ArrayList<StockRow> getBestPerfStocks(){
        ArrayList<StockRow> stockRows = null;
        DAL dal = new DAL();
        stockRows = dal.getDBResponse(this.page,this.fromDT,this.toDT);
        return stockRows;
    }
}
