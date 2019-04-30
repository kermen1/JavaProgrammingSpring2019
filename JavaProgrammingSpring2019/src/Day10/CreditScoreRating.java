package Day10;
import java.util.*;
public class CreditScoreRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int creditScore = 800;
		
		//exellent => 750-800 range
		
		
		System.out.println("Enter your score: ");
		
		if(creditScore >= 750 && creditScore <= 800) {
		
		System.out.println("Exellent!");
		}else if(creditScore >= 700 && creditScore <= 749) {
			System.out.println("GOOD");
		}else if(creditScore >= 650 && creditScore <= 699) {
			System.out.println("Fair");
		}else if(creditScore >= 550 && creditScore <= 649)
		{
			System.out.println("poor");
		}else if(creditScore >= 0 && creditScore <= 549) {
			System.out.println("Bad");
		}else {
			System.out.println("Invalid score");
		}
		

	}

}
