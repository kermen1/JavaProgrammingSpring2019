package homework;

import java.util.Arrays;
import java.util.Scanner;

public class repl122 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    boolean keepGoing = true;
		    int[] arrayCopy = inhabitants;
		    int j = 1;
           while( keepGoing) {
		        for (int i = 0; i < inhabitants.length; i++) {

		           
		                arrayCopy[i] = inhabitants[i] / 2;
		                
		            }

		        

               System.out.print("Day " + j +" ");
		      
				inhabitants = arrayCopy;
		       System.out.println(Arrays.toString(inhabitants));

		        j++;

		        int counter = 0;
		        for (int element : inhabitants) {
		            counter = counter + element;
		        }

		        if (counter == 0) {
		            keepGoing = false;
		        }
		    
           }
        System.out.println("---- EXTINCT ----");
	}

}
