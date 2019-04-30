package homework;

import java.util.Scanner;

public class TwiceLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String str=scan.next();
		 int n = scan.nextInt();
		 String prefix = str.substring(0, n);
		    int length = str.length();
		    boolean result = false;
		    if (n < str.length() && (str.substring(1)).indexOf(str.substring(0,n)) > -1) {
		        result = true;
		        System.out.println(result);
		    }else {
		   result = false;
		   System.out.println(result);
		    
		    }
		}

	}


