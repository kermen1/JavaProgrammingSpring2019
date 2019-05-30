package homework;

import java.util.Arrays;

public class repl167 {

	public static void main(String[] args) {
		  //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	    
	
	  
	}  public static String uniqueChars(String str) {
		  
		  
		  
			
		    String newName="";
		    int i=0;
		    int l=str.length();
		    for(i=0;i<l;i++)
		        {
		           char ch1=str.charAt(i);
		            if(!(newName.indexOf(ch1)>-1))
		                {
		                    newName=newName + ch1;
		                }
		        }
		   
		  
		  
		return newName;
	 

	}

}
