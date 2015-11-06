package edu.towson.cosc436.rsussa1.Decorator_Pattern;

/**
 *
 * @author rsussa1
 */

import java.util.Scanner;

public class Client {
	public static Decorator[] decorators = new Decorator[10];
	private static PurchasedItems items;
	
	public static void main(String[] args){
		boolean start = true;
		items = new PurchasedItems();
		getCurrentDecorators(decorators);
		
		Scanner scan = new Scanner(System.in);

		
		while(start == true){
			System.out.println("\n1-Start New Receipt");
			System.out.println("2-Add sales items");
			System.out.println("3-Display reciept");
			System.out.println("4-Exit program");
			System.out.print("Please enter an option: ");
			int option = getMenuInt(scan.nextInt());

			switch(option){
				case 1 :
					items.clearItems();
					break;

				case 2 : 
					printItemOptions();
					boolean addItem = true;
					while(addItem){
						System.out.print("\nEnter the number of the item for purchase: ");
						int item_num = getItemInt(scan.nextInt());
						addItem(item_num);
						System.out.print("\nItem successfully added.\n");
						System.out.print("\nEnter another item? (y/n): ");
						String cont = scan.next();
						if(cont.equalsIgnoreCase("y"));
						else{
							addItem = false;
						}
					}
					break;

				case 3 : //creating a factory
					getCurrentDecorators(decorators);
					ReceiptFactory factory = new ReceiptFactory(items, decorators);
					BasicReceipt receipt = factory.getReceipt();
			        System.out.print("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			        factory.printStoreInfo();//prints the store number, address, phone number, and current date
					receipt.printReceipt();
			        System.out.print("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
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
	
	private static int getMenuInt(int temp){
		while(temp < 1 || temp > 4){
			System.out.print("\nThe provided input must be a vaild option from above.");
			System.out.print("\nPlease enter an option: ");
			Scanner scan = new Scanner(System.in);
			temp = scan.nextInt();
		}
		return temp;
	}
	
	private static int getItemInt(int temp){
		while(temp < 1 || temp > 8){
			System.out.print("\nThe provided input must be a vaild option from above.");
			System.out.print("\nPlease enter an option: ");
			Scanner scan = new Scanner(System.in);
			temp = scan.nextInt();
		}
		return temp;
	}
	
	private static void printItemOptions(){
		System.out.printf("\n%-30s", "1: Apple Ipod Nano");
		System.out.print("$199.99");
		System.out.printf("\n%-30s", "2: HP Printer");
		System.out.print("$129.99");
		System.out.printf("\n%-30s", "3: Samsung 48in. Television");
		System.out.print("$599.99");
		System.out.printf("\n%-30s", "4: Wall Adapter");
		System.out.print("$5.99");
		System.out.printf("\n%-30s", "5: Ethernet Cable");
		System.out.print("$6.99");
		System.out.printf("\n%-30s", "6: Apple Macbook Pro 16in.");
		System.out.print("$1659.99");
		System.out.printf("\n%-30s", "7: Sony Playstation 4 ");
		System.out.print("$349.99");
		System.out.printf("\n%-30s", "8: Samsung Galaxy Tab A 8.7in.");
		System.out.println("$289.99");
	}
	
	private static void addItem(int option){
		switch(option){
			case 1 :
				items.addItem(new Item("Apple Ipod nano", (float)199.99));
				break;
			case 2 :
				items.addItem(new Item("HP Printer", (float)129.99));
				break;
			case 3 :
				items.addItem(new Item("Samsung 48in. Television", (float)599.99));
				break;
			case 4 :
				items.addItem(new Item("Wall Adapter", (float)5.99));
				break;
			case 5 :
				items.addItem(new Item("Ethernet Cable", (float)6.99));
				break;
			case 6 :
				items.addItem(new Item("Apple Macbook Pro 15in.", (float)1659.99));
				break;
			case 7 :
				items.addItem(new Item("Sony Playstation 4", (float)349.99));
				break;
			case 8 :
				items.addItem(new Item("Samsung Galaxy Tab A 8.7in.", (float)299.99));
				break;
		}
	}
}
