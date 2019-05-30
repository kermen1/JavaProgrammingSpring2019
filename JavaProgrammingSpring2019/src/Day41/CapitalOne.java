package Day41;

public class CapitalOne {

	public static void main(String[] args) {
	
		BankAccount acc1 = new BankAccount();
		acc1.accountHolder = "Kermen Kursiniva";
		acc1.accountNum = 1234567;
		acc1.deposit(250);
		acc1.withdraw(100);
		acc1.showBalance();
		acc1.charge(50, "wooden spoon");
		acc1.showBalance();
		
		
		
		

	}

}
