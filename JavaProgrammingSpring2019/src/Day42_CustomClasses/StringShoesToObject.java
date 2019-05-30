package Day42_CustomClasses;

import java.util.Scanner;

public class StringShoesToObject {
	public static void main(String[] args) {
		String data = "Bruno Magli,9.5";
		
		// split using , and store into array
				String [] arrData =data.split(",");
				// create shoe object
				shoes shoes = new shoes();
				shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
				System.out.println(shoes.getShoesData());
				
				Scanner scan = new Scanner(System.in);
				System.out.println("What shoes brand?");
				String brand = scan.next();
				System.out.println("What is your size?");
				double size = scan.nextDouble();
				//create object using data from scanner
				
				shoes myShoes = new shoes();
				myShoes.setShoesData(brand, size);
				System.out.println(myShoes.getShoesData());
		
		
	}

}
