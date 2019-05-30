package homework;

public class repl164 {

	public static void main(String[] args) {
		at3("Kermen", "loo");
		wordCount("ggdyg gyfgd hfuh");
		biggerS("kermen","aleksandrina");
		System.out.println(simpleRoomBook1(true,5, 2, 2018));
	}
	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
	    if(isAvailable==true && month>=1 || month<=12 && year==2018){
	     
	     if(month==7 && day>=1 || day<=7){
	      return false;
	    }
	      return true;
	    }
	    	return false;
	    
	    
	  }public static boolean simpleRoomBook1(boolean isAvailable,int month, int day, int year) {
		  if(isAvailable== false){
			     return false;
			   }else {
				   return true;
			   }
		  
			  
}
	  public static String limit(String text, int maxLength)
	  {
	    String result ="";
	   
	      result = text.substring(0,maxLength+1);
	      System.out.println(result);
		return result;
	    
	  
	  }
	  public static String at3(String target,String word)
	  {
	    String result ="";
	    
	    result = target.substring(0, 3)+ word + 
	    target.substring(3,target.length());
	    System.out.println(result);
	    
	    return result;
	    
 
	    
	    
	  }  
	  public static int wordCount(String words) {
	         

	        int count = 0;
	        for(int i = 0; i < words.length(); i++){
	            if(words.charAt(i) != ' '){
	                count++;
	                while(words.charAt(i) != ' ' && i < words.length()-1){
	                    i++;
	                }
	            }
	        }
	        System.out.println(count);
	        return count;
	    }
	      
	  public static String biggerS(String a ,String b)
	  {
		  int m = a.length(); 
	        int n = b.length(); 
	        String result="";
	        if(m>n) {
	        	result = a;
	        	System.out.println(result);
	        }else if(m<n) {
	        	result = b;
	        	System.out.println(result);
	        }
	        
	      return result;
	    }
	  
	  
}























