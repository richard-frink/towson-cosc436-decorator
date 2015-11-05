package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class RebateIpodDec extends Decorator implements Applicable{	
	public void create(){
    	
    }
	
	public boolean applies(PurchasedItems items){
        return true;
    }
    
	public void printReceipt(){
		
	}
}
