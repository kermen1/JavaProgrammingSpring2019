package Day20;

import java.util.Scanner;

public class Zombi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int day = 0;
	    
	    while(inhabitants > 0) {
	    	
			System.out.println("Day"+day+" ["+inhabitants+"]");
			
			inhabitants = inhabitants/2;
			day= day+1;
			
	    	}
	    
	    System.out.println("---- EXTINCT ----");
	    
	    
	    
	    
	    
	    
	}

}
