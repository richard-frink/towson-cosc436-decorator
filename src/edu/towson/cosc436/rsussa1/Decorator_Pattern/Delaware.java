package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.TaxComputation;

public class Delaware implements TaxComputation {

	//there is no tax on delware's products
	@Override
	public float getTax(PurchasedItems items) {
		return 0;
	}
}
