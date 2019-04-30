package Day24;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		//Let's create an array of integers with length 3
		
		int[] numbers = new int[3];
		//first value in array
		numbers[0] =  5;
		//second value in array
		numbers[1] = 10;
		//third value in array
		numbers[2] = 20;
		//[I@33909752] this is a hash code
		System.out.println(numbers);
		// toString() from arrays class can help as to print an array as a string 
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		//please use for loop, in order to loop through the array
		//and calculate sum of all elemants
		//numbers.length--> returns number of elements in the array
		
		for(int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
			
			}
		System.out.println("Sum: "+sum);
		//find largest value in the array
		
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<numbers.length;i++) {
			
		if(numbers[i]> max) {
			max = numbers[i];
		}
		}
		System.out.println("Max value:" +max);
		
		//Find min value in the array
		//int min = 0;
		int min = Integer.MAX_VALUE;
		for(int k = 0;k<numbers.length;k++) {
			
		if(numbers[k]< min) {
			min = numbers[k];
		}
		}
		System.out.println("Min value:" +min);
		
		

	}

}
