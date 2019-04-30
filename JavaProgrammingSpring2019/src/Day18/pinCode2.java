package Day18;
import java.util.*;
public class pinCode2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//give only 3 attemps
		//if attempts reaches more than 3 print card bloked
		int secretPincode = 4321;
		int pincode = 0;
		int attempts = 1;
		
		
             while(pincode != secretPincode && attempts <= 3) {
			
			System.out.println("Enter Pin code");
			pincode = s.nextInt();
			attempts++;
			if(attempts == 3 && pincode != secretPincode) {
				System.out.println("Card is block");
				return;//stop execution
			}
			}
			
			System.out.println("Access granted, select operation");
		
		
		

	}

}
