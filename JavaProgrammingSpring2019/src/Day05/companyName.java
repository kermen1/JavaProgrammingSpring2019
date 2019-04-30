package Day05;

public class companyName {
	public static void main(String[] args) {
	
	String companyName= "Facebook";
	String address = "Silicon Valley, CA";
	int numberOfEmployees = 10000;
	long  revenue = 4000000L;
	boolean istechCompany = true;
	
	System.out.println("Company Name is " +companyName);
	System.out.println("Address is " +address);
	System.out.println("Number of employees is " +numberOfEmployees);
	System.out.println("Annual revenue is " +revenue);
	System.out.println("Is it a tech company? -" +istechCompany);
	
	
	//System.out.println(numberOfEmployees + istechCompany); will not work
	
	
	//System.out.println(companyName +numberOfEmployees );
	
	String aboutCompany = "Company "+companyName+" is located in "+address+ "\n and "+numberOfEmployees+ "work for it.";
	
	System.out.println(aboutCompany);
	
	
	
	}
	

}
