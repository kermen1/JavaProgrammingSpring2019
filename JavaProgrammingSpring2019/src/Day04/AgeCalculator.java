package Day04;

public class AgeCalculator{
	public static void main(String[] args) {
		// Declare variable yearOfBirth and assign some year
		int yearOfBirth = 1989;
		
		
		//Declare variable currentYear and assign 2019
		int currentYear = 2019;
		
		//Declare variable  age and calculate  the age and
		
		//assing result to it
		int age = currentYear - yearOfBirth;
		
		// Print: if you are born in <year>
		// Then you are <> years old
		
		
		System.out.println("If you are born in " +yearOfBirth);
		System.out.println("Then you are "+age+" years old.");
	}

}
