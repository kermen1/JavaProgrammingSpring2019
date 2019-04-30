package homework;

public class repl160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} public boolean hamletQuote(boolean toBe,boolean notToBe)
	  {
	     if(toBe == true && notToBe == false){
	       return true;
	     } else if(toBe == false && notToBe == true){
	       return true;
	     } else if(toBe == true && notToBe == true){
	       return true;
	       
	     } else if(toBe == false && notToBe == false){
	       
	       return false;
	     }
		return notToBe;
	  }
	public String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
	    
	   if(buyPrice<sellPrice){
	     return "profit";
	   }else if(buyPrice>sellPrice){
	     return "loss";
	   }else if(buyPrice==sellPrice){
	     return "no loss";
	   
	   }
	return "profit";
	   
	  }
}
