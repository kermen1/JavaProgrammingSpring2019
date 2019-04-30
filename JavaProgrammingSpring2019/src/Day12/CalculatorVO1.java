package Day12;
import java.util.*;
public class CalculatorVO1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
	    
	    
	    String operator;
	    
	    //get numbers
	    
	    System.out.println("Enter first number: ");
	    double n1 = s.nextDouble();
	    
	    System.out.println("Enter second number: ");
	    double n2 = s.nextDouble();
	    //get operator
	    System.out.println("Select Operation: +, -, *, /, %");
	     operator = s.next();
	     double result = 0.0;//
	     
	     //perfom canculation and display 
	     
	     if(operator.equals("+")) {
	    	 result = n1 + n2;
	    	 
	     }else if(operator.equals("-")) {
	    	 result = n1 - n2;
	    	 
	     }else if(operator.equals("*")) {
	    	 result = n1 * n2;
	    	 
	     }else if(operator.equals("/")) {
	    	 result = n1 / n2;
	    	 
	     }else if(operator.equals("%")) {
	    	 result = n1 % n2;
	     }else {
	    	 System.out.println("Invalid operator selected: " + operator);
	    	 return;// do not execute  the remaining code. STOP HERE
	     }
	    
	    
	     System.out.println("Result: " + result);
		
		
		

	}

}
