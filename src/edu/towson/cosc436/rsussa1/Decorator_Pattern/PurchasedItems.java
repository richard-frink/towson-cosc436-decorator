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
    
    public boolean hasItem(Item i){
    	int x = 0;
    	while(items[x] != null){
        	Item temp = items[x];
        	if((temp.getName()).equalsIgnoreCase(i.getName()) && (temp.getPrice()) == (i.getPrice())){
        		return true;
        	}
        	x++;
        }
    	return false;
    }
    
    public ItemsIterator getIterator(){
    	return new ItemsIterator();
    }
    
    public float getTotal(){
    	float runningT = 0;
    	int x = 0;
    	while(items[x] != null){
        	Item i = items[x];
        	runningT += i.getPrice();
        	x++;
        }
    	return runningT;
    }
}
