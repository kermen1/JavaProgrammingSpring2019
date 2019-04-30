package Day21;

import java.util.Scanner;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word");
		String word = scan.next();
		String unique = "";
		for(int i = 0; i < word.length(); i++) {
			//read the letter and assign
			char letter = word.charAt(i);
			//System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique += letter;// add to unique
			}
		}
		System.out.println(unique);
		
		
		
		
		//for(int i = 0; i < word.length(); i++) {
	//		System.out.println(i);// print i. it increaces 
	//		System.out.println(word.charAt(i));
	//	}

	}

}
