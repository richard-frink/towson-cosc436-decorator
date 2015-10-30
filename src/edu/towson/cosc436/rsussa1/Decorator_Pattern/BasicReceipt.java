package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Date;
import edu.towson.cosc436.rsussa1.Interfaces.Iterator;

public class BasicReceipt {
	private Date d; ///this is how the date prints::::	Thu Oct 29 14:07:08 EDT 2015
	private PurchasedItems items;
	private float totalSaleNoTax = 0; // total without tax
	private float amountDue = 0; // total with sales tax
	private float total_tax = 0; // total tax on the receipt
	private TaxComputation StateTax;
	
	public BasicReceipt(PurchasedItems items, Date date){
		this.items = items;
		this.d = date;
	}
	
    public void create(){
        //date is already set
    	//addTaxMethod should have already been called to deal with tax operation //// if not, ignore calculating tax
    	
    	
    	
    	//we need to calculate the prices of all items
    	totalSaleNoTax = items.getTotal();
    	
    	if(StateTax != null){
    		
    	}//calculate tax
    	
    	amountDue = totalSaleNoTax + total_tax;
    	//calc the total charge to customer
        
    }
    
    public void printReceipt(){
        System.out.print("\n------------------------------------------------\n");
        System.out.println(d + "\n");
        
        //figure out the order that everything ever is printed out in
        
        
        Iterator itr = items.getIterator();
        while(itr.hasNext()){
        	System.out.println((itr.getItem()).toString());
        	itr.next();
        }
        System.out.println((itr.getItem()).toString());
        
                
        
        
        System.out.print("\n------------------------------------------------\n");
    }
    
    public void addTaxMethod(TaxComputation tax){
        StateTax = tax;
    }
}
