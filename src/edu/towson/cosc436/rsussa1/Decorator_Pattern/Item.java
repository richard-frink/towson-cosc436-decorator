package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

public class Item {
    private String name;
    private float price;
    
    public Item(String name, float price){
    	this.name = name;
    	this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }
    
    public String toString(){
    	return getName().toUpperCase() + "				$" + getPrice();
    }
}
