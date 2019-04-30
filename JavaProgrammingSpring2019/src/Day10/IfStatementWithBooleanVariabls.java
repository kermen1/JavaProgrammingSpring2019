package Day10;

public class IfStatementWithBooleanVariabls {

	public static void main(String[] args) {
		boolean isBreakTime = true;
		
		
		
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not break time yet.");
		}
		
		
		//second version
		
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("Not break time yet.");
		}
		
		
		boolean classTime = false;
		
		
		
		if(classTime) {
			System.out.println("come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("code and have fun!");
		}else {
			System.out.println("take a walk and same water.");
		}
		
		
		boolean qualified = false;
		
		//send a notification message if not qualified
		// we need to check if qualified variable  contains FASLSE
		//true
		
		
		if(qualified == false) {
			System.out.println("You application was not approved. Thank you");
			
			
		}else {
			System.out.println("You application was not approved. Thank you");
		}
		
		
	
		
		
		
		
		

	}

}
