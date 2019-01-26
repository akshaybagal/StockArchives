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
public class StockRow {
    
    public String ticker = "";
    public double difference = 0.0;
    public double minInYear = 0.0;
    public double maxInYear = 0.0;
    
    public StockRow(){}
    
    public StockRow(String company,double min, double max, double diff){
        this.ticker = company;
        this.minInYear = min;
        this.maxInYear = max;
        this.difference = diff;
    }
    
}
