package Day13;

public class MoreTernary {

	public static void main(String[] args) {
		
		String quality = "bad";
		int rating = (quality.contentEquals("good")) ? 100: 0;
		
		System.out.println("Rating "+rating);
		
		
		int PMhour = 6;
		//Rush hour during evening: 4-7
		
		boolean rushHour = (PMhour >= 4 && PMhour <= 7 ) ? true: false;
		
		System.out.println("Rush Hour is "+rushHour);
		// rushHour ==> true - yes
		// rushHour ==> false - no
		String result = rushHour==true ? "yes": "no";
		System.out.println("Rush Hour is "+result);
		
		
		int ANHour = 8; 
		// 6-9 amRushHour - yes , no
		String amRushHour = ANHour >=6 && ANHour <= 9 ? "yes" : "no";
		
		
				System.out.println("Rush Hour is "+amRushHour);
		
		
		

	}

}
