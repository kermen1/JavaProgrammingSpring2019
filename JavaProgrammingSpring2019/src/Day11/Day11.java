package Day11;
import java.util.*;
public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
		    
          System.out.println("what is the farthest planet in the solar system:" );
		  System.out.println("a)venus" );
		  System.out.println("b)pluto" );
		  System.out.println("c)neptune" );
		    
		  String a = s.nextLine();
		    
		    //your code here
		    String b, c;
		
		    if(a == "a"){
		  System.out.println(a + " is wrong");
				       
		}else if(a == "b"){
		  System.out.println(a + " is correct");
				     
		 }else if(a == "c"){
		  System.out.println(a + " is wrong");
				     
		 }else{
			 
		  System.out.println(" is not a valid answer");
		
		
		
		 }

	}

}
