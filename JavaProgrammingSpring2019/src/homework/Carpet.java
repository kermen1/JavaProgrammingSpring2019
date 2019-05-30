package homework;

public class Carpet {
	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	 
	 //Add constructors below
	  
	  public Carpet(){
		  
		 
		  
			  
				 if(isPersian==false){
				    this.unitPrice=0;
				    this.totalPrice = 200;
				 }
				  
			 
		  
	    
	  }
	   public Carpet(double width,double length, double unitPrice,boolean isPersian){
		   this.width = width;
		   this.length = length;
		 this.unitPrice =  unitPrice;
		   this.isPersian=isPersian;
		   if(isPersian==false) {
			   totalPrice = (width+length)*2;
		   }else {
			   totalPrice = (width+length)*2 +200;  
		   }
		   
	   }
}
