/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

/**
 *
 * @author Akshay
 */
public class SymbolRow {
    
    public String stockDate = "";
    public double open = 0.0;
    public double close = 0.0;
    public double low = 0.0;
    public double high = 0.0;
    public double volume = 0.0;
    
    public SymbolRow(){}
    
    public SymbolRow(String stockDate, double open, double close, double low, double high, double volume){
            this.stockDate = stockDate;
            this.open = open;
            this.close = close;
            this.low = low;
            this.high = high;
            this.volume = volume;
    }
    
}
