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
public class Symbol {
    
    private String ticker = "";
    private String fromDT = "";
    private String toDT = "";
    private int page = 0;
    
    public Symbol(){}
    
    public Symbol(String ticker, String fromDT, String toDT, int page){
        this.ticker = ticker;
        this.fromDT = fromDT;
        this.toDT = toDT;
        this.page = page;
    }
    public SymbolResponse getSymbolResponse(){
        
        ArrayList<SymbolRow> symbolRows = null;
        SymbolResponse symbolResponse = null;
        DAL dal = new DAL();
        symbolRows = dal.getSymbolDBResponse(this.ticker,this.fromDT, this.toDT, this.page);
        if(symbolRows != null)
             symbolResponse = new SymbolResponse(200,"OK",symbolRows);
        else
             symbolResponse = new SymbolResponse(500,"Error",symbolRows);
        return symbolResponse;
    }
}
