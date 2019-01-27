/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Akshay
 */
public class SymbolDataResponse {
    
    @XmlElement
    private ArrayList<SymbolRow> symbolRows = null;
    
    public SymbolDataResponse(){}
    
    public SymbolDataResponse(ArrayList<SymbolRow> symbolRows){
        this.symbolRows = symbolRows;
    }
}
