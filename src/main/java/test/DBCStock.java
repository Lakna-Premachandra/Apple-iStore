/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DBCStock {
        //private static final 
                String FILEPATH ="C:\\Apple Store\\Stock.txt";
    
    FileWriter file = null;
    BufferedWriter files = null;
    
    public void addstock (Stock stock) throws IOException 
    {
        try{
        PrintWriter out = null;
        String stockData =stock.getItemCode()+","+stock.getItemName()+","+stock.getUnitPrice()+"," +
                stock.getItemType()+ "," +stock.getAvailableStock()+","+stock.getSoldQty()+","+stock.getDescription();
       
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
        out.println(stockData);
        
        out.close();
            JOptionPane.showMessageDialog(null, "Stock added successfully");
        
        } catch (IOException ex){
        Logger.getLogger(DBCStock.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    public Stock findstock(String itemCode) throws IOException
    {   Stock stock = null;
        FileInputStream fileinputstream = null;
        try {
           
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine;
            
            while((readLine = bufferedReader.readLine())!=null){
            String[]  detailstock = readLine.split(",");
              if(itemCode.equals(detailstock[0]))
            {
                stock = new Stock();
                stock.setItemCode(detailstock[0]);
                stock.setItemName(detailstock[1]);
                stock.setUnitPrice(Integer.parseInt(detailstock[2]));
                stock.setItemType(detailstock[3]);
                stock.setAvailableStock(Integer.parseInt(detailstock[4]));
                stock.setSoldQty(Integer.parseInt(detailstock[5]));
                stock.setDescription(detailstock[6]);   
            }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBCStock.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return stock;  
    }
}
