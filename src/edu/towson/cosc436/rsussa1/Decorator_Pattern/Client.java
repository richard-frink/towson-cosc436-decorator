package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Scanner;
import java.util.Date;

public class Client {
	public static void main(String[] args){
		Date date = new Date();
		boolean start = true;
		PurchasedItems items = new PurchasedItems();
		Decorator[] decorators = new Decorator[10];
		getCurrentDecorators(decorators);
		
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
					items = new PurchasedItems(); // clears current list of items remembered for the receipt
					break;

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
						if(cont.equalsIgnoreCase("y"));
						else{
							addItem = false;
						}
					}
					break;

				case 3 : //creating a factory
					ReceiptFactory factory = new ReceiptFactory(items, decorators, date);
					BasicReceipt receipt = factory.getReceipt();
			        System.out.print("\n::::::::::::::::::::::::::::::::::::::::::::::\n");
					receipt.printReceipt();
			        System.out.print("\n::::::::::::::::::::::::::::::::::::::::::::::\n");
					break;

				case 4 : 
					start = false;
					break;
			}
		}
		scan.close();
	}

	private static void getCurrentDecorators(Decorator[] decorators) {
		decorators[0] = new GreetingDec("Happy Holidays from Best Buy");
		decorators[1] = new GreetingDec("Summer Sales are Hot at Best Buy");
		decorators[2] = new Coupon100get10Dec();
		decorators[3] = new Coupon200get20Dec();
		decorators[4] = new RebateIpodDec();
		decorators[5] = new RebateHPPrinterDec();
		for(int i = 6; i < 10; i++){
			decorators[i] = null;
		}
	}
	
	private static int getInt(int temp){
		while(temp < 1 || temp > 4){
			System.out.print("\nThe provided input must be a vaild option from above.");
			System.out.print("\nPlease enter an option: ");
			Scanner scan = new Scanner(System.in);
			temp = scan.nextInt();
			scan.close();
		}
		return temp;
	}
}
