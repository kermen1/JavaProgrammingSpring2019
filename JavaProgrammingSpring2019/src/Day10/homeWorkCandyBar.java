package Day10;
import java.util.*;
public class homeWorkCandyBar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int coupons,numCandyBars,numGumballs;



         System.out.print("Enter number of coupons: "); 
            coupons = scan.nextInt(); 

          
                if(coupons<3) {
                	System.out.print("Not enough coupons"); 
                }else {
                	numCandyBars = coupons / 10; 
                    coupons = coupons % 10;
                numGumballs = coupons / 3;
                    coupons = coupons % 3;
                	
                	System.out.println("Number of Candies: " +numCandyBars);
                	System.out.println("Number of Candies: " +numGumballs);
                }
                
          
		
		
		
		
		
		
		
		
		


	}

}
