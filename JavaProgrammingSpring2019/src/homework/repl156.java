package homework;

import java.util.Scanner;

public class repl156 {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
		    printUniqueWords(words);
		  }	
		
		
		
	
public int  count_appearance(String[] arr,String t) {
	   int count = 0;

	    for (int i = 0; i < arr.length; i++)
	    {
	      

	        if (t == arr[i])
	        {
	        	
	            count++;
	        }
	    }
System.out.println(count);
	    return count;
	    
	}
	  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
		    
		       int count = 0;

		    for (int i = 0; i < words.length; i++)
		    {
		        String currentInt = words[i];

		        if (currentInt == words[i])
		        {
		          System.out.println(currentInt);
		            count++;
		        }
		    }

		  
		}
		    
		    
		    
		    
		    
		    
		    
		    
		  
		}

