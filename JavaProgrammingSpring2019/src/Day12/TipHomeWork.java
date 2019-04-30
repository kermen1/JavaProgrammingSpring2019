package Day12;
import java.util.*;
public class TipHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int NumberOfPeople;
	     double TotalBillAmount,Tip,PerPerson,TipPerPerson;
	     String Service, split, people = "";
	     
	     Scanner s = new Scanner(System.in);
	     
	     System.out.println("Split:");
	     split = s.nextLine(); 
	     System.out.println("Number of people:");
	     NumberOfPeople = s.nextInt();
	     if (NumberOfPeople == 1) {
	    	 people = "&";
	     }else if(NumberOfPeople == 2) {
	    	 people = "&&"; 
	     }else if(NumberOfPeople == 3) {
	    	 people = "&&&";
	     }else if(NumberOfPeople == 4) {
	    	 people = "&&&&";
	     }else if(NumberOfPeople == 5) {
	    	 people = "&&&&&";
	     }else if(NumberOfPeople == 6) {
	    	 people = "&&&&&&";
	     }else if(NumberOfPeople == 7) {
	    	 people = "&&&&&&&";
	     }else if(NumberOfPeople == 8) {
	    	 people = "&&&&&&&&";
	     }else if(NumberOfPeople == 9) {
	    	 people = "&&&&&&&&&";
	     }else if(NumberOfPeople == 10) {
	    	 people = "&&&&&&&&&&";
	     }
	     System.out.println("Check amount:");
	     TotalBillAmount = s.nextDouble();
	     System.out.println("Service Quality:");
	     Service = s.next();
	     
	      switch(Service) {
				case "Poor":
					if (split.equalsIgnoreCase("yes")) {
					Tip = TotalBillAmount * 0.05;
					TotalBillAmount = TotalBillAmount + Tip;
					PerPerson = TotalBillAmount/NumberOfPeople;
					TipPerPerson = Tip/NumberOfPeople;
					System.out.println("Number of people entered: " + people);
					System.out.println("Total to pay:" +TotalBillAmount);
					System.out.println("Total tip:" +Tip);
					System.out.println("Total per person:" +PerPerson);
					System.out.println("Total per person:" +TipPerPerson);
					}else {
						Tip = TotalBillAmount * 0.05;
						TotalBillAmount = TotalBillAmount + Tip;
						PerPerson = TotalBillAmount;
						TipPerPerson = Tip;
						System.out.println("Number of people entered:" +people);
						System.out.println("Total to pay:" +TotalBillAmount);
						System.out.println("Total tip:" +Tip);
						System.out.println("Total per person:" +PerPerson);
						System.out.println("Total per person:" +TipPerPerson);	
					}
					break;
					
				case "Fair":
					if (split.equalsIgnoreCase("yes")) {
					Tip = TotalBillAmount * 0.10;
					TotalBillAmount = TotalBillAmount + Tip;
					PerPerson = TotalBillAmount/NumberOfPeople;
					TipPerPerson = Tip/NumberOfPeople;
					System.out.println("Number of people entered:" +people);
					System.out.println("Total to pay:" + TotalBillAmount);
					System.out.println("Total tip:" +Tip);
					System.out.println("Total per person:" +PerPerson);
					System.out.println("Total per person:" +TipPerPerson);
					}else {
						Tip = TotalBillAmount * 0.10;
						TotalBillAmount = TotalBillAmount + Tip;
						PerPerson = TotalBillAmount;
						TipPerPerson = Tip;
						System.out.println("Number of people entered:" +people);
						System.out.println("Total to pay:" + TotalBillAmount);
						System.out.println("Total tip:" +Tip);
						System.out.println("Total per person:" +PerPerson);
						System.out.println("Total per person:" +TipPerPerson);
					}
					break;
					
				case "Good":
					if (split.equalsIgnoreCase("yes")) {
					Tip = TotalBillAmount * 0.15;
					TotalBillAmount = TotalBillAmount + Tip;
					PerPerson = TotalBillAmount/NumberOfPeople;
					TipPerPerson = Tip/NumberOfPeople;
					System.out.println("Number of people entered:" +people);
					System.out.println("Total to pay:" + TotalBillAmount);
					System.out.println("Total tip:" +Tip);
					System.out.println("Total per person:" +PerPerson);
					System.out.println("Total per person:" +TipPerPerson);
					}else {
						Tip = TotalBillAmount * 0.15;
						TotalBillAmount = TotalBillAmount + Tip;
						PerPerson = TotalBillAmount;
						TipPerPerson = Tip;
						System.out.println("Number of people entered:" +people);
						System.out.println("Total to pay:" + TotalBillAmount);
						System.out.println("Total tip:" +Tip);
						System.out.println("Total per person:" +PerPerson);
						System.out.println("Total per person:" +TipPerPerson);
					}
					break;
					
				case "Great":	
					if (split.equalsIgnoreCase("yes")) {
					Tip = TotalBillAmount * 0.20;
					TotalBillAmount = TotalBillAmount + Tip;
					PerPerson = TotalBillAmount/NumberOfPeople;
					TipPerPerson = Tip/NumberOfPeople;
					System.out.println("Number of people entered:" +people);
					System.out.println("Total to pay:" + TotalBillAmount);
					System.out.println("Total tip:" +Tip);
					System.out.println("Total per person:" +PerPerson);
					System.out.println("Total per person:" +TipPerPerson);
					}else {
						Tip = TotalBillAmount * 0.20;
						TotalBillAmount = TotalBillAmount + Tip;
						PerPerson = TotalBillAmount;
						TipPerPerson = Tip;
						System.out.println("Number of people entered:" +people);
						System.out.println("Total to pay:" + TotalBillAmount);
						System.out.println("Total tip:" +Tip);
						System.out.println("Total per person:" +PerPerson);
						System.out.println("Total per person:" +TipPerPerson);
					}
					break;
					
				case "Excellent":
					if (split.equalsIgnoreCase("yes")) {
					Tip = TotalBillAmount * 0.25;
					TotalBillAmount = TotalBillAmount + Tip;
					PerPerson = TotalBillAmount/NumberOfPeople;
					TipPerPerson = Tip/NumberOfPeople;
					System.out.println("Number of people entered:" +people);
					System.out.println("Total to pay:" + TotalBillAmount);
					System.out.println("Total tip:" +Tip);
					System.out.println("Total per person:" +PerPerson);
					System.out.println("Total per person:" +TipPerPerson);
					}else {
						Tip = TotalBillAmount * 0.25;
						TotalBillAmount = TotalBillAmount + Tip;
						PerPerson = TotalBillAmount;
						TipPerPerson = Tip;
						System.out.println("Number of people entered:" +people);
						System.out.println("Total to pay:" + TotalBillAmount);
						System.out.println("Total tip:" +Tip);
						System.out.println("Total per person:" +PerPerson);
						System.out.println("Total per person:" +TipPerPerson);	
					}
					break;
			    default:
						System.out.println("Invalid service selected: " );
						break;
	       
	     }
	        
	         
	     
		
		

	}

}
