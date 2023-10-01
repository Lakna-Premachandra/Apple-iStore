/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author PC
 */


public class MacBook extends Product {
    public MacBook(String id, String pname, String productType, int qty, double price) {
        super(id, pname, productType, qty, price);
    }
    @Override
    public double calculateDiscountPercentage() {
        
        if (getTotalPrice() > 50000) {
            return 30.0;
        } else if (getTotalPrice() > 30000) {
            return 20.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public double calculateDiscount() {
        
        return getTotalPrice() * calculateDiscountPercentage() / 100.0;
    }
}







