package Day12;

public class OrLogicWithSwitch {

	public static void main(String[] args) {
		char grade = 'D';
		// A,B,C -> Pass     D,E -> Fail    Invalid grDE
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("Fail");
			break;
			
		default:
			System.out.println("Invalid grade!");
			break;
		}

	}

}
