/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stockarchive;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Akshay
 */
public class DAL {
    
    public DAL(){}
    
    public ArrayList<StockRow> getDBResponse(int page, String fromDT, String toDT){
        boolean flag = false;
        ResultSet resultSet = null;
        ArrayList<StockRow> stockRows = null;
        StockRow stockRow = null;
        
        if(fromDT.equals(""))
            fromDT = Global.getFromDT();
        if(toDT.equals(""))
            toDT = Global.getToDT();
        
        try(Connection conn = DriverManager.getConnection(Global.getDB_URL())){
            
            String query = "{ call SAS_GETBESTSTK (?,?,?)}";
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString("FROM_DT", fromDT);
            cstmt.setString("TO_DT", toDT);
            cstmt.setInt("PAGE_NUM", page);
            flag = cstmt.execute();
            if(flag == true){
                resultSet = cstmt.getResultSet();
                stockRows = new ArrayList<StockRow>();
                while(resultSet.next()){
                    stockRow = new StockRow(
                            resultSet.getString("COMPANY"),
                            resultSet.getDouble("MIN_IN_YEAR"),
                            resultSet.getDouble("MAX_IN_YEAR"),
                            resultSet.getDouble("DIFF")
                            );
                    stockRows.add(stockRow);
                }
            }
        }catch(Exception e){
            stockRows = null;
            //Log the Exception.
        }
        
        return stockRows;
    }
    
    public ArrayList<SymbolRow> getSymbolDBResponse(String ticker, String fromDT, String toDT, int page){
        boolean flag = false;
        ResultSet resultSet = null;
        ArrayList<SymbolRow> symbolRows = null;
        SymbolRow symbolRow = null;
        
        if(fromDT.equals(""))
            fromDT = Global.getFromDT();
        if(toDT.equals(""))
            toDT = Global.getToDT();
        
        try(Connection conn = DriverManager.getConnection(Global.getDB_URL())){
            
            String query = "{ call SAS_GETSYMBOLSTK (?,?,?,?)}";
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString("SYMBOL", ticker);
            cstmt.setString("FROM_DT", fromDT);
            cstmt.setString("TO_DT", toDT);
            cstmt.setInt("PAGE_NUM", page);
            flag = cstmt.execute();
            if(flag == true){
                resultSet = cstmt.getResultSet();
                symbolRows = new ArrayList<SymbolRow>();
                while(resultSet.next()){
                    symbolRow = new SymbolRow(
                            resultSet.getString("STK_DATE"),
                            resultSet.getDouble("OPEN"),
                            resultSet.getDouble("CLOSE"),
                            resultSet.getDouble("LOW"),
                            resultSet.getDouble("HIGH"),
                            resultSet.getDouble("VOLUME")                            
                            );
                    symbolRows.add(symbolRow);
                }
            }
        }catch(Exception e){
            symbolRows = null;
            //Log the Exception.
        }
        
        return symbolRows;
    }
}
