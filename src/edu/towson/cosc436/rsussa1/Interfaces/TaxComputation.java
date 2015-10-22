package edu.towson.cosc436.rsussa1.Interfaces;

/**
 *
 * @author rsussa1
 */
import edu.towson.cosc436.rsussa1.Decorator_Pattern.PurchasedItems;

public interface TaxComputation {
	public float getTax(PurchasedItems items);
}
