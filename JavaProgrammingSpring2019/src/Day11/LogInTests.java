package Day11;
import java.util.*;
public class LogInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String username, password;
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		// username == validUsername
		// password = password
		// print "Login Successful, Welcome!
		// 2) username != validUsername
		// password != password
		//print " Invalid Username and Invalid Password
		//3) username == validUsername
		//    password != password
		//    print " Invalid Password"
		// 4)username != validUsername
		//   password == password
		//   print " Invalid Username"
		
		System.out.println("Enter login:"); 
		username = s.next();
		System.out.println("Enter password:"); 
		password = s.next();
		
		
		if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful, Welcome!");
			
		}else if(!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Username and Invalid Password");
			
		}else if(username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid Password");
			
		}else if(!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
			
		}
		
		
		
		
		
		
		

	}

}
