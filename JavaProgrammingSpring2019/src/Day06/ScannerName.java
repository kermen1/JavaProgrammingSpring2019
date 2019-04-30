package Day06;

import java.util.Scanner;

public class ScannerName {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi, what is your name?");
		
		String name = scan.next();//accept String input
		
		System.out.println("Nice to meet you, " +name);

	}

}
