package Day12;
import java.util.*;
public class SwitchStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String operator;
		System.out.println("Enter first number: ");
	    double n1 = s.nextDouble();
	    
	    System.out.println("Enter second number: ");
	    double n2 = s.nextDouble();
	    
	    
	    System.out.println("Select Operation: +, -, *, /, %");
	     operator = s.next();
	     double result = 0.0 ;
	     
	     switch(operator) {
			case "+":
				result = n1 +  n2;
				System.out.println("Result:" + result);
				break;
			case "-":
				result = n1 - n2;
				System.out.println("Result:" + result);
				break;
			case "/":
				result = n1 / n2;
				System.out.println("Result:" + result);
				break;
			case "*":	
				result = n1 * n2;
				System.out.println("Result:" + result);
			case "%":	
				result = n1 % n2;
				System.out.println("Result:" + result);
				
		    default:
					System.out.println("Invalid operator selected: " + operator);
					break;
	    
		
		
	     }

	}

}
