package homework;

import java.util.Scanner;

public class Xxxxx {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    char first = word.charAt(0);
				char last = word.charAt(word.length()-1);
				
		    
		    if(word.charAt(0) == 'x' && word.charAt(word.length()-1) == 'X' ) {
		      
		      System.out.println(word.substring(1,word.charAt(word.length()-1)));
		      
		    }else if(word.charAt(0) == 'X' && word.charAt(word.length()-1) == 'x'){
		      
		      System.out.println(word.substring(1,word.charAt(word.length()-1)));
		    }else if(word.charAt(0) == 'X'){
		      System.out.println(word.substring(1));
		    }else if(word.charAt(word.length()-1) == 'X'){
		      System.out.println(word.substring(0,word.charAt(word.length()-1)));
		    }else if(word.charAt(0) == 'x'){
		      System.out.println(word.substring(1));
		    }else if(word.charAt(word.length()-1) == 'x'){
		      System.out.println(word.substring(0,word.charAt(word.length()-1)));
		    }else{
		      System.out.println(word);
		    }
				

		    
		    

	}

}
