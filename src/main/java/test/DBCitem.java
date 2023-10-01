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
public class DBCitem {
    
    private static final String FILEPATH ="C:\\Apple Store\\Item.txt";
    //final keyword; Anyone can't change this filepath
    
    FileWriter file = null;
    BufferedWriter files = null;
    
    public void additem (Item item) throws IOException 
    {
        try{
        PrintWriter out = null;
        String itemData =item.getItemCode()+","+ item.getItemName()+","+item.getItemPrice()+","+item.getItemType();
       
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
        out.println(itemData);
        
        out.close();
            JOptionPane.showMessageDialog(null, "Product added successfully");
        
        } catch (IOException ex){
        Logger.getLogger(DBCitem.class.getName()).log(Level.SEVERE,null,ex);
        } 
    }
    
    public Item findproduct(String itemCode) throws IOException
    {   
        Item item = null;
        FileInputStream fileinputstream = null;
        try {
           
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine;
            
            while((readLine = bufferedReader.readLine())!=null){
            String[]  detailsitem = readLine.split(",");
              if(itemCode.equals(detailsitem[0]))
            {
                item = new Item();
                item.setItemCode(detailsitem[0]);
                item.setItemName(detailsitem[1]);
                item.setItemPrice(Integer.parseInt(detailsitem[2]));
                item.setItemType(detailsitem[3]);
                
            }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBCitem.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return item;
    }
}




//    public List<Item> filterItemsByType(String itemType) throws IOException {
//        List<Item> filteredItems = new ArrayList<>();
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(FILEPATH);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
//            String readLine;
//            while ((readLine = bufferedReader.readLine()) != null) {
//                String[] detailsitem = readLine.split(",");
//                if (itemType.equals(detailsitem[3])) {
//                    Item item = new Item();
//                    item.setItemCode(detailsitem[0]);
//                    item.setItemName(detailsitem[1]);
//                    //item.setItemPrice(Double.parseDouble(detailsitem[2]));
//                    item.setItemPrice(Integer.parseInt(detailsitem[2]));
//                    item.setItemType(detailsitem[3]);
//                    filteredItems.add(item);
//                }
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DBCitem.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (fileInputStream != null) {
//                fileInputStream.close();
//            }
//        }
//        return filteredItems;
//    }
    

    

