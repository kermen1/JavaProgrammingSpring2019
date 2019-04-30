package Day08;
import java.util.Scanner;
public class IfElseWithScanner {

	public static void main(String[] args) {
		// passingPercentage = 65;
		// yourScorePercentage = take from scanner
		//check if you passed or failad
		Scanner scan = new Scanner(System.in);
		
		int passingPercentage = 65;
		
		System.out.println("Enter your score?");
		
		int yourScorePercentage = scan.nextInt();
		
		
		if(grade == 'A') {
			System.out.println("Excellent Job! Keep it up!");
		}else {
			System.out.println("Your grade "+grade+" is not good enough.");
			System.out.println("How many points did you miss for 'A'?");
			int points = scan.nextInt();
			System.out.println("You could earn " +points+ " more points if you studied harder.");
		}

		System.out.println("#### END OF PROGRAM ####");

	}

}
