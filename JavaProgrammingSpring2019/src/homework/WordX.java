package homework;

import java.util.Scanner;

public class WordX {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
		
		String newWord = "";
		
		   
		
		  for (int i = 0; i < count; i++) {
		
		    if (i < count-1)
		      newWord += word + separator;
		    else
		   newWord += word;
		  }
         System.out.println(newWord);
		
		}


	}


