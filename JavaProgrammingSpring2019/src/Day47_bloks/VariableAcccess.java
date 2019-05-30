package Day47_bloks;

public class VariableAcccess {
	//instance variable 
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVariable=55;
	

	public static void main(String[] args) {
		 // cannot access s non-static method 
		//System.out.println(myInstanceVar);
		
		System.out.println(myStaticVariable);
		
		//create object of VariableAccess and print myInstanceVar
		
		VariableAcccess v = new VariableAcccess();
		System.out.println(v.myStaticVariable);
		//access static variable using  object
		System.out.println(v.myInstanceVar);
		//access static  variable sing classmate
		System.out.println(VariableAcccess.myStaticVariable);
		
		
		

	}

}
