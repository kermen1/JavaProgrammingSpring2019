package Day38_arrayList03;
import java.util.*;
public class MethodSummary {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//add method to add a value
		list.add("Red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");
		//add method with index: "yelow will be placed to index o"
		list.add(0,"yellow");
		//toString method to print  all value in same line
		System.out.println(list.toString());
		//size method.return number of values
		System.out.println("Number of elements: "+list.size());
		//get method . retudn value from index
		System.out.println("3: "+ list.get(3));
		System.out.println("0: "+ list.get(0));
		
		//remove ising index. removes value from index position
		list.remove(0);//removes yellow
		System.out.println(list.toString());
		//remove using value/element. removes element first accurentce
		list.remove("blue");//remove blue
		System.out.println(list.toString());
		//set(index, value) replace certain index with new value
		list.set(0,"orange");//red will be replaced by orange
		System.out.println(list.toString());
		//ondexOf(value).returns index of value in the list
		
		System.out.println("grey: "+list.indexOf("grey"));
		System.out.println("green: "+list.indexOf("green"));
		
		//isempty() returmn true if list empty.size == 0
		
		System.out.println("is list Empty? - "+ list.isEmpty());
		System.out.println("is list Empty? - "+ (list.size() == 0));
		
		//Contains(elem) ==> returns true if value is present
		
		System.out.println("whire in list? - "+ list.contains("white"));
		
		List<String> list2 = new ArrayList<>();
		
		//Addail -> adds all value from one list into another
		
		list2.addAll(list);
		System.out.println("list2: "+ list2.toString());
		
		//CONTAINS ALL. check if list has all values of  another list
		
		System.out.println("containsAll: "+list.containsAll(list2));
		
		//EQUALS(list) check if 2 lists are exactly equal
		
		System.out.println("equals: "+ list.equals(list2));
		
		list2.add("pink");
		
		//REMOVEALL(list). removea all matching values from your list that  are in other
		
		list2.removeAll(list);
		System.out.println("list2 after removeAll: "+list2);
		System.out.println("list: "+ list);
		
		
		//ADDALL(index, list) adds a new list values starting from given index
		
		list2.addAll(0, list);
		
		System.out.println("list2 after list2.addAll(0, list): "+list2);
		
		
		
		
		
		
		

	}

}
