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
public class Global {
    
    private static String DB_URL = "jdbc:sqlserver://localhost;servername=DESKTOP-HFD38AQ\\SQLEXPRESS;databaseName=STOCK_ARCHIVE;integratedSecurity=true;";
    private static String fromDT = "2005-01-01";
    private static String toDT = "2016-12-31";
    
    public static String getDB_URL(){
        return DB_URL;
    }
    
    public static String getFromDT(){
        return fromDT;
    }
    
    public static String getToDT(){
        return toDT;
    }
}
