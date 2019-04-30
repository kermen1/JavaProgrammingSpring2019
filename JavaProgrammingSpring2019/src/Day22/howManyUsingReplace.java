package Day22;

public class howManyUsingReplace {

	public static void main(String[] args) {
		
		String word = "including webpages, images";
		
		//find how many e characters in the word
		//get the length of word
		//replace all e with empty
		//get the length of word without e
		
		
		int length1 = word.length();
		word = word.replace("e","");
		int length2 = word.length();
		
		System.out.println("Length: "+length1);
		System.out.println("Length: "+length2);
	
		
		int count = length1-length2;
		
		System.out.println("Count of E:"+count);
		
		
		
		

	}

}
