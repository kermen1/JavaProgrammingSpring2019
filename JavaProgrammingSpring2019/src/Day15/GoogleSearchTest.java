package Day15;

public class GoogleSearchTest {

	public static void main(String[] args) {
		String iteam = "java";
		String pageTitlle = iteam +" - Google Search";
		//test if pageTitlle srtarts with item
		
		if(pageTitlle.startsWith(iteam)) {
			System.out.println("PASS: Page title check passed");
		}else {
			System.out.println("FAIL: Page title check failed");
		}
		
		if(pageTitlle.endsWith("Google Search")) {
			System.out.println("PASS: Google title check passed");
		}else {
			System.out.println("FAIL:Google title check failed");
		}
		
		
		
		
		
		
		

	}

}
