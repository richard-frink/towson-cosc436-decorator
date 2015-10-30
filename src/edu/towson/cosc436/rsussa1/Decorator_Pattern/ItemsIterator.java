package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Iterator;

public class ItemsIterator implements Iterator{
	private int current = 0;
	
	public boolean hasNext(){
		if(PurchasedItems.items[current + 1] == null){
			return false;
		}
		else return true;
	}
	
	public Item getItem(){
		return PurchasedItems.items[current];
	}
	
	public void next(){
		current++;
	}
}
