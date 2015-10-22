package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

public class Delaware extends TaxComputation {

	//there is no tax on delware's products
	@Override
	public float computeTax(PurchasedItems items) {
		return 0;
	}
	
	@Override
	protected boolean taxHoliday(){
		return true;
	}
}
