package Day37;

import java.util.ArrayList;

public class MyCiies {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Elista");
		cities.add("Dushambe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		
		//print each city using for each loop separated by space
		for(String city: cities) {
			System.out.print(city+ " ");
		}
		System.out.println();
		//print each city using for loop, separated by space
   for(int i =0 ; i< cities.size(); i++) {
	   System.out.print(cities.get(i)+" ");
   }
   
   //remove Baku
   System.out.println("Removing Baku");
   cities.remove("Baku");
   System.out.println(cities.toString());
   
   //isEmty?
   System.out.println("Is list empty? "+cities.isEmpty());
   
   cities.add(0, "Bishkek");
   
   System.out.println(cities.toString());
   
   cities.add(1, "Istanbul");
   System.out.println(cities.toString());
   
   
   
   cities.set(2,"Seoul");
   System.out.println(cities.toString());
   
   //find sterling in the list and give the index
   int idx = cities.indexOf("Sterling");
   System.out.println("Sterling index: "+idx);
   
   cities.set(idx,"Zagreb");
   
   System.out.println(cities.toString());
   
   cities.clear();
   boolean empty = cities.isEmpty();
   System.out.println("empty: "+empty);
   
   
   
   
	}

}
