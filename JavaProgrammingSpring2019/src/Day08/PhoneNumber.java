package Day08;
import java.util.Scanner;
public class PhoneNumber {

	public static void main(String[] args) {
		
		int areaCode,localNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your area code:");
		
		areaCode = scan.nextInt();
		
		System.out.println("Enter Local Number:");
		
		localNumber = scan.nextInt();
		
		//(303)-2364587
		
		String phoneNumber = "(" +areaCode+ ")-" +localNumber;
	    
		System.out.println("Calling number:" +phoneNumber);
		
		
		
		

	}

}
