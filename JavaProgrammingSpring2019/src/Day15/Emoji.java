package Day15;

public class Emoji {

	public static void main(String[] args) {
		String emoji = ":(";
		
		// ==, !=, CHECK IF IT NOT 2 CHARS
		
		if(emoji.length() != 2) {
			System.out.println("Invalid emoji");
			return;//stop execution
		}
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') {
			if(second == ')') {
		
			System.out.println("Smile");
			}else if(second == '(') {
				System.out.println("Sad");
			}else if(second == '/') {
				System.out.println("Upset");
			}else if(second == 'p') {
				System.out.println("Playful");
			}else {
				System.out.println("Unknow emoji");
			}
			
		}else if(first == ';') {
			if(second == ')') {
				System.out.println("Wink");
			}else if(second == '0') {
				System.out.println("kiss");
			}else {
				System.out.println("Unknow emoji");
			
			}
		
			
			
		}else if(first == '(') {
			if(second == ':') {
				System.out.println("Smile");
			}else {
				System.out.println("Unknow emoji");
			}
		
			
		}else if(first == ')') {
			if(second == ':') {
				System.out.println("Sad");
			}else {
				System.out.println("Unknow emoji");
			}
				
		}else {
			System.out.println("Invalid emoji");
		}

		
		
			
		
	}

	}

