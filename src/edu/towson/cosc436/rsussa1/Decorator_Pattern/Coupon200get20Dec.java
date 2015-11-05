package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
*
* @author rsussa1
*/

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class Coupon200get20Dec extends Decorator implements Applicable{
	public void create(int total){
    	//if total is >= 200 then take the total and print the new total at a 20% discount
    }
	
	public boolean applies(PurchasedItems items){
        return true;
    }
    
    public void printReceipt(){
        
    }
}
