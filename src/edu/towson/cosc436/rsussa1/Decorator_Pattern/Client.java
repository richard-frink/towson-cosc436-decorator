package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Scanner;
import java.util.Date;

public class Client {
	public static void main(String[] args){
		PurchasedItems items = new PurchasedItems();
		Decorator[] decorators = new Decorator[10];
		getCurrentDecorators(decorators);
		Date date = new Date();
		BasicReceipt myReceipt = new BasicReceipt(null, null);
		boolean start = true;
		Scanner scan = new Scanner(System.in);
		
		while(start == true){
			System.out.println("\n1-Start New Receipt");
			System.out.println("2-Add sales items");
			System.out.println("3-Display reciept");
			System.out.println("4-Exit program");
			System.out.print("Please enter an option: ");
			int option = getInt(scan.nextInt());

			switch(option){
				case 1 : 
					myReceipt = new BasicReceipt(null, null);
					break;
					//this case is necessary in case we want to not the restart the program,
					//but we want to start a new receipt

				case 2 : 
					boolean addItem = true;
					while(addItem){
						System.out.print("\nEnter the name of the item for purchase: ");
						String name = scan.next();
						System.out.print("\nEnter the price of the item for purchase: ");
						double p = scan.nextDouble();
						float price = (float)p;
						items.addItem(new Item(name, price));
						System.out.print("\nEnter another item? (y/n): ");
						String cont = scan.next();
						if(cont.equalsIgnoreCase("y")){
							
						}
						else{
							addItem = false;
						}
					}
					break;

				case 3 : //creating a factory
					ReceiptFactory factory = new ReceiptFactory(items, decorators, date);
					BasicReceipt receipt = factory.getReceipt();
					receipt.printReceipt();
					break;

				case 4 : 
					start = false;
					break;
			}
		}		
	}

	private static void getCurrentDecorators(Decorator[] decorators) {
		
	}
	
	private static int getInt(int temp){
		while(temp < 1 || temp > 4){
			System.out.print("\nThe provided input must be a vaild option from above.");
			System.out.print("\nPlease enter an option: ");
			Scanner scan = new Scanner(System.in);
			temp = scan.nextInt();
		}
		return temp;
	}
}
