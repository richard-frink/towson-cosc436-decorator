package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class RebateIpodDec extends Decorator implements Applicable{
	public boolean applies(PurchasedItems items){
		if(items.hasItem(new Item("apple ipod nano", (float)199.99))){
        	return true;
        }
        return false;
    }
    
	public void printReceipt(){
		System.out.print("\nMail-in rebate available for $60 on your 'Apple Ipod Nano'!\n");
	}
}
