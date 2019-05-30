package Day49;
//Tv is child/sub class in the same package
public class TV extends Device {
	public void watch() {
		System.out.println("Watching TV - "+ brand+" model: "+model);
		System.out.println("Price: "+price);
		//System.out.println("Made in: "+ country); not visible
	}

}
