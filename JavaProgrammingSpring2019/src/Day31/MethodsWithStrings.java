package Day31;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		countWords("Java is fun");
		countWords("This is the method with strings");
		googleSearchiResults("About 121,000,000 results (0.75 seconds)");

	}public static void countWords(String sentence) {
		
		String[] words = sentence.split(" ");
		System.out.println("Wprds in this sentence "+(Arrays.toString(words)));
		System.out.println("number of words: "+words.length);
		
		
		
		
		
		
		
	}public static void googleSearchiResults(String result) {
		//split by space into array
		String[] words= result.split(" ");
		
		String count = words[1].replace(",", "");
		
		String seconds = words[3].replace("(", "");
		
		System.out.println("Results count: "+count);
		System.out.println("time  in second: "+seconds);
		
	}

}
