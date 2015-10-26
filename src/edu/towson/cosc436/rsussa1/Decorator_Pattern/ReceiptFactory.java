package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Date;

public class ReceiptFactory {
	private PurchasedItems items;
	private Decorator[] decorators;
	private BasicReceipt receipt;
	private Date date;
	private String StateInfo;
	private String StateCode;
	
	public ReceiptFactory(PurchasedItems items, Decorator[] decorators, Date date){
		this.items = items;
		this.decorators = decorators;
		this.date = date;
		readConfigFile();
		
		receipt = new BasicReceipt(items, date);
		addTaxComputation();
		addDecorators();
	}
	
	public BasicReceipt getReceipt(){
		return receipt;
	}
	
	public void addTaxComputation(){
		
	}
	
	public void readConfigFile(){
		
	}
	
	private void addDecorators(){
		
	}
}
