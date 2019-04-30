package Day23;

import java.util.Scanner;

public class Number1to20 {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		 
	       int x=scan.nextInt();
	        
	        for(int i=1; i<=20; i++) {
	        	if(i>=5&&i<=10)
	            continue;
	          System.out.println(i);
	               
	            
	        }
	        
	        System.out.println(x+" is prime");
	        }


	}


