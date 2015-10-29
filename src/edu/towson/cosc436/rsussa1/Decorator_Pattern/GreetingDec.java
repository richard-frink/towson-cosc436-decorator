package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class GreetingDec extends Decorator implements Applicable{
	private String greeting;
		
	public GreetingDec(String greet){
		this.greeting = greet;
	}
	
	public boolean applies(String[] strs){
        return true;
    }
	
    public void printReceipt(){
        System.out.print("\n" + greeting);
        
    }
}
