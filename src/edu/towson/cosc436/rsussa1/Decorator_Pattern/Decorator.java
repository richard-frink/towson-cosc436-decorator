package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

abstract class Decorator implements Applicable{
    private BasicReceipt trailer;
    
    public void create(BasicReceipt receipt){
        trailer = receipt;
    }
    
    //this method calls the print receipt method of the next portion of the receipt
    public void callTrailer(){
        trailer.printReceipt();
    }
    
    public boolean applies(PurchasedItems items){
    	return false;
    }
}
