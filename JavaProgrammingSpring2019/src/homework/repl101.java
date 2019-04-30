package homework;

import java.util.Scanner;

public class repl101 {

	public static void main(String[] args) {
		
		 
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    String result ="";
	    
	    
	      
		for(int i = 0 ;i<words.length;i++) {
			
			System.out.print(words[i].charAt(0));
			System.out.println(words[i].charAt(words[i].length()-1));
		}
		 

	}

}
