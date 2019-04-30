package Day14;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good Morning";
		// check if it matches "Good Morning" and print match
		// or Not match
		if(str1.equals("Good Morning")) 
		
		
		if(str1.equalsIgnoreCase("Good Morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
			
		
		}
		
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println(str1);
		
		//combine the above methods together:
		//cover to all lowecase first then check if it  equals("good morning")
		
		
		
		    // godd morning ==> good morning
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods:do not match");
		}
		
		// FIND OUT HOW MANY CHARACTERS IN THE STRING
		
		String myName = "Kermen";
			
			System.out.println(myName.length());
		
			int length = myName.length();
			
			System.out.println("My name is length " +length);
			
			//usernames must be exactly 8 characters.
			//set some value and  using a if statement
			
			String userName = "Kursinov";
			
			
			if(userName.length() == 8) {
				System.out.println("Valid username");
			}else {
				System.out.println("Invalid username, must be 8 chars");
			}
		
			System.out.println(userName.length());
			
			
			
			//password must be at least 6 characters
		
		    String password = "woodenSpoon";
		    
		    if(password.length() >= 6) {
				System.out.println("Good password");
			}else {
				System.out.println(" password is too short");
			}
		    
		    int passwordLength = password.length();
		    if(passwordLength < 6) {
		    	System.out.println("Too short");
		    }else {
		    	System.out.println("Good password");
		    }
		    
		
	}

}
