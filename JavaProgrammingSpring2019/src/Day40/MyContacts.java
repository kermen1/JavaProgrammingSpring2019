package Day40;

public class MyContacts {

	public static void main(String[] args) {
	
		//create Contact object
		
		contact  contact1 = new contact();
		contact1.name = "Kermen Kursinova";
		contact1.phoneNumber = "(703) 975-6211";
		contact1.email = "Kermenkurs@gmail.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
		contact  contact2 = new contact();
		contact2.name = "Orhan Sultanov";
		contact2.phoneNumber = "(571) 991-3322";
		contact2.email = "orhan@google.com";
		
		System.out.println("Name: "+contact2.name);
		System.out.println("PhoneNumber: "+contact2.phoneNumber);
		System.out.println("Email: "+contact2.email);
		
		contact2.call();
		contact2.sendMessage();
		contact2.sendEmail();
		

	}

}
