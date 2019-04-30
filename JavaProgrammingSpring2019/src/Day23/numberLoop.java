package Day23;

import java.util.Scanner;

public class numberLoop {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		 
	        int x=scan.nextInt();
	        
	        for(int i=2; i<x; i++) {
	            if(x%i ==0) {
	                System.out.println(x +" is not prime");
	                return;
	            }
	        }
	        
	        System.out.println(x+" is prime");
	        }

}
