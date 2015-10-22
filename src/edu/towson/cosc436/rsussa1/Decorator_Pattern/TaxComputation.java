package edu.towson.cosc436.rsussa1.Decorator_Pattern;

public abstract class TaxComputation {
	public abstract float computeTax(PurchasedItems items);
	protected abstract boolean taxHoliday();
}
