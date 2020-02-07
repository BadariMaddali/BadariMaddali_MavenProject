package com.myApp.NewYearGift.myProject;

import java.util.ArrayList;


public class Gift{

	public static ArrayList<GiftItem> gifts = new ArrayList<GiftItem>();
	public static float totalWeight = 0;
	public static float maxWeight;
	
	public Gift() {
		
	}
	public Gift(float maxWeight) {
		// TODO Auto-generated constructor stub
		this.maxWeight = maxWeight;
	}
	
	public boolean addGift(String type,String name, int price, float weight) {
		if(totalWeight+weight > maxWeight) {
			return false;
		}
		else {
			gifts.add(new GiftItem(type,name,price,weight));
			totalWeight += weight;
			return true;
		}
	}

	
	public void displayGiftBox() {
		// TODO Auto-generated method stub
		
		
		if(gifts.size() != 0) {
			System.out.println("\n\nGift Box Contains : \n\n");
			System.out.println("---Type--- \t ---Name--- \t ---Price--- \t ---Weight---");
			for(int i=0;i<gifts.size();i++) {
				System.out.println(gifts.get(i).type + " \t\t " + gifts.get(i).name + " \t\t "+ gifts.get(i).price + "/-\t\t " + gifts.get(i).weight+"kgs");
			}
			
			System.out.println("\n\nWeight of the Gift Box is : " + totalWeight+"kgs\n\n");
		}
		else {
			System.out.println("Your Gift Box is Empty!");
		}
	}

	

}
