package Day13;
import java.util.*;
public class laptop {

	public static void main(String[] args) {
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
		Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE
    int memory;
    String screen;
    double total;
    
    System.out.println("Select screen size:");
    screenType = scan.next();
    if(screenType.equals("13.3")){
      price = 200.0;
     
    }else if(screenType.equals("15.0")){
      price = 300.0;
      
    }else if(screenType.equals("17.3")){
      price = 400.0;
      
    }
    System.out.println("Select CPU type:");
    cpu = scan.next();
    if(cpu.equals("i3")){
      price = price + 150.0;
      
    }else if(cpu.equalsIgnoreCase("i5")){
      price = price + 250.0;
      
    }else if(cpu.equalsIgnoreCase("i7")){
      price = price + 350.0;
      
    }
    
    System.out.println("Select RAM size:");
    ram = scan.nextInt();
    if(ram == 4){
      price = price + 50.0;
      
    }else if(ram == 8){
      price = price + 100.0;
      
    }else if(ram == 12){
      price = price + 150.0;
      
    }else if(ram == 16){
      price = price + 200.0;
    }
    
    
    System.out.println("Select storage type:");
    storageType = scan.next();
    
    if(storageType.equals("HDD")){
    	
      System.out.println("Enter memory size:");
      
       memory = scan.nextInt();
       
      if(memory == 500){
        
        price = price + 50.0;
        
      }else if(memory == 1000){
        price = price + 100.0;
        
      }else if(memory == 1500) {
    	  price = price + 150.0;
           
      }else if(memory == 2000){
        price = price + 200.0;
      }
    
      
    }else if(storageType.equals("SSD")){
      
      System.out.println("Enter memory size:");
          memory = scan.nextInt();
       if(memory == 500){
        
        price = price + 100.0;
        
      }else if(memory == 1000){
        price = price + 200.0;
        
      }else if(memory == 1500) {
    	  price = price + 300.0;
           
      }else if(memory == 2000){
        price = price + 400.0;
    
    }
    
    }
    System.out.println("Enter screen resolution:");
    screen = scan.next();
    if(screen.equals("FULLHD")){
      
      price = price + 100.0;
      
    }else if(screen.equals("4K")){
    	
      price = price + 200.0;
      
    }
    
    
    
    
    
    
    System.out.println("Laptop price is: $" +price);
    
    
    
    
    

	}

}
