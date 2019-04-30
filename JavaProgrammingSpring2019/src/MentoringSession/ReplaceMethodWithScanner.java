package MentoringSession;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceMethodWithScanner {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    int i,j = 0;
	    for(i=0 ;i<=rows-1;i++)
	    {
	      for(j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    int max = Integer.MIN_VALUE;
	      for(int n=0; n<rows; n++){
	          for(int k =0; k<cols; k++){
	                    if(max<arr[n][k]){
	                        max = arr[n][k];
	                    }
	          }
	   //  int max= arr[i][0];
	      //    if(max<arr[i][j]){

	       //       max= arr[i][j];
	        //          }
              }
	      System.out.println(max);
          System.out.println();
	}
}
