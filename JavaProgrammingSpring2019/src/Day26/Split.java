package Day26;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		
		String[] wordsArray = words.split(",");
		System.out.println("Count: "+wordsArray.length);
		
		System.out.println(wordsArray[0]);
		
		System.out.println(Arrays.toString(wordsArray));
		
		//for(String word : wordsArray) {
		//	System.out.println(word);
	//	}
		
		String diceREsult = "1-20 of 1,461 positions";
		//using split method , print 1,462
		//String[] diceArray = diceREsult.split(" ");
		//System.out.println("Search result total: " + diceArray[4]);
		
		//String[]diceArray2 = diceREsult.split("of");
		//System.out.println(diceArray2[0].trim());
		//System.out.println(diceArray2[1].trim());
		
		String senten = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = senten.split(" ");
		String[] happySplit =senten.split("happy");
		String[] ISplit = senten.split("I");
		
		for(String w: allWords) {
			System.out.println(w);
		}
		
		System.out.println("AFTER HAPPY SPLIT");
		for(String w:happySplit) {
			System.out.println(w);
		}
		//              
		String word = "java";
		char[] charArray = word.toCharArray();
		for(char ch:charArray ) {
			System.out.println(ch);
		}

	}

}
