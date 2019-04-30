package day34_methods06;

import java.util.Arrays;

public class CountArray {

	public static void main(String[] args) {
   int[] nums = {2,3,4,5,6,7,8,12,5,5,5,};
   //1.with Print return rigth away
   System.out.println(findOccurences(nums,5));
    //2.assign return value into a variable
     int five=  findOccurences(nums,5);
     System.out.println("5 values : "+five);
     
     
     if(five>0) {
    	 System.out.println("We have  5s");
     }else {
    	 System.out.println("No 5s");
     }
     
     if(findOccurences(nums,2)>0) {
    	 System.out.println("we have 2s");
     }else {
    	 System.out.println("No 2s");
     }
     
     //create array and pass to method
   int twenty =  findOccurences(new int[] {10,2,20,20,30,45},20);
    System.out.println("twenty: "+twenty);
     

	}
	public static int findOccurences(int[]array,int value) {
		
		int counter=0;
	for(int num:array) {
		if(num == value) {
			counter++;
			
		}
	}
	
	return counter;
	
	
	
	}
	
	
}
