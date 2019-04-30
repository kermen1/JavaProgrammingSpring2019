package Day22;

import java.util.Scanner;

public class MonthCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;//declaring variable 
		
		do {
			System.out.println("Enter month: ");
			month = scan.nextInt();
			
		}while(month>= 1 && month<= 12);
		
		System.out.println("Invalud month");
		
		
		
		

	}

}
