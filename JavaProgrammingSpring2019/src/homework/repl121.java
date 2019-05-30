package homework;

import java.util.Arrays;
import java.util.Scanner;

public class repl121 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    String[] arrStr = str.split(", ");
		    
		    	//	Arrays.sort(arrStr);
				String d="";
				int min = arrStr[0].length();
				
				for(int i = 0;i<arrStr.length;i++) {
				if(arrStr[i].length() < min) {
					min = arrStr[i].length();
				//	d += arrStr[i]+" ";
				//	System.out.println("["+d+"]"); 
				}
				
				}
				
				for(int i =0; i<arrStr.length;i++){
				  if(arrStr[i].length() == min){
				    d= d+arrStr[i]+",";
				   // System.out.println(d);
				  }
				}
			//	System.out.println(d);
				String[] w = d.split(",");
				System.out.println(Arrays.toString(w));
				 
			//	System.out.println(d);

	}

}
