package Day33_methodWithReturn;

public class CalculaterWithReturn {

	public static void main(String[] args) {
		

		
		
	}
	public static double multiply(double num1, double num2) {
		
		double result = num1*num2;
		return result;
	//return num1*num2;
	}
	
	public static double minus(double num1, double num2) {
		
		double sum1 = num1-num2;
		return sum1;
	}
	public static double divide(double num1, double num2) {
		if(num2==0) {
			System.out.println("ERROR: Cannot/by 0");
		return 0;
			//System.exit(0);// stop the whole code
		}else {
	    double sum2 = num1/num2;
	     return sum2;
		}
		
	}
}
//Method: multiply with return value
//Method: minus with return value
//Method: divide with return value