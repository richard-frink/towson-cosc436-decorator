package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

public class PurchasedItems {
    public Item[] items = new Item[100];
        
    public void addItem(Item i){
    	int x = 0;
        while(items[x] != null){
        	x++;
        }
        items[x] = i;
    }
    
    public void getIterator(){
    	
    }
    
    public float getTotal(){
    	float total = 0;
    	
    	return total;
    }
}
