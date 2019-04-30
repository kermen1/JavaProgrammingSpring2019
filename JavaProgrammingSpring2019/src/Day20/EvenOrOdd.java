package Day20;

public class EvenOrOdd {

	public static void main(String[] args) {
		//if statements
		// using for loop: 1-100
		//1.print all even numbers in same line
		
		for(int n = 1; n<=100; n++) {
			if(n % 2 == 0) {
			System.out.print(n+" ");
			}
		}
		
		//2.print all odd numbers in same line
		for(int j = 1; j<=100; j++) {
			if(j % 2 != 0) {
			System.out.print(j+" ");
			}
		}
		
		//3.sumOfOdds, sumOfEvens - calculate them
		int sumOfEvets = 0;
		int sumOfOdds=0;
		for(int d = 1; d<=100; d++) {
			if(d % 2 == 0) {
				sumOfEvets +=d;
			}else {
				sumOfOdds +=d;
			}
			
			
		}
		System.out.println("Sum of evens: "+sumOfEvets);
		System.out.println("Sum of evens: "+sumOfOdds);
		//and print out after the loop
		//System.out.print(n+",");
		
		
		
		
		
		

	}

}
