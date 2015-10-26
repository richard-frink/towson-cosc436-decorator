package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

abstract class Decorator {
    private BasicReceipt trailer; // points to another decorator or the receipt
    
    public void create(BasicReceipt receipt){
        
    }
    
    //this method calls the print receipt method of the next portion of the receipt
    public void callTrailer(){
        
    }
}
