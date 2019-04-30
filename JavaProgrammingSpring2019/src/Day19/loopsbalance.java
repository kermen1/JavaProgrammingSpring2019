package Day19;
import java.util.Scanner;
public class loopsbalance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double balance;
		int s1;
		
		
		System.out.println("What is your balance?");
		balance = scan.nextDouble();
		int count = 0;
		
		
		while(balance>0) {
			count++;//+1
	    System.out.println("What is transaction #"+count+" amount?");	
	    double transaction = scan.nextDouble();
	    if(transaction>balance) {
	    	System.out.println("You balance is to be negative due to this transaction ");	
	    	continue;//go on top of loop right away
	    }
	    balance = balance - transaction;
	    
		}
		
		System.out.println("Balance is "+balance);	
		System.out.println("Transaction total: "+count);

	}

}
