package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class Coupon200get20Dec extends Decorator implements Applicable{
	public boolean applies(PurchasedItems items){
        if(items.getTotal() >= (float)200){
        	return true;
        }
        return false;
    }
    
    public void printReceipt(){
        System.out.print("\nYou spent over $200! Bring this receipt in as a coupon for 20% off your next purchase!");
    }
}
