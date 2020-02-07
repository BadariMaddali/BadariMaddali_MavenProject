package com.myApp.NewYearGift.myProject;

import java.util.Scanner;

public class Sweet implements Item {
	Scanner scan = new Scanner(System.in);

	public boolean takeInput() {
		// TODO Auto-generated method stub
		 String sweet;
		 int price;
		 float weight;
		 Gift gift;
		 
		 System.out.print("\nEnter Sweet name : ");
		 sweet = scan.next();
		 System.out.println();
		 System.out.print("Enter Sweet price (in Rs. ) : ");
		 price = scan.nextInt();
		 System.out.println();
		 System.out.print("Enter Sweet Weight (in Kgs ) : ");
		 weight = scan.nextFloat();
		 System.out.println();
		 
		 gift = new Gift();
		 if(gift.addGift("Sweet",sweet,price,weight)) {
			 System.out.println(sweet+" is added to the Gift Box\n\n");
			 return true;
		 }
		 else {
			 System.out.println("GiftBox is Full. You cannot add this further!\n\n");
			 return false;
		 }
			 
		 
	}
}
