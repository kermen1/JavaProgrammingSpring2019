package homework;

import java.util.Scanner;

public class repl104 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   
		    String s2 = "";
		    String s3 = "";
		    //TODO: Write your code below
		    System.out.print("[");
		    
		    for(int i = 0 ;i<words.length;i++) {
					  
				char s1=words[i].charAt(0);
					s2=words[i].charAt(words[i].length()-1)+", ";
				 
					System.out.print(s1);
					 System.out.print(s2);
			              
			           }
				
		    if(s2.endsWith(", ")) {
		         s3 = s2.substring(0, s2.length()-2);
				     }
	 
		    System.out.print("]");
			       

	}

}
