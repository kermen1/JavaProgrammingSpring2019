package homework;

import java.util.Scanner;

public class ShoppingList3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		String s1;
		

		
		for( count = 1; count<=10; count++) {
			System.out.println("Enter item"+count+" and its price: ");
			 item = scan.next();
	         price = scan.nextInt();
			 System.out.println("Add one more item?");
			 s1 = scan.next();
			 if(s1.equalsIgnoreCase("no")) {
				 return;
			 }
			 
		}
		
	
		System.out.println("Your items: "+shoppingListReport);
		System.out.println("Total prise: $"+totalPrice);
		
		
		
		
		
		
		
	}

}
