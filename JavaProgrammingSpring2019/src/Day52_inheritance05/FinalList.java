package Day52_inheritance05;
import java.util.*;
public class FinalList {
	
     final static public String COLOR = "Pink";
     //public -> access modifier
     // final , static -> non-access modifier
     
	public static void main(String[] args) {
		ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");

		System.out.println(COLORS.toString());
		COLORS.add("BLACK");
		System.out.println(COLORS.toString());
		
		COLORS = new ArrayList<>();// new object
		System.out.println(COLORS.toString());
		COLORS.add("Yellow");
		
		
	}

}
