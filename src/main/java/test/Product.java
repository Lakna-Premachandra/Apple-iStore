/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
 

package test;

public abstract class Product  {
    private String id;
    private String pname;
    private String productType;
    private int qty;
    private double price;
    double totalPrice;

    // Protected constructor for use in subclasses
    protected Product(String id, String pname,String productType, int qty, double price) {
        this.id = id;
        this.pname = pname;
        this.productType = productType;
        this.qty = qty;
        this.price = price;
        this.totalPrice = qty * price;
        
    }

     public static Product createMacBook(String id, String pname,int qty, double price) {
        return new MacBook(id, pname, "MacBook", qty, price);
    }

    public static Product createIPhone(String id, String pname,  int qty, double price) {
       return new IPhone(id, pname, "IPhone", qty, price);
    }
    
    public String getId() {
        return id;
    }

    public String getPname() {
        return pname;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    
    public String getProductType() {
        return productType;
    }


    // Method to calculate discount percentage 
    public abstract double calculateDiscountPercentage();
    
    // Method to calculate discount 
    public abstract double calculateDiscount();

    
}



