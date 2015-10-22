package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Date;

public class BasicReciept {
	Date d;
	PurchasedItems items;
	float totalSaleNoTax = 0; // total without tax
	float amountDue = 0; // total with sales tax
	float total_tax = 0; // total tax on the reciept
	TaxComputation StateTax;
	
	public BasicReciept(PurchasedItems items, Date date){
		this.items = items;
		this.d = date;
	}
	
    public void create(){
        d = new Date();
        
    }
    
    public void printReciept(){
        
    }
    
    public void addTaxMethod(TaxComputation tax){
        
    }
}
