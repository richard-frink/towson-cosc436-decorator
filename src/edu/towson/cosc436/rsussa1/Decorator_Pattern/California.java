package edu.towson.cosc436.rsussa1.Decorator_Pattern;

import edu.towson.cosc436.rsussa1.Interfaces.Iterator;

/**
 *
 * @author rsussa1
 */


public class California extends TaxComputation {

	@Override
	public float computeTax(PurchasedItems items) {
		float tax = 0;
		if(!taxHoliday()){
			if(PurchasedItems.items[0] != null){
				Iterator itr = items.getIterator();
				Item temp = itr.getItem();
				tax += (temp.getPrice())*(.075);
				while(itr.hasNext()){
					itr.next();
					temp = itr.getItem();
					tax += (temp.getPrice())*(.075);
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
