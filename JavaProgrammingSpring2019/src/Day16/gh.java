package Day16;
import java.util.Scanner;
public class gh {

	public static void main(String[] args) {
		
		/**
		 * 
		 * group10_ITitans
		 * Fair, Good, Great, or Excellent all result in 10% tip (in the code multiplied by .10 - should be different)
		 * Program is not accounting for negative case with 0 ppl
		 * Program handle 0 bill amount by asking if it is correct entry! Good
		 * 
		 * 
		 */
		
				 Scanner scan = new Scanner(System.in);
				   System.out.println("Split?");
				   String split = scan.nextLine();
				   while (!(split.equalsIgnoreCase("Yes") || split.equalsIgnoreCase("No"))) {
					   System.out.println("'Yes' or 'No' please.");
					   split = scan.nextLine();
				   }
				   int number = 1;
				   if (split.equalsIgnoreCase("Yes")) {
				   System.out.println("Number of people:");
				   number = scan.nextInt();
				   if (number <=0) {
					   System.out.println("One of you will have to pay for it.");
				   	   number = 1; }
				   if (number >10) {
					   System.out.println("Sorry, our credit card machine is broken, can only split it between 10:(");
				       number = 10;}
				   }
				   System.out.println("Check amount:");
				   double amount = scan.nextDouble();
				   while (amount>50000 || amount<=0) {
					   System.out.println("Are you sure this is your check amount? Try again:");
					   amount = scan.nextDouble();
				   }
				   System.out.println("Service Quality:");
				   scan.nextLine();
				   String service = scan.nextLine();
				   while (!(service.equalsIgnoreCase("Poor") || service.equalsIgnoreCase("Fair") || service.equalsIgnoreCase("Good") ||
				   		  service.equalsIgnoreCase("Great") || service.equalsIgnoreCase("Excellent"))) {
					   System.out.println("'Poor', 'Fair', 'Good', 'Great' or 'Excellent'?");
					   service = scan.nextLine();
				   } 
				   service = service.toUpperCase();
				   double tip=0;
				   switch (service) {
				    case "POOR":
				      tip = amount*5/100;
				      break;
				    case "FAIR":
				      tip = amount*10/100;
				      break;
				    case "GOOD":
				      tip = amount*15/100;
				      break;
				    case "GREAT":
				      tip = amount*20/100;
				      break;
				    case "EXCELLENT":
				      tip = amount*25/100;
				      break;
				  } 
				   String people = "";
				   int i = 1;
				   while (i<=number) {
					   people += "&";
					   i++;
				   }
				    System.out.println("Number of people entered:" + people);
				    double total = amount + tip;
				    double perPerson = total/number;
				    double tipPerPerson = tip/number;
				   	System.out.printf("Total to pay: %.2f\n", total);
				    System.out.printf("Total tip: %.2f\n", tip);

				  if (split.equalsIgnoreCase("yes") && number>1)
				    System.out.printf("Total per person: %.2f\n", perPerson);
				    
				  if (split.equalsIgnoreCase("yes") && number>1)
				    System.out.printf("Tip per person: %.2f\n", tipPerPerson);

				  }

				

	}


