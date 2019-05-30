package OfficeHours;

public class People {
    String hardToGet = "Nursultan";
    static String easyToGet = "Muhthar";
    
    public void sayMyName() {
    	System.out.println(hardToGet);
    	// non static method can call static variable
    	 System.out.println(easyToGet);
    }
     public static void whatMyName() {
    	 System.out.println(easyToGet);
    	 //next line will throw error because
     }
}
