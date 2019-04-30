package MentoringSession;

import java.util.Scanner;

public class Kermen {

	public static void main(String[] args) {
		
		    
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	     int i, j; 
	        System.out.println("Repeated Elements are :"); 
	        for (i = 0; i < nums.length; i++)  
	        { 
	            for (j = i + 1; j < nums.length; j++)  
	            { 
	                if (nums[i] == nums[j])  
	                    System.out.print(nums[i] + " "); 
	            } 
	        } 
	    } 
	  
	 //   public static void main(String[] args)  
	    { 
	//        RepeatElement repeat = new RepeatElement(); 
	    //    int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
	    //    int arr_size = arr.length; 
	    //    repeat.printRepeating(arr, arr_size); 
    
	}

}
