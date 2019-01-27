/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Akshay
 */
public class SymbolMetaResponse {
    
    @XmlElement
    private int code = 0;
    
    @XmlElement
    private String status = "";
    
    public SymbolMetaResponse(){}
    
    public SymbolMetaResponse(int code, String status){
        this.code = code;
        this.status = status;
    }
}
