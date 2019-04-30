package Day09;
import java.util.*;
public class Kanada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String capital;
		String capital2;
		
		System.out.println("What is the capital of Canada?");
		
		capital = scan.nextLine();
		
		
		if(capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("Your anser is correct!");
		}else {
			System.out.println("Your anser is incorrect! "+capital+" is not capital of Canada");
		}
		
		
		
		
		
		
	//	if(capital.equals("Ottawa")) {
	//		System.out.println("Your anser is correct!");
	//	}else {
	//		System.out.println("Your anser is incorrect! "+capital+" is not capital of Canada");
	//	}
		
		

	}

}
