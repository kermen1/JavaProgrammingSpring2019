package Day31;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		countUp(5);//num = 5;
		countUp(10);//num = 10;
		countDown(5);

	}public static void countUp(int num) {
		 /* 1) name: countUp
	        return type : void
	        param: int
	       it prints from 1 to the value of the param
	      countUp(5);	
		*/
		if(num<1) {
			System.out.println("Invalid input" + num);
		}else {
		for(int i =1;i<= num;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		}
		
		
	}public static void countDown(int num2) {
		if(num2==0) {
			System.out.println("Invalid input"+num2);
		}else {
		for(int j = num2; j>0; j--) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		}
	}

}
