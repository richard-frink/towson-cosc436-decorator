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
		
		//user input(display avoid items, user selects user selsctsfrom)
		//create factory
		RecieptFactory factory = new RecieptFactory();
		
		Component reciept = factory.getReciept();
		reciept.printReciept();
	}

	private static void getCurrentDecorators(Decorator[] decorators) {
		
	}
}
