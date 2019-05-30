package Day53;

public class TestHiding {
  public static void main(String[] args) {
	  City city = new  City(345, "London");
	  Capital cap = new Capital(433, "Paris", 53232435L);
	  
	  System.out.println(city.count);
	  System.out.println(cap.count);
	  
	  System.out.println(city.toString());
	  System.out.println(cap.toString());
	  
	  cap.displayCount();
	  
	  city.buildARoad();
	  cap.buildARoad();
	  
	  City.buildARoad();
	  Capital.buildARoad();
	  
	  
	  City city2 = new  City(3422, "FairFax");
	  Capital capital2 = new Capital(6544, "Richmond", 5325867435L);
	  
	  city2.letsBuildARoad();
	  capital2.letsBuildARoad();
	  
  }
}
