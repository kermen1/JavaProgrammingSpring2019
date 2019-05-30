package Day49_02;
import Day49.Device;
//NOn - sub class in different package
public class OverSeasFactory {

	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
		//dv.model = "3200"; not visible 
		//dv.price = 1000; not visible
		//dv.country = "El-Salvador";not visible

	}

}
