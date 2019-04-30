package Day20;
import java.util.Scanner;
public class MultTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		//check if it is valid
		//if it not valid return
		//num = 0
		if(num < 1 || num > 10) {
			System.out.println("Invalid input!");
			return;//stop execution here
			//System.exit(0): stop too
		}
		
		//for loop to print multiplication table
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+" x "+i+ " = "+num*i);
			
		}
	}

}
