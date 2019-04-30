package homework;

import java.util.Arrays;
import java.util.Scanner;

public class repl125 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
			
			int len = nums.length*2;
		int[] dubsArr = new int[len];
		dubsArr[len-1] = nums[nums.length-1];
		System.out.println(Arrays.toString(dubsArr));
		return;

		
		
	}

}
