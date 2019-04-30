package homework;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1;
		String item = "";
		double price = 0;
		String ansver="";
		String report="";
		int total = 0;
		
		
		do{
			System.out.println("Enter Item"+i+" and its price:");
			 item = scan.next();
	         price = scan.nextInt();
	         System.out.println("Add one more item?");
	         ansver=scan.next();
	         if(ansver.equals("no")) {
	        	report = "Item"+i+":"+item+" Price:"+price;
	        	total += price;
	         }
			
			i++;
		}while(i <= 10);
		
		
		
		
		
		
		
		
		
		
		
			 
		

	}

}
