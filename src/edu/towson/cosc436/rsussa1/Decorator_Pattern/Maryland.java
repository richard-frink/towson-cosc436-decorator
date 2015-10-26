package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

public class Maryland extends TaxComputation {

	//we can say that there is no special sales tax holiday because it does
	//not apply to electronics, and our store is best buy, soooo
	@Override
	public float computeTax(PurchasedItems items){
		return (float).06;
	}
	
	@Override
	protected boolean taxHoliday(){
		return false;
	}
}
