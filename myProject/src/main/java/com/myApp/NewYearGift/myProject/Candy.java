package com.myApp.NewYearGift.myProject;

import java.util.Scanner;

public class Candy implements Item {
	Scanner scan = new Scanner(System.in);

	public boolean takeInput() {
		// TODO Auto-generated method stub
		 String candy;
		 int price;
		 float weight;
		 Gift gift;
		 
		 System.out.print("\nEnter Candy name : ");
		 candy = scan.next();
		 System.out.println();
		 System.out.print("Enter Candy price (in Rs. ): ");
		 price = scan.nextInt();
		 System.out.println();
		 System.out.print("Enter Candy Weight (in kgs ) : ");
		 weight = scan.nextFloat();
		 System.out.println();
		 
		 gift = new Gift();
		 if(gift.addGift("Candy",candy,price,weight)) {
			 System.out.println(candy+" is added to the Gift Box\n\n");
			 return true;
		 }
			 
		 else {
			 System.out.println("GiftBox is Full. You cannot add this further!\n\n");
			 return false;
		 }
			 
		 
		 
		 
	}

}
