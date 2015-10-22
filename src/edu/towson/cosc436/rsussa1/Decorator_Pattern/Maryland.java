package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.TaxComputation;

public class Maryland implements TaxComputation {

	//we can say that there is no special sales tax holiday because it does
	//not apply to electronics, and our store is best buy, soooo
	@Override
	public float getTax(PurchasedItems items){
		return (float).06;
	}
}
