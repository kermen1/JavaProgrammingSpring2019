package Day33_methodWithReturn;

import Day31.Calculator;

public class CalcTests {

	public static void main(String[] args) {
		System.out.println(CalculaterWithReturn.minus(3, 1));
		System.out.println(CalculaterWithReturn.multiply(5,6));
		System.out.println(CalculaterWithReturn.divide(24,6));
		
		
		int addResult =MethodWithReturn.add(21,  41);
		double mResult = CalculaterWithReturn.multiply(50, 60);
		double miResult = CalculaterWithReturn.minus(50,45);
		double dResult = CalculaterWithReturn.divide(455,6);
		
		System.out.println("result for add - "+addResult);
		System.out.println("result for multiply - "+mResult);
		System.out.println("result for minus - "+miResult);
		System.out.println("result for divide - "+dResult);
		
		double[] dNums = {2.0,4,0};
		double result2 = CalculaterWithReturn.multiply(dNums[0],dNums[1]);
		System.out.println("result - "+result2);
		
		if(MethodWithReturn.add(10, 16) == 26) {
			System.out.println("Add Unit Test Passed");
		}else{
			System.out.println("Add Unit test failed");
		}
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not 4 characters");
		}
		
		
		
		
		
		
		
	}

}
