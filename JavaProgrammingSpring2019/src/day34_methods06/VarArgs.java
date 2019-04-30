package day34_methods06;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		
		printWords("red","blue","white");
		
		printWords("grey");
		
		printWords();
		
		System.out.println(sum(3,4,7,66,2));
		int budget =200;
		if(sum(10,45,110,30)<=budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		cook("Burrito Bowl", "Rice", "Meat","Sour Cream","Cheese");
		cook("Avocado Toast","Avocado","eggs", "Bread");
		shoppingList (1000, "Avocado Toast","Swatch","Shoes","phone");
		
	}
	
	public static void printWords(String... words) {
		
		//handle it like an ARRAY
	for(String w : words) {
		System.out.println(w);
	}
		
	}
	// sum(10,30,40);=> 80
	
	public static int sum(int... nums) {
		int sum = 0;
		for(int n: nums) {
			sum += n;
		}
	
		return sum;
		
	}
	public static void cook( String name,String... ings ) {
		System.out.println("Food: "+name);
		System.out.println(Arrays.toString(ings));
		
		
	}
	public static void shoppingList (int totalPrice, String... items ) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}
	
}
