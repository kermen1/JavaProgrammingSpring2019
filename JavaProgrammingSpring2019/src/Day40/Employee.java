package Day40;

public class Employee {
    public String name;
    public String jobTitle;
     double salary;
     
     public void work() {
    	 System.out.println(name + " is working hard");
     }
     public void goToBreak() {
    	 System.out.println();
     }
     public void attendMeeting() {
    	 System.out.println(name + " is attending a meeting....");
     }
     
     public void introduce() {
    	 System.out.println("Name ["+name+"], jobTitle ["+jobTitle+
    			 "], salary ["+salary+ "]");
     }
     
     
     
}
