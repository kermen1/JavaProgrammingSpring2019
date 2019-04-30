package day34_methods06;

import java.util.Arrays;
import java.util.Random;

public class getArray {

	public static void main(String[] args) {
System.out.println(Arrays.toString(getArray()));
//System.out.println(Arrays.toString(CountArray.getArray()));
//store return value into array
//int[] nums = CountArray.getArray();
//System.out.println(Arrays.toString(nums));

//for(;;) { //while(true) ==> both are infinite loop
//System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
//}
//int[] randomNums = CountArray.getRandomArray(3);
//System.out.println(Arrays.toString(randomNums));

	}
	
	public static int[] getArray() {
		
		int[] retArray = {45,43,11,545,1000};
		
		
		
		
		return retArray;
		
	}
	
	public static int[] getRandomArray(int size) {
		
		Random num = new Random();
		int[] retArray = new int[size];
		int i = 0;
		while (i<size) {
		retArray[i] = num.nextInt(101);
		i++;
		}
		return retArray;
		
		
		
		

	
	}
}
