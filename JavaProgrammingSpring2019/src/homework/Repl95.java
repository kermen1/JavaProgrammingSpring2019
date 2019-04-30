package homework;

import java.util.Scanner;

public class Repl95 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int countjam = 0;
		  int countbread = 0;
          int countbutter = 0;
          
          
          
		 
		  for( int i = 0 ; i < str.length()-4 ; i++){
		  if ( str.substring(i,i+5).equals("bread"))
		  countjam = countjam + 1;
		  }


		  for( int j = 0 ; j < str.length()-2 ; j++){
		  if ( str.substring(j,j+3).equals("jam"))
			  countbread = countbread + 1;
		  }
		  for(int u = 0 ; u < str.length()-5; u++) {
			  if ( str.substring(u,u+6).equals("butter"))
				  countbutter = countbutter + 1;  
		  }
		  System.out.println(countjam);
		  System.out.println(countbread);
		  System.out.println(countbutter);

		  if (countbread == 2 && countjam == 1 && countbutter == 0 ) {
			  System.out.println("jam");
		 }else if(countbread == 2 && countjam == 0 && countbutter == 1 ){
			  System.out.println("butter");
		  }else {
			  System.out.println("nothing");
		  }

	}

}
