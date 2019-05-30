package Day47_bloks;

public class AllBlocks {
	int nonStaticInt = 10;
	static int staticInt = 10;
	
  static {
	  System.out.println("Static block - I run girst and only once");
	  staticInt--;
  }
  
  {
	  System.out.println("INIT BLOCK - i RUN EACH TIME OBJECT IS CREATED. Before construtor");
	  nonStaticInt+=5;
	  staticInt +=5;
  }
  
  public AllBlocks() {
	  System.out.println("CONSTRACTOR - I run each time object is created. after init block");
	  nonStaticInt+=3;
	  staticInt+=3;
  }
}
