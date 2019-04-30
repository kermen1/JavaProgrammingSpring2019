package Day31;

public class Authentication {

	public static void main(String[] args) {
		/*
		 * Name :Login
		 * return type: void
		 * 2 String args/params: username, password
		 * Inside the method:
		 * validUsername = "mentoring@cyberSchool.com"
		 * validPassword = "mentor001"
		 * 
		 * 
		 * if username and password match, print "Login Successful! Welcome to Okta"
	      * if not: "Sign in failed!"
		 */
		
		
		login("mentoring@cyberSchool.com","mentor001");
		
		
		
		
		

	}public static void login(String userName,String password) {
		String validUsername = "mentoring@cyberSchool.com";
		String validPassword = "mentor001";
		
		if(userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful! Welcome to Okta");
		}else {
			System.out.println("Sign in failed!");
		}
		
		
		
		
		
	}

}
