package Day33_methodWithReturn;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		calculateAge(1989);	
		
		
		

	}
	public static int calculateAge(int year) {
		//Scanner scan = new Scanner(System.in);
		//year = scan.nextInt();
		int newYear = 2019;
		int total= newYear - year;
		if(total>=1 && total<=14) {
			System.out.println(total + " you are child");
		}else if(total>=15 && total<=25) {
			System.out.println(total + " you are youngster");
		}else if(total>=26 && total<=64) {
			System.out.println(total + " you are adult");
		}else if(total>=65) {
			System.out.println(total+ " you are senior");
		}
		return total;
	}
}
