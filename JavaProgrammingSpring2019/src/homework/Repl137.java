package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Repl137 {

	public static void main(String[] args) {
		
		  Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++){
		      for(int j=0 ;j<=cols-1;j++){
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rows
		    
		   int max =0; //Integer.MIN_VALUE;
			int maxIndex = 0;
			for(int s=0;s<arr.length;s++) {
			for(int j = 0;j<arr[s].length;j++) {
			if(arr[s][j]> max) {
				max = arr[s][j];
				maxIndex = j;
				arr[s][j]= max;
			}}
			}
			for(int d=0;d<arr.length;d++) {
				for(int g=0; g<arr[d].length;g++) {
					arr[d][g]= max;
				}
			}
			
		
		    
		    
		    
		    //FINAL PRINT
		    System.out.println(Arrays.deepToString(arr));
	       
	    } 
		   
	  

}
