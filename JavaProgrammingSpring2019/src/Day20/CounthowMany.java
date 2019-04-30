package Day20;

public class CounthowMany {

	public static void main(String[] args) {
		//word
		//char to count the number of occurences
		String word = "computer programming";
		char myChar = 'a';
		
		int counter = 0;
		
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)== myChar) {
				counter++;
				
			}
		}
		
		System.out.println(counter);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
