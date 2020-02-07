package com.myApp.NewYearGift.myProject;



import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	int ch;
    	float maxWeight;
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter Maximum weight of the Gift Box (in Kgs ) : ");
        maxWeight = scan.nextFloat();
        Gift giftObj = new Gift(maxWeight);
        giftObj = null;
        
        System.out.println("\nGiftBox is Empty, add some Gifts!\n");
        
        while(true) {

            System.out.print("1.Candy\n2.Sweet\n3.Display Gift Box\n4.Stop!\nEnter Your choice: ");
            ch = scan.nextInt();
            
            switch(ch) {
            
            case 1 : Candy candyObj = new Candy();
            		 if(candyObj.takeInput())
            			 break;
            		 else {
            			 Gift obj = new Gift();
                		 obj.displayGiftBox();
                		 return;
            		 }
            		 
            case 2 : Sweet sweetObj = new Sweet();
            		 if(sweetObj.takeInput())            	
            			 break;
            		 else {
            			 Gift obj = new Gift();
                		 obj.displayGiftBox();
                		 return;
            		 }
            		 
            case 3 : Gift obj = new Gift();
            		 obj.displayGiftBox();            		
            		 break;
            
            case 4 : Gift obj1 = new Gift();
   		 		     obj1.displayGiftBox();            		
            		 return; 
            
            }
            
        }
    }
}
