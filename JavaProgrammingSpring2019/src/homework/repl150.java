package homework;

import java.util.Scanner;

public class repl150 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		
	

	}static void timeConversion(String s) 
	{ 
	    // Get hours 
	    int h1 = (int)s.charAt(1)-'0'; 
	    int h2 = (int)s.charAt(0)-'0'; 
	    int hh = (h2 * 10 + h1 % 10); 
	  
	    // If time is in "AM" 
	    if (s.charAt(8) == 'A') 
	    { 
	        if (hh == 12) 
	        { 
	            System.out.print("00"); 
	            for (int i = 2; i <= 7; i++) 
	                System.out.print(s.charAt(i)); 
	        } 
	        else
	        { 
	            for (int i = 0; i <= 7; i++) 
	                System.out.print(s.charAt(i)); 
	        } 
	    } 
	  
	    // If time is in "PM" 
	    else
	    { 
	        if (hh == 12) 
	        { 
	            System.out.print("12"); 
	            for (int i = 2; i <= 7; i++) 
	                System.out.print(s.charAt(i)); 
	        } 
	        else
	        { 
	            hh = hh + 12; 
	            System.out.print(hh); 
	            for (int i = 2; i <= 7; i++) 
	                System.out.print(s.charAt(i)); 
	        } 
	    } 
	} 

}
