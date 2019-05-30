package homework;

import java.util.ArrayList;
import java.util.Collections;

public class repl194 {

	public static void main(String[] args) {
		String check = "Nurses run";
		System.out.println(isPalindrome(check));
		System.out.println(isAnagram("java", "avaj"));

	}
	public static boolean isPalindrome(String check) {
	
     String rev ="";
     String check2 = check.toLowerCase();
     String check3 = check2.replace(" ","");
     
    int length = check3.length();

    for ( int i = length - 1; i >= 0; i-- ) {
       rev = rev +check3.charAt(i);
    }
    if (check3.equals(rev)) {
       return true;
    }
	return false;
	
	}
	public static boolean isAnagram(String word1, String word2) {
		
	
		int length1 = word1.length();
		int length2 = word2.length();
	    // String rev ="";
	    word1 = word1.toLowerCase();
	    word2 = word2.toLowerCase();
	   // word1 = word1.replace(" ","");
	  //  word2 = word2.replace(" ","");
	     ArrayList<String> w1 = new ArrayList<>();
	     ArrayList<String> w2 = new ArrayList<>();
	      
	     for ( int i =0; i<length1; i++ ) {
	    	 w1.add(" "+word1.charAt(i));
	     }
	    	 
	     for(int j = 0; j<length2;j++ ) {
	    	 
	    	 w2.add(" "+word2.charAt(j));
	     }
	     
	     Collections.sort(w1);
	     Collections.sort(w2);
	     
	     if(w1.equals(w2)) {
	    	 return true;
	     }else {
		return false;
	     }
	
	     
		
	     
	}
	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
