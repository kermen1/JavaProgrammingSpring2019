package Day41;

public class BankAccount {
     double balance;
     int accountNum;
     String accountHolder;
     
     public void deposit(double amount) {
    	 System.out.println("depositing $"+ amount+" to "+accountNum);
    	 balance +=amount;
     }
     
     public void withdraw(double amount) {
    	 System.out.println("withdrawing $"+amount+" from "+accountNum);
    	 balance+=amount;
    	 if(balance < 0) {
    		 balance -= 35;
    	 }
     }
     
     public void showBalance() {
    	 System.out.println("================================");
    	 System.out.println("accountHolder: "+ accountHolder);
    	 System.out.println("accountNumber: "+accountNum);
    	 System.out.println("Balance: $"+balance);
     }
     public void charge(double price, String item) {
 		if(balance >= price) {
			System.out.println("buying "+item + " for $"+price + " from "+accountNum);
			balance -= price;
		}else {
			System.out.println("insufficient funds to purchase " + item + " from " + accountNum);;
    	 }
     }
     
}
