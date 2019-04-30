package homework;

import java.util.Arrays;
import java.util.Scanner;

public class zombi {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    
		    
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    boolean keepGoing = true;

		    int day = 0;
		    System.out.print("Day " + day +" ");
		    System.out.println(Arrays.toString(inhabitants));
		    day = 1;
		    int[] arrayCopy = Arrays.copyOf(inhabitants, inhabitants.length);
		    
		    
		    
		    while (keepGoing) {

		        

		        
		        int num1 = 0;
		        
		        for(int i=0; i <inhabitants.length;i++) {
		        	num1+=inhabitants[i];
		        }
		        
		        if(num1==0) {
		            break;
		        }
		        
		        
		      int temp1=inhabitants[0];
		        
		        
		      int templast = inhabitants[inhabitants.length-1];
		        
		       if(inhabitants[1]==0) {
		    	   
		    	   temp1=temp1/2;
		    	   
		       }
		        
		        if(inhabitants[inhabitants.length-2]==0) {
		        	templast = templast/2;
		        }
		        for(int j=1;j<inhabitants.length-1;j++) {
		        	
		            if (inhabitants[j-1]==0 || inhabitants[j+1]==0) {
		            	
		                arrayCopy[j] = inhabitants[j] / 2;
		                
		            }

		        }

		        
		        for(int j=1;j<inhabitants.length;j++) {
		        	inhabitants[j] = arrayCopy[j];
		        }
		        
		        
		        
		        
		        
		        
		        inhabitants[0] = temp1;
		        inhabitants[inhabitants.length-1]= templast;
		        
		        
		        System.out.print("Day " + day +" ");
			    System.out.println(Arrays.toString(inhabitants));
		        
			    day++;
		        
		           
		        }

		
		        System.out.println("---- EXTINCT ----");
		        
		        
		    }

	              

	

}
