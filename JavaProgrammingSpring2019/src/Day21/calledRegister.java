package Day21;

import java.util.Scanner;

public class calledRegister {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many items purchased?");
		int itemsCount = scan.nextInt();
		double totalPrice =0.0;
		String items ="";
		
		for(int count = 1; count<=itemsCount; count++) {
			System.out.println("What is item "+count+"?");
			String itemsName = scan.next();
			System.out.println("How much is "+itemsName+"?");
			 double itemPrice = scan.nextInt();
			 items += itemsName+", ";
			 totalPrice += itemPrice;
			 
		}
		
	
		System.out.println("Your items: "+items);
		System.out.println("Total prise: $");
		
		
		
		
		
		
		
		

	}

}
