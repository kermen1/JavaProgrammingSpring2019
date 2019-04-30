package MentoringSession;

import java.util.Arrays;
import java.util.Scanner;

public class replaseWithScan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String[] str = {scan.next(), scan.next(), scan.next(), 
                 scan.next(), scan.next(), scan.next()};
		
		//System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		String d="";
		int min = str[0].length();
		
		for(int i = 0;i<str.length;i++) {
		if(str[i].length() < min) {
			min = str[i].length();
			d = str[i];
			//System.out.println(d); 
		}
		
		}
		 
		System.out.println(""+d);
		
	}

}
