package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

public class PurchasedItems {
    public static Item[] items = new Item[100];
        
    public void addItem(Item i){
    	int x = 0;
        while(items[x] != null){
        	x++;
        }
        items[x] = i;
    }
    
    public ItemsIterator getIterator(){
    	return new ItemsIterator();
    }
    
    public float getTotal(){
    	float runningT = 0;
    	for(Item i : items){
    		runningT += i.getPrice();
    	}
    	return runningT;
    }
}
