package Day09;
import java.util.*;
public class AgeSenior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seniorCitizens, nonSeniorCitizens, age;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
	     seniorCitizens = scan.nextInt();
	     nonSeniorCitizens = scan.nextInt();
	     
	     System.out.println("What is new citizen's age?");
	     age = scan.nextInt(); 
	     
	    if(age >= 65){
	      System.out.println("Senior Citizen");
	      seniorCitizens++;
	    }else{
	      System.out.println("Non-Senior Citizen");
	      nonSeniorCitizens++;
	    }
		
		
		
		
		
		
		
		

	}

}
