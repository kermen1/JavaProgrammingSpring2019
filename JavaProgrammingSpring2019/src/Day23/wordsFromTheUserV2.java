package Day23;

import java.util.Scanner;

public class wordsFromTheUserV2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		String word = "";
		
		for (int i = 0; i <6; i++) {
			System.out.println("Enter a word:");
			word = scan.next();
			if(word.equalsIgnoreCase("java")) {
				continue;
			}
			//result += word + ", ";
			result += ", " + word;
			
			if(i == 5) {
				result = result.substring(2) + ".";
				//result = result.substring(0, result.length()-2) + ".";
			}
			
			
		}
		System.out.println(result);
		

	}

}
