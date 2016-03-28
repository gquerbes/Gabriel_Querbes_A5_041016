/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it308.gmu.edu.model;

/**
 *
 * @author gabrielquerbes
 */
public class Order {
    private String productDescription;
    private int quantity;
    private double orderTotal;

    public Order(String productDescription, int quantity, double orderTotal) {
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.orderTotal = orderTotal;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
    
    
    
}
