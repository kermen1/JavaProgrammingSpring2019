package Day17;
import java.util.*;
public class homeworkJAJA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    
			int end = email.indexOf('_');
			String codeCount = email.substring(0,end);
			String s1 = codeCount.substring(0,1).toUpperCase()+codeCount.substring(1);
			String Last = email.substring(end+1,email.indexOf('@'));
			//String s2 = Last.substring(end+1,end+2).toUpperCase()+Last.substring(end+2);
			//System.out.println("First name: " +s2);
			
			
			
			int dotIndex = email.length()-4;
	    
	    String extension = email.substring(dotIndex+1, email.length());
	    
	    System.out.println("First name: " +s1);
	    System.out.println("Last name: " +email.substring(end+1,email.indexOf('@')));
	    System.out.println("Domain: " +email.substring(email.indexOf('@')+1,email.indexOf('.')));
	    System.out.println("Top-Level Domain: " +extension);

	}

}
