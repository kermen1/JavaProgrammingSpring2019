package homework;

import java.util.Arrays;
import java.util.Scanner;

public class repl124 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] num = new int[size];
			for(int i =0; i < size; i++) {
				num[i] = scan.nextInt();
			}
		
		int[] front;
		if(num.length >= 2)
		{
			front = new int[2];
			front[0] = num[0];
			front[1] = num[1];
			System.out.println(Arrays.toString(front));
		}
		else if(num.length == 1)
		{
			front = new int[1];
			front[0] = num[0];
			System.out.println(Arrays.toString(front));
		}
		else
			front = new int[0];
		//System.out.println(Arrays.toString(front));
		return;
		

	}

}
