package Day36_WrapperClasses;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		//Create an arraylist
		String[] str = new String[5];
		ArrayList <String> names = new ArrayList<>();
		int[] numsarray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		//assing value into arrayList
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");	
		
		
		nums.add(100);
		nums.add(99);
		nums.add(610);
		nums.add(610);
		//read from ArrayList
		
		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		
		
		System.out.println("Names count:"+ names.size());
		System.out.println("Nums count:"+ nums.size());
		
		
		
		
		
		
		
		

	}

}
