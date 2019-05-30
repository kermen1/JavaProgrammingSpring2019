package Day46_Static_keyword;

public class Campus {
     private String city;
      static String county;
      static {
    	  System.out.println("static block-1");
    	  county = "USA";
      }
      static {
	  System.out.println("static block -2");
	  county = "Canada";
  }
  
      public Campus(String city) {
    	  System.out.println("Constructor");
    	  this.city = city;
      }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
      public static void campusInfo() {
    	  System.out.println("Welcome to campus");
      }
      
      
      
}
