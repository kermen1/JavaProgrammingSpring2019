package MentoringSession;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithScanner1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String str = scan.nextLine();
		    
		    String[] arrStr = str.split(",");
             Arrays.sort(arrStr);
             String d = "";
     		
     		//System.out.println(Arrays.deepToString(values));
				
				int min = arrStr[0].length();
				
		for(int i = 0;i<arrStr.length;i++) {
			if(arrStr[i].length() < min) {
					min = arrStr[i].length();
					d += arrStr[i]+" ";
					System.out.println(d); 
				}
				
				}
     		
	
				
		

	}

}
