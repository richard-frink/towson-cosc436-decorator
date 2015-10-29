package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
*
* @author rsussa1
*/

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class Coupon200get20Dec extends Decorator implements Applicable{
	public void create(int idkwhatthisis, int discount){
    	
    }
	
	public boolean applies(String[] strs){
        return true;
    }
    
    public void printReceipt(){
        
    }
}
