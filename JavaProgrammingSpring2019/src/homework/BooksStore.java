package homework;

import java.util.Scanner;

public class BooksStore {

	public static void main(String[] args) {
		int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
	    int freeBook = 0;
	    
	    if(isPremiumCustomer==true) {
	    	if(nbooksPurchased>=7) {
	    		freeBook = freeBook+2;
	    	}else if(nbooksPurchased >= 5){
	    		freeBook = freeBook+1;
	    	}
	    }else{
	    	if(nbooksPurchased >= 12) {
	    		freeBook = freeBook+2;
	    	}else if(nbooksPurchased >= 7){
	    		freeBook = freeBook+1;
	    	}
	    }
	    System.out.println(freeBook);

	}

}
