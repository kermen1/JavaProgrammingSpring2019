package homework;

public class repl161 {

	public static void main(String[] args) {
		 waterTax(55);

	}

	
	public static double waterTax(double units)
	  {
	    double bill = 0.0;
	    
	    //your code here
	    if(units<=50){
	    bill = units* 0.60;
	    System.out.println(bill);
	    return bill;
	    }else if(units>50){
	      bill = units*0.90;
	      System.out.println(bill);
	      return bill;
	    }else if(units>=101){
	      bill = units*0.90+50;
	      System.out.println(bill);
	      return bill;
	    }else if(units>150){
	      bill = units*0.90+100;
	      System.out.println(bill);
	      return bill;
	    }
	    
	    
	    
	    //end your code here
	    
	    
	    return bill;
	  }//end waterTax
	  
	      
}
