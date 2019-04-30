package Day21;

public class UniqueCharacters {

	public static void main(String[] args) {
		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		System.out.println(unique.indexOf(ch));
		if(!unique.contains(""+ch)) {
			unique += ch; //unique = unique + ch;
		}
		
		System.out.println("Unique:"+unique);
		///=================================================
		
		String word2 = "bananas";
		String unique2 ="";
		
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ch2);
		
		i = 1;
		ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ch2);
		
		i++;
		ch2 = word2.charAt(i);
		System.out.println("Ch2: "+ch2);
		
		//check if ch2 is in the unique2 variable
		
		
		
		

	}

}
