package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Date;
import java.io.*;
import java.util.*;

public class ReceiptFactory {
	private PurchasedItems items;
	private Decorator[] decorators;
	private BasicReceipt receipt;
	private Date date;
	private String StoreNumber = ""; // store's number
	private String StoreInfo = ""; // address of store to print on receipt
	private String StorePhone = ""; // phone number of store
	private String StateCode = ""; // used to calculate tax info
	
	public ReceiptFactory(PurchasedItems items, Decorator[] decorators, Date date){
		this.items = items;
		this.decorators = decorators;
		this.date = date;
		//readConfigFile();
		
		receipt = new BasicReceipt(this.items, date);
		addTaxComputation(StateCode);
		addDecorators();
	}
	
	public BasicReceipt getReceipt(){
		return receipt;
	}
	
	public void addTaxComputation(String location){
		if(location.equalsIgnoreCase("MD")){
			receipt.addTaxMethod(new Maryland());
		}
		else if(location.equalsIgnoreCase("MA")){
			receipt.addTaxMethod(new Massachusetts());
		}
		else if(location.equalsIgnoreCase("CA")){
			receipt.addTaxMethod(new California());
		}
		else if(location.equalsIgnoreCase("DE")){
			receipt.addTaxMethod(new Delaware());
		}
	}
	
	private void addDecorators(){
		
	}
	
	public void readConfigFile(){
		//i am building this with a random number generator and a set of files
		try{
            Scanner read;
            Random r = new Random();
            int randNum = r.nextInt(4);
            if(randNum == 0){
            	read = new Scanner(new File("config1.txt"));
            }
            else if(randNum == 1){
            	read = new Scanner(new File("config2.txt"));
            }
            else if(randNum == 2){
            	read = new Scanner(new File("config3.txt"));
            }
            else{
            	read = new Scanner(new File("config4.txt"));
            }
            StoreNumber = read.next();
            StoreInfo = read.next();
            StorePhone = read.next();
            StateCode = read.next();
        }
        catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
	}
}
