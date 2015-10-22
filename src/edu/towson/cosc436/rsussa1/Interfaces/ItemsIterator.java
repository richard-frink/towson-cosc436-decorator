package edu.towson.cosc436.rsussa1.Interfaces;

/**
 *
 * @author rsussa1
 */
import edu.towson.cosc436.rsussa1.Decorator_Pattern.Item;

public interface ItemsIterator {
	public boolean hasNext();
	public Item getItem();
	public void next();
}
