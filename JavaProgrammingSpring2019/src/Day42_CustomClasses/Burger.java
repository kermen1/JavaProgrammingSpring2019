package Day42_CustomClasses;
import java.util.*;
public class Burger {

	public static void main(String[] args) {
		 Burger7 burger1 = new Burger7();
	        burger1.name = "COWBOY";
	        String[] ings = {"onion crisps", "american cheese", 
	                       "pickles", "lettuce", "b7 sauce"};
	        burger1.ingredients = ings;

	        
	        
	        System.out.println(burger1.name);
	        System.out.println(Arrays.toString( burger1.ingredients));
	        //print first ingredients
	        System.out.println(burger1.ingredients[0]);
	        //print all ingredients using a loop
	        for (String ingr :burger1.ingredients) {
	            System.out.print(ingr +", ");
	        }
	}

}
