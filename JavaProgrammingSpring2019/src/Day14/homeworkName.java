package Day14;
import java.util.*;
public class homeworkName {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 
		    System.out.println("Enter full name:");
		    
		    String fullName = scan.next();
		    
		    if (fullName.equalsIgnoreCase("max payne")){
		      System.out.println("User found!");
		    }else if(fullName.equalsIgnoreCase("alan wake")){
		      System.out.println("User found!");
		    }else{
		      System.out.println("User not found!");
		    }
		      

	}

}
