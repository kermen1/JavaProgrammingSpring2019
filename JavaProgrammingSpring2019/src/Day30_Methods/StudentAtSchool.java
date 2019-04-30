package Day30_Methods;

public class StudentAtSchool {
	public static void main(String[] args) {
		study("HTML");
		study("SQL");
		sleep(8);

	}public static void study(String topic) {
		
	     System.out.println("student is studying "+topic);

	}public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours");
	}

}
