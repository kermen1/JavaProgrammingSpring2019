package Day11;
import java.util.*;
public class TollCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your vecles Type: 1 or 2 " );
		
		int carType = keyboard.nextInt();
		
		System.out.println("Is it rush hour : yes | no");
		
		String answer = keyboard.next();
		
		//check if rushHour string is "yes" => assign true to isRushHours
		// if it is  "no"  , assign false to isRushHours
		
		
		
		
		
		boolean isRushHour;
		
		if(answer.equalsIgnoreCase("yes")) {
			isRushHour = true;
		}else {
			isRushHour = false;
		}
		
		System.out.println(isRushHour);
		double price = 0.0;
		if(carType == 1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price = 5.0;
			}
		}else if(carType == 2) {
			if(isRushHour) {
				price = 55.30;
			}else {
				price = 15.99;
			}
		}
		
		System.out.println("Toll cast: " + price);
		
		
		
		
		
		
		
		

	}

}
