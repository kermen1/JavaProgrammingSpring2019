package Day46_Static_keyword;

public class CalTest {

	public static void main(String[] args) {
		double result = Calculator.plus(55,7);
		System.out.println("result: "+result);
		
		Calculator c = new Calculator();
		System.out.println(c.multyplay(4, 2));
		
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));

	}

}
