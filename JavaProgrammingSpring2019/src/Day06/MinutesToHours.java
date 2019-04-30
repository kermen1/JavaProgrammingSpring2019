package Day06;

public class MinutesToHours {

	public static void main(String[] args) {
		// declare a int variable minutes
		
		int minutes = 130;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println(hours);
		System.out.println(remainingMinutes);
		
		
		// "5 hours and 10 minutes"
		
		
		System.out.println(minutes + " minutes is ");
		System.out.println(hours + " hours and "+remainingMinutes+" minutes");
		
		minutes = 3456;
		
		
		

	}

}
