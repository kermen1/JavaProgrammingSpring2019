package Day30_Methods;

import java.util.Scanner;
public class MethodName {

	public static void main(String[] args) {
		
		introduce();
		
		
		
		

	}	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, "+name);
	}

}
