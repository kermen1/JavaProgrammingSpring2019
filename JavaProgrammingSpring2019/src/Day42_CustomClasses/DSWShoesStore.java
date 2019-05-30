package Day42_CustomClasses;
import java.util.*;
public class DSWShoesStore {

	public static void main(String[] args) {
		shoes shoes1 = new shoes();
		shoes1.setShoesData("ALDO", 6.5);
		System.out.println(shoes1.getShoesData());
		
		shoes shoes2 = new shoes();
		shoes2.setShoesData("Allen Edmonds", 7.5);
			
		shoes shoes3 = new shoes();
		shoes3.setShoesData("BOSS HUGO BOSS", 9.0);
			
		shoes[] shoesArray = new shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		//ArrayList of Shoes
		ArrayList<shoes> myShoes = new ArrayList<>();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());
		
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		
		shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getShoesData()) ;
		
		//Break till 3:37 pm
		//print name of Shoes in the list that size is more than 7
				for(shoes shoes : myShoes) {
					if(shoes.size > 7.0) {
						System.out.println(shoes.brand);
					}
		
		
		

				}}

}
