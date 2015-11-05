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
    	
    	totalSaleNoTax = items.getTotal();
    	if(StateTax != null){
    		total_tax = StateTax.computeTax(items);
    	}
    	amountDue = totalSaleNoTax + total_tax;
    }
    
    public void addTaxMethod(TaxComputation tax){
        StateTax = tax;
    }
    
    public void printReceipt(){
    	
    	//factory printStoreInfo()
    	
    	
        //figure out the order that everything ever is printed out in
        
        
        if(PurchasedItems.items[0] != null){
        	create();
            Iterator itr = items.getIterator();
    		Item temp = itr.getItem();
    		System.out.printf("\n%-36s", temp.getName());
    		System.out.printf("$%.2f", temp.getPrice());
            while(itr.hasNext()){
        		itr.next();
        		temp = itr.getItem();
        		System.out.printf("\n%-36s", temp.getName());
        		System.out.printf("$%.2f", temp.getPrice());
        	}
        }
        System.out.print("\n                               Tax: ");
        System.out.printf("$%.2f", total_tax);
        System.out.print("\n                             Total: ");
        System.out.printf("$%.2f", amountDue);
    }
}
