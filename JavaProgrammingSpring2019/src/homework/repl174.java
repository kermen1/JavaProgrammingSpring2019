package homework;

public class repl174 {

	public static void main(String[] args) {
		String target = "Kermen";
		removeFirst(target);

	}
	public static String removeFirst(String target) {
	    
	    String s = target.substring(1,target.length());
	    System.out.println(s);
	    return s;
	}
}
