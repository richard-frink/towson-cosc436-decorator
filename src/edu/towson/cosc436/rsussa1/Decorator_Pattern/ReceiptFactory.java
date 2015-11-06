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
	public static Date date = new Date();   //this is how the date prints  ::  Thu Oct 29 14:07:08 EDT 2015  ::
	private String StoreNumber = ""; 		// store's number
	private String StoreInfo = ""; 			// address of store to print on receipt
	private String StorePhone = ""; 		// phone number of store
	private String StateCode = ""; 			// used to calculate tax info
	
	public ReceiptFactory(PurchasedItems items, Decorator[] decorators){
		this.items = items;
		this.decorators = decorators;
		readConfigFile();
		
		receipt = new BasicReceipt(this.items);
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
		for(int i = 0; i < decorators.length; i++){
			if(decorators[i] != null){
				if(!decorators[i].applies(items)){
					decorators[i] = null;
				}
			}
			else{
				break;
			}
		}
	}
	
	public void printStoreInfo(){
        System.out.print(date);
		System.out.print("\nStore " + StoreNumber);
		System.out.print("\n" + StoreInfo);
		System.out.println("\n" + StorePhone);
	}
	
	public void readConfigFile(){
		//i am building this with a random number generator and a set of files
		try{
            Scanner read;
            Random r = new Random();
            int randNum = r.nextInt(4);
            if(randNum == 0){
            	read = new Scanner(new File(System.getProperty("user.dir") + "/" + "config1"));
            }
            else if(randNum == 1){
            	read = new Scanner(new File(System.getProperty("user.dir") + "/" + "config2"));
            }
            else if(randNum == 2){
            	read = new Scanner(new File(System.getProperty("user.dir") + "/" + "config3"));
            }
            else{
            	read = new Scanner(new File(System.getProperty("user.dir") + "/" + "config4"));
            }
            StoreNumber = read.nextLine();
            StoreInfo = read.nextLine();
            StorePhone = read.nextLine();
            StateCode = read.nextLine();
        }
        catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
	}
}