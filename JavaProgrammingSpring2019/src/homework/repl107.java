package homework;

import java.util.Scanner;

public class repl107 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		    
		    int count = 0;
		    for (int i = 0; i < email.length() - 1; i++) 
		    {
		      if (email.substring(i, i+1).equals("@")) 
		      {
		        count++;
		      }
		    }
		    
		    if (count == 1) 
		    {
		      String [] email2 = email.split("@");
		      System.out.println("Email id: " + email2[0]);
		      System.out.println("Email domain: " + email2[1]);
		    } else System.out.println("invalid email");
		    
		    
		    

	}

}
