package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import edu.towson.cosc436.rsussa1.Interfaces.Iterator;

public class BasicReceipt {
	private PurchasedItems items;
	private float totalSaleNoTax = 0; // total without tax
	private float amountDue = 0; // total with sales tax
	private float total_tax = 0; // total tax on the receipt
	private TaxComputation StateTax;
	
	public BasicReceipt(PurchasedItems items){
		this.items = items;
	}
	
    public void create(){
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
    	
    	if(Client.decorators[0] != null){
    		((GreetingDec)Client.decorators[0]).printReceipt();
    	}
    	if(Client.decorators[1] != null){
    		((GreetingDec)Client.decorators[2]).printReceipt();
    	}
        
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
        
        if(Client.decorators[2] != null){
    		((Coupon100get10Dec)Client.decorators[2]).printReceipt();
    	}
        if(Client.decorators[3] != null){
    		((Coupon200get20Dec)Client.decorators[3]).printReceipt();
    	}
        if(Client.decorators[4] != null){
    		((RebateIpodDec)Client.decorators[4]).printReceipt();
    	}
        if(Client.decorators[5] != null){
    		((RebateHPPrinterDec)Client.decorators[5]).printReceipt();
    	}
    }
}
