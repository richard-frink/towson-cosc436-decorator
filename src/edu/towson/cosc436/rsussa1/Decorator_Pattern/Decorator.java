package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

abstract class Decorator {
    private Reciept trailer; // points to another decorator or the reciept
    
    public void create(Reciept c){
        
    }
    
    //this method calls the print reciept method of the next portion of the reciept
    public void callTrailer(){
        
    }
}
