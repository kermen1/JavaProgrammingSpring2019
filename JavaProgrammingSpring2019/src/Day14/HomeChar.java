package Day14;
import java.util.*;
public class HomeChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    
	    
	    int wordL = word.length()%2;
	    
	    if(wordL == 0) {
					System.out.println(word.charAt(word.length()/2 - 1)+(word.length()/2));
		}else if(wordL == 1){
					System.out.println(word.charAt(word.length()/2));
		}//else if(word.length() == 1){
				//  System.out.println(word.charAt(0)*3);
		//}//else if(word.length() == 2){
				 // System.out.println(word+word);
			//	}
			    

	}

}
