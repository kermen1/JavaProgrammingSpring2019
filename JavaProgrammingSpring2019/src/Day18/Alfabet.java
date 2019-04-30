package Day18;

public class Alfabet {

	public static void main(String[] args) {
		
		
		//char letters = 'a';
		
		//while(letters <='z') {
		//	System.out.println(letters);
			//letters++;
		//}
		
		char capitals = 'A';
		
		while(capitals <='Z') {
		//	System.out.print(capitals+", ");
			capitals++;
		}
		
		//can u print lowercase in reverse
		
		
		char capitals1 = 'z';
		while(capitals1 >='a') {
			
		//System.out.print(capitals1+", ");
		capitals1--;
		}
		
		/*
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 */
		
	//	String letters = "";
	// = letters+ 'A';
	//	System.out.println(letters);
		
	//	letters = letters+ 'B';
	//	System.out.println(letters);
		
	//	letters = letters+ 'C';
	//	System.out.println(letters);
		
	//	letters = letters+ 'D';
	//	System.out.println(letters);
		
	//	letters = letters+ 'E';
	//	System.out.println(letters);
		
	//	letters = letters+ 'F';
	//	System.out.println(letters);
		

		String letters1 = "";
		char myLetters = 'A';
		while(myLetters <='Z') {
			letters1 = letters1 + myLetters;
			System.out.println(letters1);
			myLetters++;
			
		}
		
		
		
		

	}

}
