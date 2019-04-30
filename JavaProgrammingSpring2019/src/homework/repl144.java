package homework;

import java.util.Scanner;

public class repl144 {

	
		  public static void sign(int n)
		  {
		    //your code here
			  int i, j; 
		      
			 if(n>=1) {
				 System.out.println("1");
			 }else if(n==0) {
				 System.out.println("0");
			 }else if(n<0) {
				 System.out.println("-1");
			 }
		  
			  
			  
			  
			  
		    
		    
		    
		  }//end sign
		  
		  public static void main(String[] args) {
		     Scanner inp = new Scanner(System.in);
		     int n = inp.nextInt();
		    
		    sign(n);

	}

}
