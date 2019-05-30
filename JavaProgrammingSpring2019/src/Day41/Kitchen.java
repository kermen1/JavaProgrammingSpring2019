package Day41;

public class Kitchen {

	public static void main(String[] args) {
		Microwave mic = new Microwave();
		mic.brand = "LG";
		mic.turnOn();
		mic.heat("pizza");
		mic.turnOff();

	}

}
