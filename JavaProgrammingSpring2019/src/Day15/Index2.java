package Day15;

public class Index2 {

	public static void main(String[] args) {
		// index of with 2 inputs
		String list = "html-selenium-angular-lenkins-grid";
		
		int firstDash = list.indexOf("-");
		
		System.out.println("First Dash: "+firstDash);
		
		int secondDash = list.indexOf("-", 5);
		
		System.out.println("Second Dash: "+secondDash);
		
		
		int thirdDash = list.indexOf("-", secondDash+1);
		
		System.out.println("Third Dash: "+thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last Dash: "+lastDash);
		
		
		
		

	}

}
