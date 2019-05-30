package Day42_CustomClasses;

public class myCoffees {

	public static void main(String[] args) {
		Coffe coffee1 = new Coffe();
		coffee1.name = "ICED CARAMEL MACCHIATO";
		coffee1.size = "GRANDE";
		coffee1.price = 4.75;
		coffee1.calories = 250;
		coffee1.getCoffeInfo();

		Coffe coffee2 = new Coffe();
		coffee2.setName("Java chip");
		coffee2.size = "venti";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		coffee2.getCoffeInfo();


		Coffe coffee3 = new Coffe();
		coffee3.setName("ICED COFFEE"); //coffee3.name = "ICED COFFEE";
		coffee3.setSize("TALL");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		System.out.println("coffee3 name:" + coffee3.name);
		coffee3.getCoffeInfo();
		
		Coffe coffee4 = new Coffe();
		//coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeInfo();

	}

}
