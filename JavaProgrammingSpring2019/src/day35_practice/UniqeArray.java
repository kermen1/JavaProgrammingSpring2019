package day35_practice;

import java.sql.Array;
import java.util.Arrays;

public class UniqeArray {

	public static void main(String... string) {
		int[] nums = {7,4,1,4,1,5,9,9,3};
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++) {
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for(int j = 0; j < nums.length; j++) {//inner/nested loop
				if(nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter == 0) {//is it still 0. then it is unique
				System.out.println(temp);
			}
			
		}
		
	}

}
