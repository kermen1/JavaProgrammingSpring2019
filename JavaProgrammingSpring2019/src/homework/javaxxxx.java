package homework;

import java.util.Scanner;

public class javaxxxx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int countcat = 0;
		  int countdog = 0;

		  if( str.length() >= 3){
		  for( int i = 0 ; i < str.length()-2 ; i++){
		  if ( str.substring(i,i+3).equals("cat"))
		  countcat = countcat + 1;
		  }


		  for( int j = 0 ; j < str.length()-2 ; j++){
		  if ( str.substring(j,j+3).equals("dog"))
		  countdog = countdog + 1;
		  }}

		  if (countdog == countcat ) {
			  System.out.println("true");
		  }else {
			  System.out.println("false");
		  }
		 

		
		
		
	//	String word = "java";
		//String unique = "";
		
		//char ch = word.charAt(0);
		
	//	System.out.println(unique.contains(""+ch));

	}

}
