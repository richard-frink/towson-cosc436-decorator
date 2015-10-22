package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Date;

public class RecieptFactory {
	private PurchasedItems items;
	private Decorator[] decorators;
	private BasicReciept reciept;
	private Date date;
	private String StateInfo;
	private String StateCode;
	
	public RecieptFactory(PurchasedItems items, Decorator[] decorators, Date date){
		this.items = items;
		this.decorators = decorators;
		this.date = date;
		readConfigFile();
		
		reciept = new BasicReciept(items, date);
		addTaxComputation();
		addDecorators();
	}
	
	public BasicReciept getReciept(){
		return reciept;
	}
	
	public void addTaxComputation(){
		
	}
	
	public void readConfigFile(){
		
	}
	
	private void addDecorators(){
		
	}
}
