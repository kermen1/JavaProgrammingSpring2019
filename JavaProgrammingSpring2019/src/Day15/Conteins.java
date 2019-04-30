package Day15;

public class Conteins {

	public static void main(String[] args) {
		
		String email = "test@gmail.com";
		
		System.out.println(email.contains("@"));
		
		String list = "potatoes, apples, tomatoes, eggs, milk, cereals, meat";
		
		if(list.contains("apples")) {
			System.out.println("Appels are there!");
		}else {
			System.out.println("Lets add appels now!");
		}
		
		boolean hasEggs = list.contains("eggs");
		
		System.out.println("Contains eggs: "+hasEggs);
		
		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
		
		
		System.out.println("Contains cucumbers: "+hasCucumbers);
		
		
		email = "name@yahoo.com";
		
		if(email.contains("yahoo")) {
			System.out.println("Yahoo account");
		}else if(email.contains("gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else{
			System.out.println("Pipe is not detected");
		}
		
		String name = "Kermen";
		if(name.contains("e") || name.contains("a")) {
			System.out.println("'a' or 'e' is present");
		}else{
			System.out.println("'a' or 'e' is not present");
		}
		
		String str = " | ";
		//If(etsyTitle.contains(str))
		
		

	}

}
