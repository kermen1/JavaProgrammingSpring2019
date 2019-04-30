package homework;

import java.util.Scanner;

public class repl148 {

	public static void main(String[] args) {
		  
			     Scanner inp = new Scanner(System.in);
			     System.out.print("enter number");
			     int n = inp.nextInt();
			     next3(n);
			  
			  } public static void next3(int n){
			    
				int count =n+1;
					for(int i = 0;i<= 2;i++) {
						
						System.out.print(count+" ");
						count++;
					}
					System.out.println();
					}
			    

	

}
