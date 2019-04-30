package Day19;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test: ");
		
		String word =scan.next();
		String reversed = "";
		//loops through in reverse order and 
		// concetenate each character to reversed string
		int idx = word.length()-1;
		while(idx>=0) {
			
			reversed=reversed+word.charAt(idx);
			idx--;
		}
		System.out.println(reversed);
		//compare if and reversed are equal
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It is polindrome");
		}else {
			System.out.println("It is not polindrome");
		}

	}

}
