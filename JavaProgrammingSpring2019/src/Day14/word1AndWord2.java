package Day14;
import java.util.*;
public class word1AndWord2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String word1,word2;
		
		System.out.println("Enter 2 words ");
		  word1 = keyboard.next();
		  word2 = keyboard.next();
		
		  if(word1.length() >= word2.length()) {
				System.out.println("word1Value is longer");
			}else if(word2.length() >= word1.length()){
				System.out.println("word2Value is longer");
			}else {
				System.out.println(word1+" and "+word2+ " are same length");
			}
		
		
		

	}

}
