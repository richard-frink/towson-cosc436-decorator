package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Rebate;

public class RebateItem extends Decorator implements Rebate{	
	public void create(int itemNum){
    	
    }
	
	public boolean applies(PurchasedItems items){
        return true;
    }
    
	public void printReciept(){
		
	}
	
	public int getItemNum(){
		return 0;
	}
}
