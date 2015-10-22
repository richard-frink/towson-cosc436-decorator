package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.TaxComputation;

public class California implements TaxComputation {

	@Override
	public float getTax(PurchasedItems items) {
		return (float).075;
	}
}
