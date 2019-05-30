package Day49_02;
import Day49.*;
//IPad IS-A Device. IOad is a subclass in a different package
public class IPad extends Device{
	public void readEBook(String title) {
		System.out.println("Reading  a book "+ title+ " using "
	+ brand +" tablet");
		System.out.println("Model - "+model);
	//	System.out.println("Price: "+price);  not inherited, not visible
	}

}
