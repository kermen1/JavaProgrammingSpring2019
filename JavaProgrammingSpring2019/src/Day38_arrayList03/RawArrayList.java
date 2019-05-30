package Day38_arrayList03;
import java.util.ArrayList;
public class RawArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(534357287);
		list.add(234.5);
		list.add(true);
		list.add(false);
		
		
		System.out.println(list);// automatically call toString()
		
		String allValues = list.toString();
		System.out.println(allValues);
		
	      String str = list.get(0).toString();
		System.out.println(str);
		Integer i = (Integer) list.get(2);//dowcasting
		System.out.println(i);
		
		//all value are stopped as a raw type. We can also call it,
		//as a General Object type
		
		
		
		
		
		
		
		
		
		

	}

}
