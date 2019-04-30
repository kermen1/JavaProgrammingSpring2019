package Day33_methodWithReturn;

public class MethodWithReturn {

	public static void main(String[] args) {
		addVoid(20,10);
		//below line wil not work because addVoid does not
		//return a value . it just perform action
		//int  result = addVoid(5,1)
		//

		int result = add(4,8);
		System.out.println("Result - "+result);
		result = add(10,30);
		System.out.println("Result - "+result);
		
		
	}
		//1) method addVooid
		//return type: void
		//params: int num1, int num2
		//add them and print sum
		

	public static void addVoid(int num1,int num2) {
		int sum  = num1 + num2;
		System.out.println("Sum - "+sum);
		
	}
		//2)method name : add
		//return type: int
		//params: int num1. int num2
		//add them and return the sum
	public static int add( int num1, int num2) {
		int sum = num1 + num2;
		return sum;
		
	}

}
