package homework;

import java.util.Scanner;

public class repl166 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = "Sagira";
		String b = "12345";
		 mergeStrings(a,b);
		

	}
	
	public static String mergeStrings(String a, String b) {
		
		
		
		
		String str = "";
	    int len = 0;

	    if (a.length() >= b.length())
	    {
	        len = a.length();
	    } else {
	        len = b.length();
	    }
	    for (int i = 0; i < len; i++)
	    {

	        if (i < a.length())
	        {
	            str += a.charAt(i);
	        }

	        if (i < b.length())
	        {
	            str += b.charAt(i);
	        }

	    }
	    System.out.println(str);
	    return str;
	}
}

