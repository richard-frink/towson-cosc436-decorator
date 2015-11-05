package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class Coupon100get10Dec extends Decorator implements Applicable{
    public void create(int total){
    	//if total is >= 100 then take the total and print the new total at a 10% discount
    }
	
	public boolean applies(PurchasedItems items){
        return true;
    }
    
    public void printReceipt(){
        
    }
}
