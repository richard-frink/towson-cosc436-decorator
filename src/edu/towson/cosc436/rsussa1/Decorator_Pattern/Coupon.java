/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */
public class Coupon extends Decorator{
    public boolean applicable(PurchasedItems items){
        return true;
    }
    
    public void printReciept(){
        
    }
}
