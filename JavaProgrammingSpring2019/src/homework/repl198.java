package homework;

import java.util.Arrays;

public class repl198 {

	public static void main(String[] args) {
		int[] ints1 = {1,1,1,1,1};
		int[] ints2 = {1,1,1,1,1};
		
		addElements(ints1,ints2);

	}
	 public static int[] addElements(int[] ints1, int[] ints2) {
	 	  
		  int[] nums = new int[ints1.length];
		   int result = 0;
		    for(int j=0;j<=4;j++) {
		    	nums[j] = ints1[j]+ints2[j];
					
				}
		    System.out.println(Arrays.toString(nums));
		    
			return nums;
		    
			
	  }
}
