package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */


public class California extends TaxComputation {

	@Override
	public float computeTax(PurchasedItems items) {
		return (float).075;
	}
	
	@Override
	protected boolean taxHoliday(){
		return true;
	}
}
