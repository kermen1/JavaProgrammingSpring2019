package Day50_inheritance03;

public class FullTimeEmployee extends Employee{
 @Override// check methods is overriding 
	 public void calculatePay(int hours, double rate) {
		 double total = (hours*rate)*1.05;
	    	System.out.println("FullTime employee total pay: " + total);
	    }
	
}
