package homework;

import java.util.Scanner;

public class javaxxx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 boolean exists = false;
		   String str = scan.next();
		   String str1 = str.substring(0,4);
		   String str2 = str.substring(1,5);
		        int s1 = str.length();
		        
		        
		        if(s1<=3) {
					   System.out.println("false");
		 
		        }else  if(s1>=4){
			   if(str1.equals("java")||str2.equals("java")) {
			 System.out.println("true");
			   }else {
				   System.out.println("false");
			   }
			   
		   
		   
		   }else {
			   System.out.println("false");
		    
		
		   }
		
		}	
		
}
		  