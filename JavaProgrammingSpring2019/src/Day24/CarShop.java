package Day24;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// BMW,Audi,Ford,Honda,Mercedes,Mercury,Rolls-Royce,Tesla
       //1.Step create on an array of strings, and store there cars inside that array
		
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
	//	String[] cars2 = new String[8];
		//2.Step:Print car names that starts with M
		
		  for(String c: cars) {
		         if(!c.startsWith("M")) {
		             continue;
		         }
		         System.out.println(c);
		     }
		  System.out.println("******************************************");
		  //3.Step Print all cars that have letter "r" someWhere in the name
		 //Please make your search case insensitive
		  for (String car: cars) 
			{
				if (car.toLowerCase().contains("r")) 
				{
					System.out.println(car);
				}
			}
		  System.out.println("******************************************");
		  //4.Step.Print car name with ends with "a"
		  for (String car1: cars) 
			{
				if (car1.endsWith("a")) 
				{
					System.out.println(car1);
				}
			}
		  System.out.println("******************************************");
		  //5.Step Print all cars that have at list 6 letters
		  
		  for (int j=0;j<cars.length;j++) 
			{
			  String car2 = cars[j];
				if (car2.length()>=6) 
				{
					System.out.println(car2);
				}
			}
		  System.out.println("******************************************");
		  
		  String swap = cars[0];
	        cars[0] = cars[cars.length - 1];
	        cars[cars.length - 1] = swap;
	        System.out.println(Arrays.toString(cars));
		  
	}

}
