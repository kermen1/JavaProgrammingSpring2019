package homework;

import java.util.Scanner;

public class repl152 {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
			  
		        int n = nums.length;
		  
		      for (int i = 0; i < n; i++) { 
		            int j; 
		            for (j = 0; j < n; j++) 
		                if (i != j && nums[i] == nums[j]) 
		                    break; 
		            if (j == n) {
		            	System.out.println(nums[i]);
		              
		        } 
		          
		       
		    } 
	}

}
