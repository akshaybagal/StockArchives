/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Akshay
 */
@XmlRootElement
public class SymbolResponse {
    
    @XmlElement
    SymbolMetaResponse meta = null;
    
    @XmlElement
    SymbolDataResponse data = null;
    
    public SymbolResponse(){}
    
    public SymbolResponse(int code, String status, ArrayList<SymbolRow> symbolRows){
        meta = new SymbolMetaResponse(code,status);
        data = new SymbolDataResponse(symbolRows);
    }
}
