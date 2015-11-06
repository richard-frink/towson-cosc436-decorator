package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class RebateHPPrinterDec extends Decorator implements Applicable{
	public boolean applies(PurchasedItems items){
        if(items.hasItem(new Item("hpprinter", (float)129.99))){
        	return true;
        }
        return false;
    }
    
	public void printReceipt(){
		System.out.print("\nMail-in rebate available for $45 on your 'HpPrinter'!");		
	}
}
