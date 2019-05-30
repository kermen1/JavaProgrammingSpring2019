package Day40;

public class contact {
    String name;
    String phoneNumber;
    String email;
    public void call() {
    	System.out.println("Calling "+ name + "......");
    }
   public void sendMessage() {
	   System.out.println("Send message "+ phoneNumber + " | name "+name +"......");
   }
   public void sendEmail() {
	   System.out.println("Sending email to "+ email + "......");
   }
}
