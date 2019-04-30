package Day32CustomMethod;

public class MethodWithReturn {

	public static void main(String[] args) {
		
		giveMe10$();
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i - "+i);
		System.out.println(giveYourName());
	
     /*
      * this method ,retuns int value
      * 
      */
	}public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
		
		
	}
	/*
	 * giveMeYourName()
	 * return type : String
	 * Declare name variable and assign your name
	 * then return it. Call in method 
	 */
	public static String giveYourName() {
		String name = "Kermen";
		return "Kermen";
		
		
		
	}
}
