package Day38_arrayList03;
import java.util.*;
public class EqualsMethod {

	public static void main(String[] args) {
		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();
		
		
		friends1.add("Roman");
		friends1.add("Natalia");
		friends1.add("Orhan");
		friends1.add("Kermen");
		friends1.add("Aleksa");
		
		friends2.add("Roman");
		friends2.add("Natalia");
		friends2.add("Orhan");
		friends2.add("Kermen");
		friends2.add("Aleksa");
		
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) {
			System.out.println("Same Friends");
		}else {
			System.out.println("Not Same Friends");
		}
		
		
		
		
		
		
		

	}

}
