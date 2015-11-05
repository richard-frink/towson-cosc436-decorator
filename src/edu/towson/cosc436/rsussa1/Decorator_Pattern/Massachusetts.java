package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.text.*;
import java.util.Date;

import edu.towson.cosc436.rsussa1.Interfaces.Iterator;

public class Massachusetts extends TaxComputation {

	@Override
	public float computeTax(PurchasedItems items) {
		float tax = 0;
		if(!taxHoliday()){
			if(PurchasedItems.items[0] != null){
				Iterator itr = items.getIterator();
				Item temp = itr.getItem();
				tax += (temp.getPrice())*(.0625);
				while(itr.hasNext()){
					itr.next();
					temp = itr.getItem();
					tax += (temp.getPrice())*(.0625);
				}
			}
			return tax;
		}
		else{
			return 0;
		}		
	}

	//has a special tax free time on all goods on August 8th and 9th
	@Override
	protected boolean taxHoliday(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String str = dateFormat.format(date);
		
		if(str.charAt(6) == '8' && (str.charAt(9) == '8' || str.charAt(9) == '9')){
			return true;
		}
		else{
			return false;
		}
	}
}
