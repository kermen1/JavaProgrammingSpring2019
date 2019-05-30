package Day37;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("showel");
		
		
		//print number of items
		int count = shoppingList.size();
		System.out.println("Total count: "+count);
		
		//print all items in single line
		
		System.out.println(shoppingList.toString());
		
		//print first and last item in single line
		
		System.out.println(shoppingList.get(0));
		System.out.println(shoppingList.get(count-1));
		
		
		
		shoppingList.remove("paper towel");
		
		System.out.println(shoppingList.toString());
		
		shoppingList.remove("showel");
		
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		
		System.out.println(shoppingList.toString());
		
		//FOR each loop can be used only for reading
		//we cannot 
		for(String item: shoppingList) {
			System.out.println(item);
		}
		
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
