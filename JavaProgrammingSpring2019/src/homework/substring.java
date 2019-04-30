package homework;
import java.util.Scanner;
public class substring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		 char first = word.charAt(0);
			char last = word.charAt(word.length()-1);
		 
		
		
		System.out.print(last);
		System.out.print(word.substring(1,word.length()-1));
		System.out.print(first);
		
		
		
		

	}

}
