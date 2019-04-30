package MentoringSession;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithScan {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	     
        
        int decimal = input.nextInt();
        int[] binaryNum  = new int[8];
        
    
        int temp = 0;
    
        
      
        for (int i = binaryNum.length-1; i >= 0; i--) {
        	 temp= decimal % 2; 
             decimal = decimal / 2; 
             binaryNum[i] = temp;  
        }
        System.out.println(Arrays.toString(binaryNum));
	
       
		
       
		
		
		
		
		

	}

}
