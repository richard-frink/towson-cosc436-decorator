package edu.towson.cosc436.rsussa1.Decorator_Pattern;

import edu.towson.cosc436.rsussa1.Interfaces.Iterator;

/**
 *
 * @author rsussa1
 */

public class Maryland extends TaxComputation {

	//we can say that there is no special sales tax holiday because it does
	//not apply to electronics, and our store is best buy, soooo
	@Override
	public float computeTax(PurchasedItems items){
		float tax = 0;
		if(!taxHoliday()){
			if(PurchasedItems.items[0] != null){
				Iterator itr = items.getIterator();
				Item temp = itr.getItem();
				tax += (temp.getPrice())*(.06);
				while(itr.hasNext()){
					itr.next();
					temp = itr.getItem();
					tax += (temp.getPrice())*(.06);
				}
			}
			return tax;
		}
		else{
			return 0;
		}
	}
	
	@Override
	protected boolean taxHoliday(){
		return false;
	}
}
