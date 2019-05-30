package Day52_inheritance05;

public class FinalMethods {
   public final void method1() {
	   System.out.println("Final method 1");
   }
}

class Sub extends FinalMethods{
	//cannot override since it is a final method.
	
	// public void method1() {
	//	   System.out.println("Overrided method 1");
	//   }
	public void method1(String str) {
		System.out.println("Overrided mrthod 1 ");
	}
	
	public static void staticMethod(String word) {
		
	System.out.println("staticMethod: "+ word);
	}
}




