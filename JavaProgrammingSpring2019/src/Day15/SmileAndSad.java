package Day15;
import java.util.*;
public class SmileAndSad {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your emoji:");
		String smile = scan.next();
		
		
		switch(smile) {
		case ":)":
			System.out.println("Smile");
			break;
		case ":(":
			System.out.println("Sad");
			break;
		case ":/":
			System.out.println("Upset");
			break;
		case ":p":
			System.out.println("Playful");
			break;
		case ";)":
			System.out.println("Wink");
			break;
		default:
			System.out.println("Invalid emoji");
			return;
		}


		
		
		

	}

}
