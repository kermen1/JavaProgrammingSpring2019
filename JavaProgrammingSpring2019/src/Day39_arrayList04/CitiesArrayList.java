package Day39_arrayList04;

import java.util.ArrayList;

public class CitiesArrayList {

	public static void main(String[] args) {
     ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        
        for(String s : cities) {
        	System.out.print(s+"|");
        }
        System.out.println();
        for(int i=0;i<cities.size();i++) {
        	System.out.print(cities.get(i)+"|");
        }
        System.out.println();
        
        //ToString Print each City all upper case
        
        System.out.println(cities.toString().toUpperCase());

        for(String s : cities) {
        	System.out.print(s.toUpperCase()+"|");
        }
        
        // Make each city all upper case
        
       String paris = cities.get(0).toUpperCase();
        System.out.println(paris);
        
        cities.set(0, paris);
        System.out.println(cities.get(0));
        
        cities.set(1, cities.get(1).toUpperCase());
        
        for(int j = 0; j< cities.size(); j++) {
        	String city = cities.get(j).toUpperCase();
        	cities.set(j,  city);
        }
        
        System.out.println(cities.toString());
        
        
        //Find the longest and shortest cities
        
        String longestCity="";String shorterstCity="";
        
      
      
        		for (String city: cities ) {
        			if(city.length()>longestCity.length()) {
        				longestCity = city;
        			}
        		}
        		System.out.println(longestCity);
        		
        		shorterstCity = cities.get(0);
        		for (String city: cities ) {
        			if(city.length()<shorterstCity.length()) {
        				shorterstCity = city;
        			}
        		}
        		System.out.println(shorterstCity);
        		
        		
        		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
        		
        		//assign all cities that have more than 6 chars to this arrayList
        		
        		for(String ct : cities) {
        			if( ct.length()>6) {
        				citiesMoreThan6.add(ct);	
        			}
        		}
        		
        		System.out.println(citiesMoreThan6);
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        
        
	}

}
