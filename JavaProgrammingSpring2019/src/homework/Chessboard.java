package homework;

import java.util.Arrays;

public class Chessboard {

	public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	    
	    for (int i = 0; i < 8; i++) {
	        for (int j = 0; j < 8; j++) {
	            System.out.print(chessBoard[i][j] + " ");
	        }
	        System.out.println();
	    }
	
	

	    
	    
	    
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));

	}

}
