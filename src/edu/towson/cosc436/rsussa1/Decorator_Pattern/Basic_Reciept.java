package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.TaxComputation;
import java.util.Date;

public class Basic_Reciept {
	Date d;
	PurchasedItems items;
	float totalSaleNoTax = 0;
	float totalSaleWithTax = 0;
	float total_tax = 0;
	TaxComputation StateTax;
	
    public void create(){
        d = new Date();
        
    }
    
    public void printReciept(){
        
    }
    
    public void addTaxMethod(TaxComputation tax){
        
    }
}
