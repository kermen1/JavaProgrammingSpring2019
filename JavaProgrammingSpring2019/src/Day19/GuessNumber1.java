package Day19;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();//
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		//this will give us a number betwen 0 - 100
		int secretNumber = random.nextInt(101);
		int guessNumber;
		
		do {
			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber!= secretNumber);
		
		System.out.println("Bingo, you won!!!");
		
		

	}

}
