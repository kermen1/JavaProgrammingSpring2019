package Day49;

public class Leopard extends Animal{
  public Leopard() {
	  super();// call parent class no
	  System.out.println("Leopard constructor");
	  setType("Leopard");
	  
  }
  public Leopard(String type) {
	  
	 super(type);// call Animal (String type) construtor
	 System.out.println("Leopard one - arg constructor");
  }
}
