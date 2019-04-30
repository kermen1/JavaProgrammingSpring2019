package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Repl134Chessboard {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		    int result = 0;
		    int n = 3;
		     int d1 = 0, d2 = 0; 
		       
		        for (int i = 0; i < n; i++) 
		        { 
		            for (int j = 0; j < n; j++) 
		            { 
		                
		                if (i == j) 
		                    d1 += matrix[i][j]; 
		       
		                
		                if (i == n - j - 1) 
		                    d2 += matrix[i][j]; 
		            } 
		        } 
		        
		        
		    result = d1 - d2;
		    
		    
		    
		    // FINAL PRINT
		    System.out.println(Math.abs(result));
	}

}
