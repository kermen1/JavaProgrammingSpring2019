package homework;

import java.util.Arrays;

public class repl167 {

	public static void main(String[] args) {
		  //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
		  
		  
		  
			
		  int count = 0;

		    for (int i = 0; i < str.length(); i++) {
		     
		      for(int j = 0; j<str.length();j++){
		        if(str.charAt(i) == str.charAt(j)){
		        	
		          count++;
		        }
		      }
		    if(count==1){
		      System.out.println(str.charAt(i));
		    }
		    count = 0;
		}
		  
		return str;
	 

	}

}
