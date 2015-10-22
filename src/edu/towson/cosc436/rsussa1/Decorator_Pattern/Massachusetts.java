package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.TaxComputation;
import java.text.*;
import java.util.Date;

public class Massachusetts implements TaxComputation {

	//has a special tax free time on all goods on August 8th and 9th
	@Override
	public float getTax(PurchasedItems items) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String str = dateFormat.format(date);
		
		if(str.charAt(6) == '8' && (str.charAt(9) == '8' || str.charAt(9) == '9')){
			return 0;
		}
		else{
			return (float).0625;			
		}
	}
}
