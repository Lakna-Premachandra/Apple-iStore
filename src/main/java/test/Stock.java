/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author PC
 */
public class Stock {

    private String ItemCode;
    private String ItemName;
    private int UnitPrice;
    private String ItemType;
    private int AvailableStock;
    private int SoldQty;
    private String Description;
    
    public Stock(){
     
}
    public Stock(String ItemCode, String ItemName, int UnitPrice,String ItemType , int AvailableStock, int SoldQty, String Description) {
        this.ItemCode = ItemCode;
        this.ItemName = ItemName;
        this.UnitPrice = UnitPrice;
        this.ItemType= ItemType;
        this.AvailableStock = AvailableStock;
        this.SoldQty = SoldQty;
        this.Description = Description;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(int UnitPrice) {
        this.UnitPrice = UnitPrice;
    }
    
    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public int getAvailableStock() {
        return AvailableStock;
    }

    public void setAvailableStock(int AvailableStock) {
        this.AvailableStock = AvailableStock;
    }

    public int getSoldQty() {
        return SoldQty;
    }

    public void setSoldQty(int SoldQty) {
        this.SoldQty = SoldQty;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
         
}
