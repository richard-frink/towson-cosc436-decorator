package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class Coupon100get10Dec extends Decorator implements Applicable{
	public boolean applies(PurchasedItems items){
		if(items.getTotal() >= (float)200){
        	return false;
        }
		else if(items.getTotal() >= (float)100){
        	return false;
        }
        return false;
    }
    
    public void printReceipt(){
        System.out.print("\n\nYou spent over $100!\nBring this receipt in as a coupon for 10% off your next purchase!\n");
    }
}
