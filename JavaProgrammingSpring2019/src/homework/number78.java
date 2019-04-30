package homework;
import java.util.Scanner;
public class number78 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		    double premium = 0;
		    int age;
	        int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			
			System.out.println("Welcome to the CountyFarm car insurance!");
			System.out.println("Enter your name");	
	    	name = scan.nextLine();
	    	
	    	System.out.println("Do you have a US driver license?");
	    		String license = scan.next();
	    		
	    		if(license.equals("no")||license.equals("No")){
	    		  
	    		   System.out.println("Invalid data!");
	    		   System.exit(0);
	    		}
		
		System.out.println("Enter your zip code");
        int zip = scan.nextInt();
        if(zip==20910 || zip==20740) {
            premium +=60;
            
    }else if(zip == 22102 || zip==22103) {
       premium +=30;
    }else {
        premium +=50;
    }

      System.out.println("Is this vehicle Owned, Financed, or Leased?");
vehicleOwnership = scan.next();
if(vehicleOwnership.equals("owned")) {
    premium+=10;
    
}else{
    premium+=20;
}
System.out.println("How is this vehicle primarily used?");
vehicleUsage = scan.next();
if(vehicleUsage.equals("Business")) {
    premium+=50;
}else if(vehicleUsage.equals("pleasure")) {
    premium+=10;
}else if (vehicleUsage.equals("Commute")) {
    premium+=20;
    System.out.println("Days Driven To Work/Or School");
    daysDrivenToWorkOrSchool = scan.nextInt();
  premium += daysDrivenToWorkOrSchool*5;
  
    System.out.println("Miles Driven To Work And/Or School");
    milesToWorkOrSchool = scan.nextInt();
    premium += milesToWorkOrSchool;
    
}



System.out.println("How old are you?");
age = scan.nextInt();
if(age<16) {
    System.out.println("Invalid data!");
    return;
}else if(age>16 && age<18) {
    premium  = premium *20;
    
}else if(age>=18 && age<=21) {
    premium  = premium *6;
}else if(age>21 && age<25) {
    premium  = premium *2;
}
System.out.println("What is your driving experience?");
int drivingExperience = scan.nextInt();

if(drivingExperience==0 || age - drivingExperience<16) {
System.out.println("Invalid data!");
System.exit(0);
}else {
System.out.println("Have you had any accidents in last 5 years?");
String accidents = scan.next();
if(accidents.equals("Yes")|| accidents.equals("YES") ) {
  System.out.println("How many?");
  accidentsAmount =scan.nextInt();
  premium+=premium*accidentsAmount*0.2;
}
System.out.println("Have you had continuous insurance for the past 12 months?");
continuousInsurance = scan.next();
    if(continuousInsurance.equals("no")|| continuousInsurance.equals("NO")) {
  premium*=2;
   }
    System.out.println("What is the highest level of education you have completed?");
    education = scan.next();
   if(education.equals("PhD")||education.equals("Bachelors") || education.equals("Masters")) {
  premium*=0.95;
 }else if(education.equals("Doctors")) {
  premium*=0.9;
 }else if(education.equals("Less than High School")) {
  premium*=1.05;
  
   }
   referenceNumber = name.substring(0,1).toUpperCase()+age+name.substring(name.length()-2,name.length()-1).toUpperCase()+zip+education.toUpperCase();

	}

	}
}
