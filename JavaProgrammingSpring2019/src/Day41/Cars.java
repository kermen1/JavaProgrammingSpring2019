package Day41;

public class Cars {

	public static void main(String[] args) {
		myCars car1 = new myCars();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		car1.drive();
		System.out.println("before: "+ car1.currentSpeed);
		car1.accelerate(20);
		System.out.println("after: "+ car1.currentSpeed);

		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.showPrice();
		
		BMW bmw2 = new BMW();
		System.out.println(bmw2.make);
		bmw2.model = "GH";
		bmw2.showPrice();
		
		
	} 
	

}
