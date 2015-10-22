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
		boolean start = true;
		Scanner scan = new Scanner(System.in);
		
		//user input
		//this is:
		//1. start new reciept
		//2. add sales items
		//3. display receipt
		while(start == true){
			System.out.println("\n1-Start New Reciept");
			System.out.println("2-Add sales items");
			System.out.println("3-Display reciept");
			System.out.println("4-Exit program");

			System.out.println("Please enter an option: ");

			int option = getInt(scan.nextInt());

			switch(option){
				case 1 : 
					
					break;

				case 2 : 
					
					break;

				case 3 : //creating a factory
					RecieptFactory factory = new RecieptFactory(items, decorators, date);
					BasicReciept reciept = factory.getReciept();
					reciept.printReciept();
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
			System.out.println("\nThe provided input must be a vaild option from above.");
			System.out.println("Please enter an option: ");
			Scanner scan = new Scanner(System.in);
			temp = scan.nextInt();
		}
		return temp;
	}
}
