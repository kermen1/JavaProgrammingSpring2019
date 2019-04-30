package homework;

import java.util.Scanner;

public class lookjava {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		    String word = scan.next();
		    	
				
				int count =0;
				for(int i = 0; i < word.length(); i++) {
					String temp = word.substring(i,i+4);
				
				
				
				
				if(temp.equals("java")) {
					count++;
				}
				
				
				}
				System.out.println(count);

	}

}
