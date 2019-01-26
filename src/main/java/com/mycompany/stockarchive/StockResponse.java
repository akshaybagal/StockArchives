/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author Akshay
 */

@XmlRootElement
public class StockResponse {
    
    @XmlElement
    private StockMetaResponse meta = null;
    
    @XmlElement
    private StockDataResponse data = null;
    
    public StockResponse(){}
    
    public StockResponse(int code, String status, ArrayList<StockRow> stockRows){
        meta = new StockMetaResponse(code,status);
        data = new StockDataResponse(stockRows);
    }
}
