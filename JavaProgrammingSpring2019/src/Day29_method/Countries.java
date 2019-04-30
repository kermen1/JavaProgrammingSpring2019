package Day29_method;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		String[][] city ={ {"USA","Washington DC"},
				{"Canada", 	"Ottawa"},
				{"Mexico","Mexico city"},
				{"Brasil","Brasilia"},
				{"Peru", "Lima"},
				{"Argentina", "Boanes Aeros"},
				{"Bolivia","La Paz"},
				{"Macedonia","Scopia"},
				{"Kazakhstann","Nursultan"}};
		
		//String[][] c = new String[9][2];
		//c[0][0] = "USA";
		
		System.out.println(city[0][0]+" | "+city[0][1]);
		System.out.println(city[8][0]+" | "+city[8][1]);
         System.out.println(Arrays.deepToString(city));
         
         //print all the countries in the same line separad by |
         String result="";
         for(int i = 0 ; i<city.length; i++) {
        	//result= result + city[i][0] + "|";
        	 System.out.print(city[i][0]+"|");
         }
         System.out.println();
       //  System.out.println(result);
        // 2)for each  loop
         for(String[] country:city) {
        	 System.out.print(country[0]+"|");
         }
         //get all the cities and add to cities arrays
         System.out.println();
         String[] c = new String[city.length];
         //null means no object. it is not same as empty string
         System.out.println(Arrays.toString(c));
         
         
         for(String[] cities: city) {
        	 System.out.print(cities[1]+"|");
         }
         
         //Look for Bolivia in the countriesArr and test if 
         //capital city is "La Paz"
         System.out.println();
         
         for(int row=0; row<city.length; row++) {
        	 if(city[row][0].equals("Bolivia")) {
        		 //System.out.println(city[row][1]);
        		 if(city[row][1].equals("La Paz")) {
        			 
        			 System.out.println("Bolivia test passed");
        			 
        		 }else {
        			 System.out.println("Bolivia test failed");
        		 }
        		 break;
        	 }
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
	}

}
