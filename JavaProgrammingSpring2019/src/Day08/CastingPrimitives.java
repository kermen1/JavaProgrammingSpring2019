package Day08;

public class CastingPrimitives {

	public static void main(String[] args) {
		// cast double value to int
		int i = (int)3.4;// will remuve .4
		System.out.println("i:" + i);
		
		double price = 230.50;
		int dollars = (int)price;
		
		System.out.println("Price:" + price);
		
		System.out.println("Dollars:" + dollars);
		//Wnole numbers. byte,short,int 
		
		int count = 2244;
		byte byteCount = (byte) count;
		
		System.out.println("Byte count :" + byteCount);
		
		long longValue = 345545565L;
		int intValue = (int)longValue;
		
		System.out.println("Int Value :" + intValue);
		
		int large = 5678;
		short small = (short) large;
		System.out.println("Small :" + small);
		      //250     250    250.2
		int result = (int)(500.4 / 2.0);
		System.out.println("Result :" + result);
		
		
		
		
		
		
	}

}
