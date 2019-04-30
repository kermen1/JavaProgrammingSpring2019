package Day16;
import java.util.*;
public class Url {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 //ensure that it starts with www.
		 //check it contains the ending dot ending dot before the extension
		 //print domain name and String extension.
		 //print them
		 //"domain:" amazon
		 //
		 System.out.println("Enter url: ");
		 String url = scan.next();
		 
		 if(url.startsWith("www.")) {
			    System.out.println("www. is present");
			}else {
				System.out.println("Invalid url format");
				return;
			}
		 
		 //check . is there right before extension
		 
		int dotIndex = url.length()-4;
		// url.lastIndexOf(".");
		
		if(url.charAt(dotIndex) == '.'){
			System.out.println(".args is there before extension");
		}else {
			System.out.println(". might be misplaced");
		}
		
		/*if (url.charAt(url.lendth()-4) == '.'){
		 
		 */
		//get domain and extension
		//ww.yahoo.com
		
		String domain = url.substring(4,dotIndex);
		System.out.println("Domain:"+domain);
		String extension = url.substring(dotIndex+1, url.length());
		System.out.println("Extension: "+extension);
		
		 
		 
		 
		 

	}

}
