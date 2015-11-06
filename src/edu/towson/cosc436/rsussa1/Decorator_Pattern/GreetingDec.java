package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.text.*;

import edu.towson.cosc436.rsussa1.Interfaces.Applicable;

public class GreetingDec extends Decorator implements Applicable{
	private String greeting;
		
	public GreetingDec(String greet){
		this.greeting = greet;
	}
	
	public boolean applies(PurchasedItems items){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String str = dateFormat.format(ReceiptFactory.date);

		if(greeting.equalsIgnoreCase("Happy Holidays from Best Buy")){
			//date is from december (1st through the 31st)
			if((str.charAt(5) == '1') && (str.charAt(6) == '2')){
				return true;
			}
		}
		else if(greeting.equalsIgnoreCase("Summer Sales are Hot at Best Buy")){
			//date is from june through august, any day
			if(str.charAt(6) == '6' || str.charAt(6) == '7' || str.charAt(6) == '8'){
				return true;
			}			
		}
		return false;
    }
	
    public void printReceipt(){
        System.out.println("\n" + greeting);
        
    }
}
