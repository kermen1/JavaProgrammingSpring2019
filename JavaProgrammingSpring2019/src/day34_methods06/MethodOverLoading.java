package day34_methods06;

public class MethodOverLoading {

	public static void main(String[] args) {
		add(23,34);
		add("one","two");
		long l1 = 1235L;
		long l2 = 34567L;
		add(l1,l2);

		
		add(231.2,100);
	}
	public static void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Result: "+result);
	}
	
	public static void add(double num1, double num2) {
		double result = num1 +num2;
		System.out.println("result: "+result);
	}
	
	public static void add(String num1, String num2) {
		String result = num1 +num2;
		System.out.println("result: "+result);
	
	}
}
