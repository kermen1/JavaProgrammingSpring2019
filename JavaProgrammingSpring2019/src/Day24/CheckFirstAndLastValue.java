package Day24;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		// write a program that will print true
		//if first and last value in the array of ints
		//are same - print true
		
		int[] numbers = {12,41,213,21,42,12};
		//,length <- it is not a method, its a instance variable(propety)
		boolean equals = numbers[0] ==numbers[numbers.length-1];
		System.out.println(equals);
		if(numbers[0]==numbers[numbers.length-1]) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
