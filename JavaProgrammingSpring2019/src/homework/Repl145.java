package homework;

import java.util.Scanner;

public class Repl145 {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	}

	private static void plus_minus(int[] arr) {
		  int fractionPositive = 0;
	       int  fractionZero = 0;
	       int fractionNegative = 0;
	        
	        for(int i =0;i<arr.length;i++) {
	            if (arr[i] > 0) fractionPositive += 1;
	            else if (arr[i] == 0) fractionZero += 1;
	            else if (arr[i] < 0) fractionNegative += 1;
	        
	        }
	        System.out.println("positives: "+fractionPositive);
	        System.out.println("negatives:"+fractionNegative);
	        System.out.println("zeros:"+fractionZero);
	        
		
	}

}
