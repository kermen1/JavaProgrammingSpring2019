package Day08;
import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		/*
		 program to tell if you are eligible to vote.
		 votingAge =18
		 yourAge = take from scanner
		 if you are eligible to vote.
		 you are eligible to vote.
		 you have been eligible for 3 years
		 else
		  you are not eligible to vote
		  you still have 3 more years  to go
		 */
		Scanner scan = new Scanner(System.in);
		
		int votingAge = 18;
		System.out.println("Enter your age");
		
		int yourAge = scan.nextInt();
		int years = yourAge - votingAge;
		if(votingAge <= yourAge) {
			
			System.out.println("You are eligible vote.");
			System.out.println("You have been eligible for "+years+" years");
		}else {
			//int moreYears = votingAge - yourAge;
			System.out.println("You are not eligible vote.");
			System.out.println("You still have "+years+" more years to go");
		}
		
		//System.out.println("You still have "+(-years)+" more years to go");
		
		
		

		
		
	}

}
