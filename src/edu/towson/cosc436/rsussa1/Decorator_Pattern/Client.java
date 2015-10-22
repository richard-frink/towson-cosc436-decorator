package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.TaxComputation;

public class Client {
	public static void main(String[] args){
		Decorator[] decorators = new Decorator[10];
		getCurrentDecorators(decorators);
		
		//user input
		//this is:
		//1. start new reciept
		
		//2. add sales items
		
		//3. display receipt
		
		
		
		//create factory
		RecieptFactory factory = new RecieptFactory();
		
		Component reciept = factory.getReciept();
		reciept.printReciept();
	}

	private static void getCurrentDecorators(Decorator[] decorators) {
		
	}
}
