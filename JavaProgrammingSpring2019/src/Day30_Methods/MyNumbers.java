package Day30_Methods;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void main(String[] args) {
		showMe5Numbers();
		doPush10Up() ;
		rangePrint();
	}public static void showMe5Numbers(){
		Random r = new Random();
		
		for(int s=0;s<=5;s++) {
			System.out.print(r.nextInt(1001) + ", ");
		}
		
	}public static void doPush10Up() {
		for(int k=0;k<=10;k++) {
			System.out.println("Pushup - "+ k);
			if(k==10) {
				System.out.println("Time to rest!");
			}
		}
	}public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer first number:");
		int first = scan.nextInt();
		System.out.println("Enter second number:");
		int last = scan.nextInt();
		if(first<last) {
		for(int s=first; s<last+1;s++) {
			
		System.out.print(s+" ");
		}
		}else if(first>last) {
			for(int k = first;k>=last;k--) {
				System.out.print(k+" ");
			}
		}
	}

}
