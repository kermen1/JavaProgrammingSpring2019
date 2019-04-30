package homework;

import java.util.Scanner;

public class repl130 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		  float[] score = new float[7];
		
		float difficulty;		
		
		
		for(int i = 0; i < 7; i++)
		{
			System.out.print("Enter the score of judge " 
								+ (i + 1) + ": ");
			score[i] = console.nextFloat();
			
			while(score[i] < 1 || score[i] > 10)
			{
				System.out.print("Enter the valid score of judge " 
									+ (i + 1) + ": ");
				score[i] = console.nextFloat();
			}
		}
		
		System.out.print("Please enter the difficulty level (1.2 - 3.8): ");
		difficulty = console.nextFloat();
		
		while(difficulty < 1.2 || difficulty > 3.8)
		{
			System.out.print("Please enter the valid difficulty level: ");
			difficulty = console.nextFloat();
		}
		
		
		float minimum = score[0];
		float maximum = score[0];
		float total = 0;
		
		for(int i = 0; i < 7; i++)
		{
			if(score[i] < minimum)
				minimum = score[i];
			
			if(score[i] > maximum)
				maximum = score[i];
			
			total = total + score[i];
		}
		
		total = total - maximum - minimum;		
		total = total * difficulty;
		total = (float) (total * 0.6);

		System.out.printf("Total: %.2f", total);
		
		
		
	}

}
