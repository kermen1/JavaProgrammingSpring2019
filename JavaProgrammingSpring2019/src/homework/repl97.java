package homework;

import java.util.Scanner;

public class repl97 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
			int count =0;
			
			int countcat = 0;
			  int countdog = 0;

			  if( str.length() >= 4){
			  for( int i = 0 ; i < str.length()-3 ; i++){
			  if ( str.substring(i,i+4).equals("java"))
			  countcat = countcat + 1;
			  }


			  for( int j = 0 ; j < str.length()-5 ; j++){
			  if ( str.substring(j,j+6).equals("python"))
			  countdog = countdog + 1;
			  }}

			  if (countdog == countcat ) {
				  System.out.println("true");
			  }else {
				  System.out.println("false");
			  }
			 

		    
		    
		    
		    
		    
		    

	}

}
