package homework;

import java.util.Scanner;

public class Repl_83 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    String guest = "";
	    // your code 
	    // ------------------------------------------
	    
	    System.out.println("Please enter guest name:");
	    String name = input.nextLine();
	    System.out.println("Do you want to enter new guest name:");
	    String s1 = input.next(); 
	    
	    
	    while(s1.equals("yes")) {
	  	System.out.println("Please enter guest name:");
			String name1 = input.next()+", ";
			guest += name1;
			System.out.println("Do you want to enter new guest name:");
			s1 = input.next();
		   
			}
			
			System.out.println("Guest's list: "+ name+", " + guest.substring(0,guest.length()-2 ));
	    
	    
	}

}
